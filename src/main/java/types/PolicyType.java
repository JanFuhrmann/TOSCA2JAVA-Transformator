package types;

import definitions.PropertiesDefinition;
import main.DerivedFrom;
import main.NodeTypeReference;
import main.Tag;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "PolicyType")
public class PolicyType {
    String name;

    // optional
    String targetNamespace;
    List<Tag> tags;
    DerivedFrom derivedFrom;
    String policyLanguage;
    NodeTypeReference appliesTo;
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

    public List<Tag> getTags() {
        return tags;
    }

    @XmlElementWrapper(name = "Tags", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Tag", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
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

    public String getPolicyLanguage() {
        return policyLanguage;
    }

    @XmlAttribute(name = "PolicyLanguage")
    public void setPolicyLanguage(String policyLanguage) {
        this.policyLanguage = policyLanguage;
    }

    public NodeTypeReference getAppliesTo() {
        return appliesTo;
    }

    @XmlElement(name = "AppliesTo", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setAppliesTo(NodeTypeReference appliesTo) {
        this.appliesTo = appliesTo;
    }

    public PropertiesDefinition getPropertiesDefinition() {
        return propertiesDefinition;
    }

    @XmlElement(name = "PropertiesDefinition", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPropertiesDefinition(PropertiesDefinition propertiesDefinition) {
        this.propertiesDefinition = propertiesDefinition;
    }

}
