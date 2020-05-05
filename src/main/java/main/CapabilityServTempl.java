package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Capability")
public class CapabilityServTempl {
    // mandatory
    String ref;

    // optional
    String name;

    public String getRef() {
        return ref;
    }

    @XmlAttribute(name = "ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }
}
