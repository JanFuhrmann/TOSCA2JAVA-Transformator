package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SourceElement")
public class SourceElement {
    String typeRef;

    public String getTypeRef() {
        return typeRef;
    }

    @XmlAttribute(name = "ref")
    public void setTypeRef(String typeRef) {
        this.typeRef = typeRef;
    }
}
