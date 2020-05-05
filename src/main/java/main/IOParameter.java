package main;

import javax.xml.bind.annotation.XmlAttribute;

public class IOParameter {
    // mandatory
    String name;
    String type;

    // optional
    String required;

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }

    public String getRequired() {
        return required;
    }

    @XmlAttribute(name = "required")
    public void setRequired(String required) {
        this.required = required;
    }


}
