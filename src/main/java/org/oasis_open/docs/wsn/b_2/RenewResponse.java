
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"terminationTime", "currentTime", "any"})
@XmlRootElement(name = "RenewResponse")
public class RenewResponse {

    @XmlElement(name = "TerminationTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;

    @Getter @XmlElement(name = "CurrentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTime;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public void setTerminationTime(XMLGregorianCalendar value) {
        this.terminationTime = value;
    }

    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
