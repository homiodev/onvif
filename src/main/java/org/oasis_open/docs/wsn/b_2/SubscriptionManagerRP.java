
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.Getter;
import org.w3._2005._08.addressing.EndpointReferenceType;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"consumerReference", "filter", "subscriptionPolicy", "creationTime"})
@XmlRootElement(name = "SubscriptionManagerRP")
public class SubscriptionManagerRP {

    @XmlElement(name = "ConsumerReference", required = true)
    protected EndpointReferenceType consumerReference;

    @XmlElement(name = "Filter")
    protected FilterType filter;

    @XmlElement(name = "SubscriptionPolicy")
    protected SubscriptionPolicyType subscriptionPolicy;

    @XmlElement(name = "CreationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;

    public void setConsumerReference(EndpointReferenceType value) {
        this.consumerReference = value;
    }

    public void setFilter(FilterType value) {
        this.filter = value;
    }

    public void setSubscriptionPolicy(SubscriptionPolicyType value) {
        this.subscriptionPolicy = value;
    }

    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }
}
