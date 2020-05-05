package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Import")
public class Import {
    // mandatory
    String importType; // *required

    // optional
    String namespace;
    String location;


    public String getImportType() {
        return this.importType;
    }

    @XmlAttribute(name = "importType")
    public void setImportType(String importType) {
        this.importType = importType;
    }

    public String getNamespace() {
        return this.namespace;
    }

    @XmlAttribute(name = "namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getLocation() {
        return this.location;
    }

    @XmlAttribute(name = "location")
    public void setLocation(String location) {
        this.location = location;
    }
}
