package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ArtifactReference")
public class ArtifactReference {
    // mandatory
    String reference;

    // optional
    // public InExclude include;
    // public InExclude exclude;

    public String getReference() {
        return reference;
    }

    @XmlAttribute(name = "reference")
    public void setReference(String reference) {
        this.reference = reference;
    }
}
