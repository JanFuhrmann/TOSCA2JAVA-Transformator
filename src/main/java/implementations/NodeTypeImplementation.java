package implementations;

import java.util.List;

import artifacts.DeploymentArtifact;
import artifacts.ImplementationArtifact;
import definitions.PropertiesDefinition;
import main.DerivedFrom;
import main.RequiredContainerFeature;
import main.Tag;
import types.NodeType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NodeTypeImplementation")
public class NodeTypeImplementation {
    // mandatory
    String name;
    NodeType nodeType;

    // optional
    String targetNamespace;
    List<Tag> tags;
    DerivedFrom derivedFrom;
    PropertiesDefinition propertiesDefinition;
    List<DeploymentArtifact> deploymentArtifacts;
    List<RequiredContainerFeature> requiredContainerFeatures;
    List<ImplementationArtifact> implementationArtifacts;

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    @XmlElement(name = "NodeType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public String getTargetNamespace() {
        return targetNamespace;
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

    public List<DeploymentArtifact> getDeploymentArtifacts() {
        return deploymentArtifacts;
    }

    @XmlElementWrapper(name = "DeploymentArtifacts", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "DeploymentArtifact", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setDeploymentArtifacts(List<DeploymentArtifact> deploymentArtifacts) {
        this.deploymentArtifacts = deploymentArtifacts;
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
