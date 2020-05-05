package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Requirement")
public class RequirementServTempl {
    // mandatory
    String ref;

    // optional
    String name;

    public String getRef() {
        return this.ref;
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
