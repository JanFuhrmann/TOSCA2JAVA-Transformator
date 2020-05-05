import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import definitions.CapabilityDefinition;
import definitions.RequirementDefinition;
import main.*;
import templates.*;
import types.NodeType;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // this file specifies the location of the extracted CSAR
    // IMPORTANT: CHANGE THIS TO YOUR DESTINATION
    public static String file = "C://FileOfProjectDestination";
    // this file specifies the location of the Service Template
    // IMPORTANT: CHANGE THIS TO THE LOCATION OF THE SERVICE TEMPLATE
    public static String fileServiceTemplate = file + "//Definitions//ServiceTemplate.tosca";
    // this is the export file for the java classes
    public static File fileJava = new File(file + "//JAVA");
    // this list saves all Node Types of the specific Service Template
    public static List<NodeType> allNodeTypes = new ArrayList<>();

    public static void main(String[] args) throws JAXBException, IOException {
        // if not exists, create new file for Java output
        fileJava.mkdir();
        // create a new instance of JAXBContent to map xml on java
        JAXBContext jaxbContext = JAXBContext.newInstance(Definitions.class);
        // use the JAXBUnmarshaller for mapping
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        // map the definition of the Service Template on the specific java file
        Definitions definition = (Definitions) jaxbUnmarshaller.unmarshal(new File(fileServiceTemplate));
        // extract the service template and map every component on a single Java file
        readServiceTemplate(definition.getServiceTemplate().getTopologyTemplate());

        // create a single Java class from a specific node type
        // createJavaFileFromNodeType(definition.getNodeType(),definition.getNodeType().getName(),fileJava+"//");
    }

    /**
     * Read the XML-File and extract the NodeTemplates and RelationshipTemplates
     * to generate a single Java-Class for every NodeType-Object
     *
     * @param topologyTemplate The TopologyTemplate of the intitial Definitions Object
     */
    public static void readServiceTemplate(TopologyTemplate topologyTemplate) throws JAXBException, IOException {
        // Get all node and relationship templates of the topology template and save them in a list
        List<NodeTemplate> nodeTemplates = topologyTemplate.getNodeTemplates();
        List<RelationshipTemplate> relationshipTemplates = topologyTemplate.getRelationshipTemplates();
        // Iterate over all NodeTemplates and extract relevant informations
        for (int i = 0; i < 2; i++) {
            for (NodeTemplate nodeTemplate : nodeTemplates) {
                List<RelationshipTemplate> relForNode = new ArrayList<>();
                // Add relevant relationships to generate methods for every NodeType-Object
                for (RelationshipTemplate relationshipTemplate : relationshipTemplates) {
                    if (relationshipTemplate.getSourceElement().getTypeRef().equals(nodeTemplate.getId())) {
                        relForNode.add(relationshipTemplate);
                    }
                }
                // create a new instance of JAXBContent to map xml on java
                JAXBContext jaxbContext = JAXBContext.newInstance(Definitions.class);
                // use the JAXBUnmarshaller for mapping
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                // Replace every : with __ to match the right filename
                String fileName = nodeTemplate.getType().replace(":", "__") + ".tosca";
                Definitions definition = (Definitions) jaxbUnmarshaller.unmarshal(new File(file + "//Definitions//" + fileName));
                if (i == 0) {
                    // in first loop add every NodeType to the global list, because such a list is needed to create all Requirements
                    allNodeTypes.add(definition.getNodeType());
                } else if (i == 1) {
                    // in second loop create a Node Type class and a specific Node Template class
                    createJavaFileFromNodeType(definition.getNodeType(), nodeTemplate.getId(), relForNode, fileJava + "//");
                }
            }
        }
    }

    /**
     * Generate a single Java-Class-File for every NodeType
     *
     * @param nodeType   the specific NodeType
     * @param templateId the id of the NodeTemplate to match relationships
     * @param directory  where the Java-Class will be saved
     */
    public static void createJavaFileFromNodeType(NodeType nodeType, String templateId, List<RelationshipTemplate> relationships, String directory) throws IOException {
        templateId = templateId.replace("-", "_").substring(0, 1).toUpperCase() + templateId.replace("-", "_").substring(1);    // _ produces problems with Java Files

        // define the JAVA output file
        File outputFile = new File(directory + templateId + ".java");
        // if not exists, create new file for JAVA output
        PrintWriter writer = new PrintWriter(outputFile, StandardCharsets.UTF_8);
        Field[] fields = nodeType.getClass().getDeclaredFields();

        StringBuilder arguments = new StringBuilder(), methods = new StringBuilder(), imports = new StringBuilder();
        // Add the JNodeTemplate (abstract) import
        imports.append("import templates.JNodeTemplate;\n");

        for (Field field : fields) {
            // Add a single import for every package that needs to be included
            String importType = field.getType().getName();
            if (importType.contains(".") && !importType.contains("java.lang") && !imports.toString().contains(importType))
                imports.append("import ").append(importType).append(";\n");

            String fieldType = field.getType().getSimpleName();
            String fieldName = field.getName();
            String fieldModification = Modifier.toString(field.getModifiers());
            String identifierName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            methods.append("\t" + "private " + fieldType + " get" + identifierName + "(){\n\t\treturn " + fieldName + ";\n\t}\n");
            methods.append("\t" + "private void set" + identifierName + "(" + fieldType + " " + fieldName + "){\n\t\tthis." + fieldName + " = " + fieldName + ";\n\t}\n");

            switch (fieldName) {
                case "name":
                    arguments.append("\t" + fieldModification + fieldType + " " + fieldName + " = \"" + nodeType.getName() + "\";\n");
                    break;
                case "targetNamespace":
                    arguments.append("\t" + fieldModification + fieldType + " " + fieldName + " = \"" + nodeType.getTargetNamespace() + "\";\n");
                    break;
                default:
                    arguments.append("\t" + fieldModification + fieldType + " " + fieldName + " = null;\n");
            }
        }
        writer.println(imports);
        if (nodeType.getDocumentation() != null) {
            writer.println("/**\n* " + nodeType.getDocumentation() + "\n**/");
        }
        writer.println("public class " + templateId + " extends JNodeTemplate {");
        writer.print(arguments + "\n");
        writer.println(writeOperations(nodeType));
        writer.println(writeRelations(relationships));
        writer.println(writeRequirements(nodeType));
        writer.println(methods);
        writer.println("}");
        writer.close();
        System.out.println("JAVA-Klasse für NodeType " + nodeType.getName() + " erfolgreich erstellt!");
    }

    /**
     * Iterates over all Requirements of the specific NodeType-Object and checks every Requirement
     * for matching Capabilities in all other NodeTypes
     *
     * @param nodeType the specific NodeType
     * @return the string with all requirements as Java methods
     */
    private static String writeRequirements(NodeType nodeType) {
        StringBuilder reqs = new StringBuilder();
        if (nodeType.getRequirementDefinitions() != null) {
            for (RequirementDefinition req : nodeType.getRequirementDefinitions()) {
                for (NodeType nt : allNodeTypes) {
                    if (nt.getCapabilityDefinitions() != null) {
                        for (CapabilityDefinition capabilityDefinition : nt.getCapabilityDefinitions()) {
                            if (capabilityDefinition.getCapabilityType().getName().equals(req.getRequirementType().getRequiredCapabilityType().getName())) {
                                reqs.append("\tpublic void deployOn(").append(nt.getName().replace(".", "_").replace("-", "_")).append(" host){}\n");
                            }
                        }
                    }
                }
            }
        }
        return reqs.toString();
    }

    /**
     * Iterates over all Interfaces and Operations of the NodeType-Object and generates a Java method for each one
     *
     * @param nodeType the specific NodeType
     * @return the string with all operations as Java methods
     */
    private static String writeOperations(NodeType nodeType) {
        StringBuilder operations = new StringBuilder();
        if (nodeType.getInterfaces() != null) {
            for (Interface in : nodeType.getInterfaces()) {
                for (Operation op : in.getOperation()) {
                    String iparams = "";
                    String oparams = "void";
                    String returnParam = "";
                    if (op.getInputParameters() != null) {
                        for (IOParameter input : op.getInputParameters()) {
                            String inputType = input.getType().split("xsd:")[1].substring(0, 1).toUpperCase() + input.getType().split("xsd:")[1].substring(1);
                            iparams += inputType + " " + input.getName().substring(0, 1).toLowerCase() + input.getName().substring(1) + ", ";
                        }
                        iparams = iparams.substring(0, iparams.length() - 2);
                    }
                    if (op.getOutputParameters() != null) {
                        for (IOParameter output : op.getOutputParameters()) {
                            oparams = output.getType().split("xsd:")[1].substring(0, 1).toUpperCase() + output.getType().split("xsd:")[1].substring(1);
                            returnParam = "return \"" + output.getName().substring(0, 1).toLowerCase() + output.getName().substring(1) + "\";";
                        }
                    }
                    operations.append( "\tpublic " + oparams + " " + op.getName() + "(" + iparams + "){" + returnParam + "}\n");
                }
            }
        }
        return operations.toString();
    }

    /**
     * Iterates over all Relationships of the NodeType-Object and generates a Java method for each one
     *
     * @param relationships all relationships between the current NodeType and other NodeTypes
     * @return the string with all relations as Java methods
     */
    private static String writeRelations(List<RelationshipTemplate> relationships) {
        String relations = "";
        if (relationships != null) {
            for (RelationshipTemplate r : relationships) {
                String relType = r.getType().split(":")[1];
                String target = r.getTargetElement().getTypeRef().replace("-", "_").substring(0, 1).toUpperCase() + r.getTargetElement().getTypeRef().replace("-", "_").substring(1);
                relations += "\t/*\n\t* Connection " + r.getId() + "\n\t*/\n";
                String modifiedType;
                switch (relType) {
                    case "HostedOn":
                        modifiedType = "hostOn";
                        break;
                    case "DependsOn":
                        modifiedType = "addDependency";
                        break;
                    case "ConnectsTo":
                        modifiedType = "connectToDatabase";
                        break;
                    case "MosquittoConnectsTo":
                        modifiedType = "getMosquittoConnection";
                        break;
                    default:
                        modifiedType = "unknownConnection";
                }
                relations += "\tpublic void " + modifiedType + "(" + target + " instance){}\n";
            }
        }
        return relations;
    }

}
