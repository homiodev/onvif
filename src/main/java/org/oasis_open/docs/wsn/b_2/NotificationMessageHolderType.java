package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.w3._2005._08.addressing.EndpointReferenceType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NotificationMessageHolderType",
        propOrder = {"subscriptionReference", "topic", "producerReference", "message"})
@ToString
public class NotificationMessageHolderType {

    @XmlElement(name = "SubscriptionReference")
    protected EndpointReferenceType subscriptionReference;

    @XmlElement(name = "Topic")
    protected TopicExpressionType topic;

    @XmlElement(name = "ProducerReference")
    protected EndpointReferenceType producerReference;

    @XmlElement(name = "Message", required = true)
    protected NotificationMessageHolderType.Message message;

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"})
    public static class Message {

        @XmlAnyElement(lax = true)
        protected Object any;
    }
}
