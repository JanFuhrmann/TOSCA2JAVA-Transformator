package definitions;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PropertiesDefinition")
public class PropertiesDefinition {
    String elementname;
    String namespace;
    String type;

    public String getElementname() {
        return this.elementname;
    }

    @XmlAttribute(name = "elementname")
    public void setElementname(String elementname) {
        this.elementname = elementname;
    }

    public String getNamespace() {
        return this.namespace;
    }

    @XmlAttribute(name = "namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getType() {
        return this.type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }
}
