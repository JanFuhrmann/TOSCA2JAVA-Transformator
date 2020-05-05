package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Policy")
public class Policy {
    // mandatory
    String policyType;

    // optional
    String name;
    String policyRef;

    public String getPolicyType() {
        return policyType;
    }

    @XmlAttribute(name = "policyType")
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getPolicyRef() {
        return policyRef;
    }

    @XmlAttribute(name = "policyRef")
    public void setPolicyRef(String policyRef) {
        this.policyRef = policyRef;
    }
}
