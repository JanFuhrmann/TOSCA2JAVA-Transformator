package types;

import java.util.List;

import definitions.PropertiesDefinition;
import main.DerivedFrom;
import main.Tag;

public class Type {
	// mandatory
	public String name;

	// optional
	public String targetNamespace;
	public List<Tag> tags;
	DerivedFrom derivedFrom;
	public PropertiesDefinition propertiesDefinition;
}
