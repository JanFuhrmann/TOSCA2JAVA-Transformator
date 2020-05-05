package artifacts;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ImplementationArtifact")
public class ImplementationArtifact {
    String name;
    String artifactType;

    // optional
    String artifactRef;
    String interfaceName;
    String operationName;

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getArtifactType() {
        return this.artifactType;
    }

    @XmlAttribute(name = "artifactType")
    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public String getArtifactRef() {
        return this.artifactRef;
    }

    @XmlAttribute(name = "artifactRef")
    public void setArtifactRef(String artifactRef) {
        this.artifactRef = artifactRef;
    }

    public String getInterfaceName() {
        return this.interfaceName;
    }

    @XmlAttribute(name = "interfaceName")
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getOperationName() {
        return this.operationName;
    }

    @XmlAttribute(name = "operationName")
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
}
