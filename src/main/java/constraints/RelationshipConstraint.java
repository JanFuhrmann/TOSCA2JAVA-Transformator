package constraints;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RelationshipConstraint")
public class RelationshipConstraint {
    String constraintType;

    public String getConstraintType() {
        return constraintType;
    }

    @XmlAttribute(name = "constraintType")
    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }
}
