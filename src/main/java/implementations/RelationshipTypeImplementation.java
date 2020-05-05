package implementations;

import java.util.List;

import artifacts.ImplementationArtifact;
import definitions.PropertiesDefinition;
import main.DerivedFrom;
import main.RequiredContainerFeature;
import main.Tag;
import types.RelationshipType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RelationshipTypeImplementation")
public class RelationshipTypeImplementation{
	// mandatory
	String name;
	RelationshipType relationshipType;

	// optional
	String targetNamespace;
	List<Tag> tags;
	DerivedFrom derivedFrom;
	PropertiesDefinition propertiesDefinition;
	List<RequiredContainerFeature> requiredContainerFeatures;
	List<ImplementationArtifact> implementationArtifacts;

	public String getName() {
		return this.name;
	}

	@XmlAttribute(name = "name")
	public void setName(String name) {
		this.name = name;
	}

	public RelationshipType getRelationshipType() {
		return this.relationshipType;
	}

	@XmlElement(name = "RelationshipType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	public void setRelationshipType(RelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getTargetNamespace() {
		return this.targetNamespace;
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

	public PropertiesDefinition getPropertiesDefinition() {
		return propertiesDefinition;
	}

	@XmlElement(name = "PropertiesDefinition", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	public void setPropertiesDefinition(PropertiesDefinition propertiesDefinition) {
		this.propertiesDefinition = propertiesDefinition;
	}

	public List<RequiredContainerFeature> getRequiredContainerFeatures() {
		return requiredContainerFeatures;
	}

	@XmlElementWrapper(name = "RequiredContainerFeatures", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	@XmlElement(name = "RequiredContainerFeature", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	public void setRequiredContainerFeatures(List<RequiredContainerFeature> requiredContainerFeatures) {
		this.requiredContainerFeatures = requiredContainerFeatures;
	}

	public List<ImplementationArtifact> getImplementationArtifacts() {
		return implementationArtifacts;
	}

	@XmlElementWrapper(name = "ImplementationArtifacts", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	@XmlElement(name = "ImplementationArtifact", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
	public void setImplementationArtifacts(List<ImplementationArtifact> implementationArtifacts) {
		this.implementationArtifacts = implementationArtifacts;
	}

}
