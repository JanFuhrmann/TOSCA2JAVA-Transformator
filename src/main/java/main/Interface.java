package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Interface")
public class Interface {
    // mandatory
    String name;
    List<Operation> operation;

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<Operation> getOperation() {
        return this.operation;
    }

    @XmlElement(name = "Operation", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }
}
