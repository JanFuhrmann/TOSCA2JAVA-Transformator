package definitions;

import constraints.PropertyConstraint;
import main.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class BoundaryDefinition {
    // optional
    List<Properties> properties;
    List<PropertyConstraint> propertyConstraints;
    List<RequirementServTempl> requirementServTempls;
    List<CapabilityServTempl> capabilities;
    List<Policy> policies;
    List<Interface> interfaces;

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

    public List<RequirementServTempl> getRequirementServTempls() {
        return requirementServTempls;
    }

    @XmlElementWrapper(name = "Requirements", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Requirement", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRequirementServTempls(List<RequirementServTempl> requirementServTempls) {
        this.requirementServTempls = requirementServTempls;
    }

    public List<CapabilityServTempl> getCapabilities() {
        return capabilities;
    }

    @XmlElementWrapper(name = "Capabilities", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Capability", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setCapabilities(List<CapabilityServTempl> capabilities) {
        this.capabilities = capabilities;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    @XmlElementWrapper(name = "Policies", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Policy", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    @XmlElementWrapper(name = "Interfaces", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Interface", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }
}
