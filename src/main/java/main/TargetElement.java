package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TargetElement")
public class TargetElement {
    String typeRef;

    public String getTypeRef() {
        return typeRef;
    }

    @XmlAttribute(name = "ref")
    public void setTypeRef(String typeRef) {
        this.typeRef = typeRef;
    }
}
