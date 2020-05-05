package templates;

import java.util.List;

import artifacts.DeploymentArtifact;
import constraints.PropertyConstraint;
import main.*;
import types.NodeType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NodeTemplate")
public class NodeTemplate {
    // mandatory
    String id;
    String type;
    List<DeploymentArtifact> deploymentArtifacts;
    List<Properties> properties;
    List<PropertyConstraint> propertyConstraints;
    List<RequirementNodeTempl> requirements;
    List<CapabilityNodeTempl> capabilities;
    String minInstances;
    String maxInstances;

    // optional
    String name;
    List<Policy> policies;

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public List<DeploymentArtifact> getDeploymentArtifacts() {
        return deploymentArtifacts;
    }

    @XmlElementWrapper(name = "DeploymentArtifacts", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "DeploymentArtifact", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setDeploymentArtifacts(List<DeploymentArtifact> deploymentArtifacts) {
        this.deploymentArtifacts = deploymentArtifacts;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    @XmlElement(name = "Properties", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }

    public List<PropertyConstraint> getPropertyConstraints() {
        return propertyConstraints;
    }

    @XmlElementWrapper(name = "PropertyConstraints", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "PropertyConstraint", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPropertyConstraints(List<PropertyConstraint> propertyConstraints) {
        this.propertyConstraints = propertyConstraints;
    }

    public List<RequirementNodeTempl> getRequirements() {
        return requirements;
    }

    @XmlElementWrapper(name = "Requirements", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Requirement", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRequirements(List<RequirementNodeTempl> requirements) {
        this.requirements = requirements;
    }

    public List<CapabilityNodeTempl> getCapabilities() {
        return capabilities;
    }

    @XmlElementWrapper(name = "Capabilities", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Capability", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setCapabilities(List<CapabilityNodeTempl> capabilities) {
        this.capabilities = capabilities;
    }

    public String getMinInstances() {
        return minInstances;
    }

    @XmlAttribute(name = "minInstances")
    public void setMinInstances(String minInstances) {
        this.minInstances = minInstances;
    }

    public String getMaxInstances() {
        return maxInstances;
    }

    @XmlAttribute(name = "maxInstances")
    public void setMaxInstances(String maxInstances) {
        this.maxInstances = maxInstances;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    @XmlElementWrapper(name = "Policies", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Policy", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
}
