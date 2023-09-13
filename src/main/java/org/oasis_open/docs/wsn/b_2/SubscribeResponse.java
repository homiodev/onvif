
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
import org.w3._2005._08.addressing.EndpointReferenceType;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"subscriptionReference", "currentTime", "terminationTime", "any"})
@XmlRootElement(name = "SubscribeResponse")
public class SubscribeResponse {

    @XmlElement(name = "SubscriptionReference", required = true)
    protected EndpointReferenceType subscriptionReference;

    @Getter @XmlElement(name = "CurrentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTime;

    @Getter @XmlElement(name = "TerminationTime", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public void setSubscriptionReference(EndpointReferenceType value) {
        this.subscriptionReference = value;
    }

    public void setCurrentTime(XMLGregorianCalendar value) {
        this.currentTime = value;
    }

    public void setTerminationTime(XMLGregorianCalendar value) {
        this.terminationTime = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
