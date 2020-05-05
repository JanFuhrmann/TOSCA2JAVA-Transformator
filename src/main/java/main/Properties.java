package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement (name = "Properties")
public class Properties {
    // optional
    List<PropertyMapping> propertyMappings;

    public List<PropertyMapping> getPropertyMappings() {
        return propertyMappings;
    }

    @XmlElementWrapper(name = "PropertyMappings", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "PropertyMapping", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setPropertyMappings(List<PropertyMapping> propertyMappings) {
        this.propertyMappings = propertyMappings;
    }
}
