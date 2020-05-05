package constraints;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PropertyConstraint")
public class PropertyConstraint {
    // mandatory
    String property;
    String constraintType;

    public String getProperty() {
        return property;
    }

    @XmlAttribute(name = "property")
    public void setProperty(String property) {
        this.property = property;
    }

    public String getConstraintType() {
        return constraintType;
    }

    @XmlAttribute(name = "constraintType")
    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

}
