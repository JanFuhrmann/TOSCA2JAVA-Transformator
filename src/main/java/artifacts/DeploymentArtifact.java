package artifacts;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DeploymentArtifact")
public class DeploymentArtifact {
    // mandatory
    String name;
    String artifactType;

    // optional
    String artifactRef;

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getArtifactType() {
        return artifactType;
    }

    @XmlAttribute(name = "artifactType")
    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public String getArtifactRef() {
        return artifactRef;
    }

    @XmlAttribute(name = "artifactRef")
    public void setArtifactRef(String artifactRef) {
        this.artifactRef = artifactRef;
    }
}
