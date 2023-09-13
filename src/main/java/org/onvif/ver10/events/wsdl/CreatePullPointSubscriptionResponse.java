package org.onvif.ver10.events.wsdl;

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
import lombok.Setter;
import lombok.experimental.Accessors;
import org.w3._2005._08.addressing.EndpointReferenceType;

@Getter
@Setter
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"subscriptionReference", "currentTime", "terminationTime", "any"})
@XmlRootElement(name = "CreatePullPointSubscriptionResponse")
public class CreatePullPointSubscriptionResponse {

    @XmlElement(name = "SubscriptionReference", required = true)
    protected EndpointReferenceType subscriptionReference;

    @XmlElement(
            name = "CurrentTime",
            namespace = "http://docs.oasis-open.org/wsn/b-2",
            required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentTime;

    @XmlElement(
            name = "TerminationTime",
            namespace = "http://docs.oasis-open.org/wsn/b-2",
            required = true,
            nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationTime;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
