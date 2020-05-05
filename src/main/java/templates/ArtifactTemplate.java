package templates;

import java.util.List;

import constraints.PropertyConstraint;
import main.ArtifactReference;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ArtifactTemplate")
public class ArtifactTemplate {
    // mandatory
    String id;
    String type;
    List<ArtifactReference> artifactReferences;
    // Properties

    // optional
    String name;
    public List<PropertyConstraint> propertyConstraints;

    public String getId() {
        return this.id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<ArtifactReference> getArtifactReferences() {
        return artifactReferences;
    }

    @XmlElementWrapper (name ="ArtifactReferences", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "ArtifactReference", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setArtifactReferences(List<ArtifactReference> artifactReferences) {
        this.artifactReferences = artifactReferences;
    }
}
