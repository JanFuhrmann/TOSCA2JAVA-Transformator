package templates;

import java.util.List;

import constraints.PropertyConstraint;
import constraints.RelationshipConstraint;
import main.Properties;
import main.SourceElement;
import main.TargetElement;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RelationshipTemplate")
public class RelationshipTemplate {
    // mandatory
    String id;
    String type;
    SourceElement sourceElement;
    TargetElement targetElement;
    List<Properties> properties;

    // optional
    String name;
    List<PropertyConstraint> propertyConstraints;
    List<RelationshipConstraint> relationshipConstraints;

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public SourceElement getSourceElement() {
        return sourceElement;
    }

    @XmlElement(name = "SourceElement", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setSourceElement(SourceElement sourceElement) {
        this.sourceElement = sourceElement;
    }

    public TargetElement getTargetElement() {
        return targetElement;
    }

    @XmlElement(name = "TargetElement", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setTargetElement(TargetElement targetElement) {
        this.targetElement = targetElement;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    @XmlElement(name = "Properties", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<PropertyConstraint> getPropertyConstraints() {
        return propertyConstraints;
    }

    @XmlElementWrapper(name = "PropertyConstraints", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "PropertyConstraint", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPropertyConstraints(List<PropertyConstraint> propertyConstraints) {
        this.propertyConstraints = propertyConstraints;
    }

    public List<RelationshipConstraint> getRelationshipConstraints() {
        return relationshipConstraints;
    }

    @XmlElementWrapper(name = "RelationshipConstraints", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "RelationshipConstraint", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRelationshipConstraints(List<RelationshipConstraint> relationshipConstraints) {
        this.relationshipConstraints = relationshipConstraints;
    }
}
