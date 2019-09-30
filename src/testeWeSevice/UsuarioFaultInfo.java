package testeWeSevice;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
public class UsuarioFaultInfo {

	@XmlAttribute
	private String message;
	private XMLGregorianCalendar dataXml;
	
	public UsuarioFaultInfo(String message) {
		this.message = message;
		try {
			this.dataXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	public UsuarioFaultInfo() {
	}
	
	

}
