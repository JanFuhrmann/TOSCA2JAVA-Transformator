package main;

import java.util.List;

import implementations.NodeTypeImplementation;
import implementations.RelationshipTypeImplementation;
import templates.ArtifactTemplate;
import templates.PolicyTemplate;
import templates.ServiceTemplate;
import types.ArtifactType;
import types.NodeType;
import types.PolicyType;
import types.RelationshipType;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Definitions", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
public class Definitions {
    // mandatory
    String id;
    String targetNamespace;
    // Types ?
    ServiceTemplate serviceTemplate;
    NodeType nodeType;
    NodeTypeImplementation nodeTypeImplementation;
    RelationshipType relationshipType;
    RelationshipTypeImplementation relationshipTypeImplementation;
    String requirementType;
    String capabilityType;
    ArtifactType artifactType;
    ArtifactTemplate artifactTemplate;
    PolicyType policyType;
    PolicyTemplate policyTemplate;

    // optional
    String name;
    List<Import> toscaImport;
    List<Extension> extensions;
    String documentation;

    public String getId() {
        return this.id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    @XmlAttribute(name = "targetNamespace")
    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public ServiceTemplate getServiceTemplate() {
        return this.serviceTemplate;
    }

    @XmlElement(name = "ServiceTemplate", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setServiceTemplate(ServiceTemplate serviceTemplate) {
        this.serviceTemplate = serviceTemplate;
    }

    public NodeType getNodeType() {
        return this.nodeType;
    }

    @XmlElement(name = "NodeType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public NodeTypeImplementation getNodeTypeImplementation() {
        return this.nodeTypeImplementation;
    }

    @XmlElement(name = "NodeTypeImplementation", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setNodeTypeImplementation(NodeTypeImplementation nodeTypeImplementation) {
        this.nodeTypeImplementation = nodeTypeImplementation;
    }

    public RelationshipType getRelationshipType() {
        return this.relationshipType;
    }

    @XmlElement(name = "RelationshipType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public RelationshipTypeImplementation getRelationshipTypeImplementation() {
        return this.relationshipTypeImplementation;
    }

    @XmlElement(name = "RelationshipTypeImplementation", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRelationshipTypeImplementation(RelationshipTypeImplementation relationshipTypeImplementation) {
        this.relationshipTypeImplementation = relationshipTypeImplementation;
    }

    public String getRequirementType() {
        return requirementType;
    }

    @XmlElement(name = "RequirementType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public String getCapabilityType() {
        return capabilityType;
    }

    @XmlElement(name = "CapabilityType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setCapabilityType(String capabilityType) {
        this.capabilityType = capabilityType;
    }

    public ArtifactType getArtifactType() {
        return this.artifactType;
    }

    @XmlElement(name = "ArtifactType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
    }

    public ArtifactTemplate getArtifactTemplate() {
        return this.artifactTemplate;
    }

    @XmlElement(name = "ArtifactTemplate", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setArtifactTemplate(ArtifactTemplate artifactTemplate) {
        this.artifactTemplate = artifactTemplate;
    }

    public PolicyType getPolicyType() {
        return policyType;
    }

    @XmlElement(name = "PolicyType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    public PolicyTemplate getPolicyTemplate() {
        return policyTemplate;
    }

    @XmlElement(name = "PolicyTemplate", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPolicyTemplate(PolicyTemplate policyTemplate) {
        this.policyTemplate = policyTemplate;
    }

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<Import> getToscaImport() {
        return this.toscaImport;
    }

    @XmlElement(name = "Import", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setToscaImport(List<Import> toscaImport) {
        this.toscaImport = toscaImport;
    }

    public List<Extension> getExtensions() {
        return this.extensions;
    }

    @XmlElementWrapper(name = "Extensions", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Extension", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public String getDocumentation() {
        return this.documentation;
    }

    @XmlAttribute(name = "documentation")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}
