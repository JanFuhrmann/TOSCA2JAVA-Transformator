package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Operation")
public class Operation {
    String name;

    List<IOParameter> inputParameters;
    List<IOParameter> outputParameters;

    public String getName() {
        return this.name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<IOParameter> getInputParameters() {
        return this.inputParameters;
    }

    @XmlElementWrapper(name = "InputParameters", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "InputParameter", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setInputParameters(List<IOParameter> inputParameters) {
        this.inputParameters = inputParameters;
    }

    public List<IOParameter> getOutputParameters() {
        return this.outputParameters;
    }

    @XmlElementWrapper(name = "OutputParameters", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    @XmlElement(name = "OutputParameter", namespace = "http://docs.oasis-open.org/tosca/ns/2011/12")
    public void setOutputParameters(List<IOParameter> outputParameters) {
        this.outputParameters = outputParameters;
    }
}
