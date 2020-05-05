package definitions;

import constraints.Constraint;
import types.RequirementType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "RequirementDefinition")
public class RequirementDefinition {
	// mandatory
	String name;
    RequirementType requirementType;

    // optional
    String lowerBound;
    String upperBound;
    List<Constraint> constraints;

    public RequirementType getRequirementType() {
        return this.requirementType;
    }

    @XmlElement(name = "RequirementType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRequirementType(RequirementType requirementType) {
        this.requirementType = requirementType;
    }

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

	public String getLowerBound() {
		return this.lowerBound;
	}

	@XmlAttribute(name = "lowerBound")
	public void setLowerBound(String lowerBound) {
		this.lowerBound = lowerBound;
	}

	public String getUpperBound() {
		return this.upperBound;
	}

	@XmlAttribute(name = "upperBound")
	public void setUpperBound(String upperBound) {
		this.upperBound = upperBound;
	}

	public List<Constraint> getConstraints() {
		return this.constraints;
	}

	@XmlElementWrapper(name = "Constraints", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	@XmlElement(name = "Constraint", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	public void setConstraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}

}
