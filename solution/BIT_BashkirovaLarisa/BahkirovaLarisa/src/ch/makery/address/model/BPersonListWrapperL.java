package ch.makery.address.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class BPersonListWrapperL {

	private List<BPersonL> persons;

	@XmlElement(name = "person")
	public List<BPersonL> getPersons() {
		return persons;
	}

	public void setPersons(List<BPersonL> persons) {
		this.persons = persons;
	}
}
