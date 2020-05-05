package types;

import definitions.PropertiesDefinition;
import main.DerivedFrom;
import main.Tag;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RequirementType")
public class RequirementType {
    // mandatory
    String name;
    String targetNamespace;

    // optional
    CapabilityType requiredCapabilityType;
    List<Tag> tags;
    DerivedFrom derivedFrom;
    PropertiesDefinition propertiesDefinition;

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getTargetNamespace() {
        return targetNamespace;
    }

    @XmlAttribute(name = "targetNamespace")
    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public CapabilityType getRequiredCapabilityType() {
        return requiredCapabilityType;
    }

    @XmlElement(name = "RequiredCapabilityType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRequiredCapabilityType(CapabilityType requiredCapabilityType) {
        this.requiredCapabilityType = requiredCapabilityType;
    }

    public List<Tag> getTags() {
        return tags;
    }

    @XmlElement(name = "Tags", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DerivedFrom getDerivedFrom() {
        return derivedFrom;
    }

    @XmlElement(name = "DerivedFrom", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setDerivedFrom(DerivedFrom derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    public PropertiesDefinition getPropertiesDefinition() {
        return propertiesDefinition;
    }

    @XmlElement(name = "PropertiesDefinition", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPropertiesDefinition(PropertiesDefinition propertiesDefinition) {
        this.propertiesDefinition = propertiesDefinition;
    }
}
