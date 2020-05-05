package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DerivedFrom")
public class DerivedFrom {
    String typeRef;

    public String getTypeRef() {
        return typeRef;
    }

    @XmlAttribute(name = "typeRef")
    public void setTypeRef(String typeRef) {
        this.typeRef = typeRef;
    }
}
