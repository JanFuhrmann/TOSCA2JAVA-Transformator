package main;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Extension")
public class Extension {
	// mandatory
	String namespace;

	// optional
	boolean mustUnderstand = true;

	public String getNamespace() {
		return namespace;
	}

	@XmlAttribute (name = "namespace")
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public boolean isMustUnderstand() {
		return mustUnderstand;
	}

	@XmlAttribute (name = "mustUnderstand")
	public void setMustUnderstand(boolean mustUnderstand) {
		this.mustUnderstand = mustUnderstand;
	}
}
