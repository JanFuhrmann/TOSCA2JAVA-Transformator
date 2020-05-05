package templates;

import java.util.List;

import definitions.BoundaryDefinition;
import main.Plan;
import main.Tag;
import types.NodeType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ServiceTemplate")
public class ServiceTemplate {
    // mandatory
    String id;

    // optional
    String name;
    String targetNamespace;
    NodeType substitutableNodeType;
    List<Tag> tags;
    List<BoundaryDefinition> boundaryDefinitions;
    TopologyTemplate topologyTemplate;
    List<Plan> plans;

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getTargetNamespace() {
        return targetNamespace;
    }

    @XmlAttribute(name = "targetNamespace")
    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public void setSubstitutableNodeType(NodeType substitutableNodeType) {
        this.substitutableNodeType = substitutableNodeType;
    }

    @XmlElement(name = "SubstitutableNodeType", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public NodeType getSubstitutableNodeType() {
        return substitutableNodeType;
    }

    public List<Tag> getTags() {
        return tags;
    }

    @XmlElementWrapper(name = "Tags", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Tag", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<BoundaryDefinition> getBoundaryDefinitions() {
        return boundaryDefinitions;
    }

    @XmlElementWrapper(name = "BoundaryDefinitions", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "BoundaryDefinition", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setBoundaryDefinitions(List<BoundaryDefinition> boundaryDefinitions) {
        this.boundaryDefinitions = boundaryDefinitions;
    }

    public TopologyTemplate getTopologyTemplate() {
        return topologyTemplate;
    }

    @XmlElement(name = "TopologyTemplate", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setTopologyTemplate(TopologyTemplate topologyTemplate) {
        this.topologyTemplate = topologyTemplate;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    @XmlElementWrapper(name = "Plans", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "Plan", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }
}
