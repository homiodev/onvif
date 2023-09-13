package org.onvif.ver10.events.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _Capabilities_QNAME =
            new QName("http://www.onvif.org/ver10/events/wsdl", "Capabilities");
    private static final QName _CreatePullPointSubscriptionInitialTerminationTime_QNAME =
            new QName("http://www.onvif.org/ver10/events/wsdl", "InitialTerminationTime");

    public CreatePullPointSubscription.SubscriptionPolicy
    createCreatePullPointSubscriptionSubscriptionPolicy() {
        return new CreatePullPointSubscription.SubscriptionPolicy();
    }

    public org.onvif.ver10.events.wsdl.SubscriptionPolicy createSubscriptionPolicy() {
        return new org.onvif.ver10.events.wsdl.SubscriptionPolicy();
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/events/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/events/wsdl",
            name = "InitialTerminationTime",
            scope = CreatePullPointSubscription.class)
    public JAXBElement<String> createCreatePullPointSubscriptionInitialTerminationTime(String value) {
        return new JAXBElement<>(
                _CreatePullPointSubscriptionInitialTerminationTime_QNAME,
                String.class,
                CreatePullPointSubscription.class,
                value);
    }
}
