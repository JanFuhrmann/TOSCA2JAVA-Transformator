package templates;

import java.util.List;

import constraints.PropertyConstraint;

public class Template {
	// mandatory
	public String id;
	public String type;
	// Properties

	// optional
	public String name;
	public List<PropertyConstraint> propertyConstraints;

	public Template(String id, String type) {
		this.id = id;
		this.type = type;
	}
}
