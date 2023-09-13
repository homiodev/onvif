package org.oasis_open.docs.wsrf.bf_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;
import org.oasis_open.docs.wsn.b_2.InvalidFilterFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidMessageContentExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidProducerPropertiesExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType;
import org.oasis_open.docs.wsn.b_2.MultipleTopicsSpecifiedFaultType;
import org.oasis_open.docs.wsn.b_2.NoCurrentMessageOnTopicFaultType;
import org.oasis_open.docs.wsn.b_2.NotifyMessageNotSupportedFaultType;
import org.oasis_open.docs.wsn.b_2.PauseFailedFaultType;
import org.oasis_open.docs.wsn.b_2.ResumeFailedFaultType;
import org.oasis_open.docs.wsn.b_2.SubscribeCreationFailedFaultType;
import org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType;
import org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToCreatePullPointFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToDestroySubscriptionFaultType;
import org.oasis_open.docs.wsn.b_2.UnableToGetMessagesFaultType;
import org.oasis_open.docs.wsn.b_2.UnacceptableInitialTerminationTimeFaultType;
import org.oasis_open.docs.wsn.b_2.UnacceptableTerminationTimeFaultType;
import org.oasis_open.docs.wsn.b_2.UnrecognizedPolicyRequestFaultType;
import org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType;
import org.w3._2005._08.addressing.EndpointReferenceType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "BaseFaultType",
        propOrder = {"any", "timestamp", "originator", "errorCode", "description", "faultCause"})
@XmlSeeAlso({
        TopicExpressionDialectUnknownFaultType.class,
        UnableToGetMessagesFaultType.class,
        ResumeFailedFaultType.class,
        InvalidProducerPropertiesExpressionFaultType.class,
        SubscribeCreationFailedFaultType.class,
        UnableToDestroySubscriptionFaultType.class,
        UnrecognizedPolicyRequestFaultType.class,
        NotifyMessageNotSupportedFaultType.class,
        UnableToCreatePullPointFaultType.class,
        UnacceptableInitialTerminationTimeFaultType.class,
        InvalidTopicExpressionFaultType.class,
        UnsupportedPolicyRequestFaultType.class,
        PauseFailedFaultType.class,
        InvalidMessageContentExpressionFaultType.class,
        UnableToDestroyPullPointFaultType.class,
        MultipleTopicsSpecifiedFaultType.class,
        NoCurrentMessageOnTopicFaultType.class,
        InvalidFilterFaultType.class,
        TopicNotSupportedFaultType.class,
        UnacceptableTerminationTimeFaultType.class
})
public class BaseFaultType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    @XmlElement(name = "Originator")
    protected EndpointReferenceType originator;

    @XmlElement(name = "ErrorCode")
    protected BaseFaultType.ErrorCode errorCode;

    @XmlElement(name = "Description")
    protected List<BaseFaultType.Description> description;

    @XmlElement(name = "FaultCause")
    protected BaseFaultType.FaultCause faultCause;

    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public List<BaseFaultType.Description> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"value"})
    public static class Description {

        @XmlValue
        protected String value;

        @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
        protected String lang;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"content"})
    public static class ErrorCode {

        @XmlMixed
        @XmlAnyElement
        protected List<Object> content;

        @XmlAttribute(name = "dialect", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String dialect;

        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<>();

        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<>();
            }
            return this.content;
        }
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"})
    public static class FaultCause {

        @XmlAnyElement(lax = true)
        protected Object any;
    }
}
