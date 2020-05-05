package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "InstanceState")
public class InstanceState {
    String state;

    public String getState() {
        return state;
    }

    @XmlAttribute(name = "state")
    public void setState(String state) {
        this.state = state;
    }
}
