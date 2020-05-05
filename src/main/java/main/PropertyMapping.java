package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PropertyMapping")
public class PropertyMapping {
    // mandatory
    String serviceTemplatePropertyRef;
    String targetObjectRef;
    String targetPropertyRef;

    public String getServiceTemplatePropertyRef() {
        return serviceTemplatePropertyRef;
    }

    @XmlAttribute(name = "serviceTemplatePropertyRef")
    public void setServiceTemplatePropertyRef(String serviceTemplatePropertyRef) {
        this.serviceTemplatePropertyRef = serviceTemplatePropertyRef;
    }

    public String getTargetObjectRef() {
        return targetObjectRef;
    }

    @XmlAttribute(name = "targetObjectRef")
    public void setTargetObjectRef(String targetObjectRef) {
        this.targetObjectRef = targetObjectRef;
    }

    public String getTargetPropertyRef() {
        return targetPropertyRef;
    }

    @XmlAttribute(name = "targetPropertyRef")
    public void setTargetPropertyRef(String targetPropertyRef) {
        this.targetPropertyRef = targetPropertyRef;
    }
}
