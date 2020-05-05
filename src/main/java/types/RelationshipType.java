package types;

import java.util.List;

import definitions.PropertiesDefinition;
import main.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RelationshipType")
public class RelationshipType {
    String name;
    List<InstanceState> instanceStates;
    List<Interface> sourceInterfaces;
    List<Interface> targetInterfaces;
    List<Interface> toscaInterfaces;
    SourceElement validSource;
    SourceElement validTarget;

    // optional
    String targetNamespace;
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

    public List<InstanceState> getInstanceStates() {
        return instanceStates;
    }

    @XmlElementWrapper(name = "InstanceStates", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "InstanceState", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setInstanceStates(List<InstanceState> instanceStates) {
        this.instanceStates = instanceStates;
    }

    public List<Interface> getSourceInterfaces() {
        return sourceInterfaces;
    }

    @XmlElementWrapper(name = "SourceInterfaces", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "SourceInterface", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setSourceInterfaces(List<Interface> sourceInterfaces) {
        this.sourceInterfaces = sourceInterfaces;
    }

    public List<Interface> getTargetInterfaces() {
        return targetInterfaces;
    }

    @XmlElementWrapper(name = "TargetInterfaces", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "TargetInterface", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setTargetInterfaces(List<Interface> targetInterfaces) {
        this.targetInterfaces = targetInterfaces;
    }

    public List<Interface> getToscaInterfaces() {
        return toscaInterfaces;
    }

    @XmlElementWrapper(name = "ToscaInterfaces", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "ToscaInterface", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setToscaInterfaces(List<Interface> toscaInterfaces) {
        this.toscaInterfaces = toscaInterfaces;
    }

    public SourceElement getValidSource() {
        return validSource;
    }

    @XmlElement(name = "ValidSource", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setValidSource(SourceElement validSource) {
        this.validSource = validSource;
    }

    public SourceElement getValidTarget() {
        return validTarget;
    }

    @XmlElement(name = "ValidTarget", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setValidTarget(SourceElement validTarget) {
        this.validTarget = validTarget;
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

    @XmlElement(name = "DerivedFrom")
    public void setDerivedFrom(DerivedFrom derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    public PropertiesDefinition getPropertiesDefinition() {
        return propertiesDefinition;
    }

    @XmlElement(name = "PropertiesDefinition")
    public void setPropertiesDefinition(PropertiesDefinition propertiesDefinition) {
        this.propertiesDefinition = propertiesDefinition;
    }
}
