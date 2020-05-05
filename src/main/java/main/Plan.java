package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement (name = "Plan")
public class Plan {
    // mandatory
    String id;
    String planType;
    String planLanguage;
    String planModel;
    String planModelReference;

    // optional
    String name;
    // TODO: Precondition
    List<IOParameter> inputParameters;
    List<IOParameter> outputParameters;

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getPlanType() {
        return planType;
    }

    @XmlAttribute(name = "PlanType")
    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPlanLanguage() {
        return planLanguage;
    }

    @XmlAttribute(name = "PlanLanguage")
    public void setPlanLanguage(String planLanguage) {
        this.planLanguage = planLanguage;
    }

    public String getPlanModel() {
        return planModel;
    }

    @XmlAttribute(name = "PlanModel")
    public void setPlanModel(String planModel) {
        this.planModel = planModel;
    }

    public String getPlanModelReference() {
        return planModelReference;
    }

    @XmlAttribute(name = "PlanModelReference")
    public void setPlanModelReference(String planModelReference) {
        this.planModelReference = planModelReference;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<IOParameter> getInputParameters() {
        return inputParameters;
    }

    @XmlElementWrapper(name = "InputParameters", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "InputParameter", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setInputParameters(List<IOParameter> inputParameters) {
        this.inputParameters = inputParameters;
    }

    public List<IOParameter> getOutputParameters() {
        return outputParameters;
    }

    @XmlElementWrapper(name = "OutputParameters", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "OutputParameter", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setOutputParameters(List<IOParameter> outputParameters) {
        this.outputParameters = outputParameters;
    }
}
