package types;

import java.util.List;

import definitions.CapabilityDefinition;
import definitions.PropertiesDefinition;
import definitions.RequirementDefinition;
import main.DerivedFrom;
import main.InstanceState;
import main.Interface;
import main.Tag;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "NodeType")
public class NodeType {
    // mandatory
    String name;

    // optional
    String targetNamespace;
    List<Tag> tags;
    DerivedFrom derivedFrom;
    PropertiesDefinition propertiesDefinition;
    List<RequirementDefinition> requirementDefinitions;
    List<CapabilityDefinition> capabilityDefinitions;
    List<InstanceState> instanceStates;
    List<Interface> toscaInterfaces;
    String documentation;

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    @XmlAttribute(name = "targetNamespace")
    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    @XmlElementWrapper(name = "Tags", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Tag", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DerivedFrom getDerivedFrom() {
        return this.derivedFrom;
    }

    @XmlElement(name = "DerivedFrom", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setDerivedFrom(DerivedFrom derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    public PropertiesDefinition getPropertiesDefinition() {
        return this.propertiesDefinition;
    }

    @XmlElement(name = "PropertiesDefinition", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPropertiesDefinition(PropertiesDefinition propertiesDefinition) {
        this.propertiesDefinition = propertiesDefinition;
    }

    public List<RequirementDefinition> getRequirementDefinitions() {
        return this.requirementDefinitions;
    }

    @XmlElementWrapper(name = "RequirementDefinitions", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "RequirementDefinition", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRequirementDefinitions(List<RequirementDefinition> requirementDefinitions) {
        this.requirementDefinitions = requirementDefinitions;
    }

    public List<CapabilityDefinition> getCapabilityDefinitions() {
        return this.capabilityDefinitions;
    }

    @XmlElementWrapper(name = "CapabilityDefinitions", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "CapabilityDefinition", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setCapabilityDefinitions(List<CapabilityDefinition> capabilityDefinitions) {
        this.capabilityDefinitions = capabilityDefinitions;
    }

    public List<InstanceState> getInstanceStates() {
        return this.instanceStates;
    }

    @XmlElementWrapper(name = "InstanceStates", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "InstanceState", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setInstanceStates(List<InstanceState> instanceStates) {
        this.instanceStates = instanceStates;
    }

    public List<Interface> getInterfaces() {
        return this.toscaInterfaces;
    }

    @XmlElementWrapper(name = "Interfaces", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Interface", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setInterfaces(List<Interface> toscaInterfaces) {
        this.toscaInterfaces = toscaInterfaces;
    }

    public String getDocumentation() {
        return this.documentation;
    }

    @XmlElement(name = "documentation", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}
