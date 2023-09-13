package org.onvif.ver10.events.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.oasis_open.docs.wsn.b_2.FilterType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"filter", "initialTerminationTime", "subscriptionPolicy", "any"})
@XmlRootElement(name = "CreatePullPointSubscription")
public class CreatePullPointSubscription {

    @XmlElement(name = "Filter")
    protected FilterType filter;

    @XmlElementRef(
            name = "InitialTerminationTime",
            namespace = "http://www.onvif.org/ver10/events/wsdl",
            type = JAXBElement.class,
            required = false)
    protected JAXBElement<String> initialTerminationTime;

    @XmlElement(name = "SubscriptionPolicy")
    protected CreatePullPointSubscription.SubscriptionPolicy subscriptionPolicy;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public CreatePullPointSubscription() {
        setInitialTerminationTime(
                new ObjectFactory().createCreatePullPointSubscriptionInitialTerminationTime("PT600S"));
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"})
    public static class SubscriptionPolicy {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }
    }
}
