package main;

import constraints.PropertyConstraint;
import types.RequirementType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Requirement")
public class RequirementNodeTempl {
    // mandatory
    String id;
    String name;
    RequirementType type;

    // optional
    Properties properties;
    List<PropertyConstraint> propertyConstraints;


    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public RequirementType getType() {
        return type;
    }

    @XmlElement(name = "type")
    public void setType(RequirementType type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    @XmlElement(name = "Properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<PropertyConstraint> getPropertyConstraints() {
        return propertyConstraints;
    }

    @XmlElementWrapper(name = "PropertyConstraints")
    @XmlElement(name = "PropertyConstraint")
    public void setPropertyConstraints(List<PropertyConstraint> propertyConstraints) {
        this.propertyConstraints = propertyConstraints;
    }
}
