
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"certificateID", "subject", "validNotBefore", "validNotAfter"})
@XmlRootElement(name = "CreateCertificate")
public class CreateCertificate {

    @XmlElement(name = "CertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;

    @XmlElement(name = "Subject")
    protected String subject;

    @XmlElement(name = "ValidNotBefore")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validNotBefore;

    @XmlElement(name = "ValidNotAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validNotAfter;

    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    public void setSubject(String value) {
        this.subject = value;
    }

    public void setValidNotBefore(XMLGregorianCalendar value) {
        this.validNotBefore = value;
    }

    public void setValidNotAfter(XMLGregorianCalendar value) {
        this.validNotAfter = value;
    }
}
