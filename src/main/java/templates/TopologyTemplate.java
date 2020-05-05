package templates;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "TopologyTemplate")
public class TopologyTemplate {
    // mandatory
	List<NodeTemplate> nodeTemplates;
    List<RelationshipTemplate> relationshipTemplates;

    public List<NodeTemplate> getNodeTemplates() {
        return nodeTemplates;
    }

    @XmlElement (name = "NodeTemplate", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setNodeTemplates(List<NodeTemplate> nodeTemplates) {
        this.nodeTemplates = nodeTemplates;
    }

    public List<RelationshipTemplate> getRelationshipTemplates() {
        return relationshipTemplates;
    }

    @XmlElement(name = "RelationshipTemplate", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setRelationshipTemplates(List<RelationshipTemplate> relationshipTemplates) {
        this.relationshipTemplates = relationshipTemplates;
    }
}
