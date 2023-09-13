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
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.oasis_open.docs.wsn.t_1.TopicSetType;

@Getter
@Setter
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {
                "topicNamespaceLocation",
                "fixedTopicSet",
                "topicSet",
                "topicExpressionDialect",
                "messageContentFilterDialect",
                "producerPropertiesFilterDialect",
                "messageContentSchemaLocation",
                "any"
        })
@XmlRootElement(name = "GetEventPropertiesResponse")
public class GetEventPropertiesResponse {

    @XmlElement(name = "TopicNamespaceLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicNamespaceLocation;

    @XmlElement(
            name = "FixedTopicSet",
            namespace = "http://docs.oasis-open.org/wsn/b-2",
            defaultValue = "true")
    protected boolean fixedTopicSet;

    @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1", required = true)
    protected TopicSetType topicSet;

    @XmlElement(
            name = "TopicExpressionDialect",
            namespace = "http://docs.oasis-open.org/wsn/b-2",
            required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialect;

    @XmlElement(name = "MessageContentFilterDialect", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentFilterDialect;

    @XmlElement(name = "ProducerPropertiesFilterDialect")
    @XmlSchemaType(name = "anyURI")
    protected List<String> producerPropertiesFilterDialect;

    @XmlElement(name = "MessageContentSchemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentSchemaLocation;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public List<String> getTopicNamespaceLocation() {
        if (topicNamespaceLocation == null) {
            topicNamespaceLocation = new ArrayList<>();
        }
        return this.topicNamespaceLocation;
    }

    public List<String> getTopicExpressionDialect() {
        if (topicExpressionDialect == null) {
            topicExpressionDialect = new ArrayList<>();
        }
        return this.topicExpressionDialect;
    }

    public List<String> getMessageContentFilterDialect() {
        if (messageContentFilterDialect == null) {
            messageContentFilterDialect = new ArrayList<>();
        }
        return this.messageContentFilterDialect;
    }

    public List<String> getProducerPropertiesFilterDialect() {
        if (producerPropertiesFilterDialect == null) {
            producerPropertiesFilterDialect = new ArrayList<>();
        }
        return this.producerPropertiesFilterDialect;
    }

    public List<String> getMessageContentSchemaLocation() {
        if (messageContentSchemaLocation == null) {
            messageContentSchemaLocation = new ArrayList<>();
        }
        return this.messageContentSchemaLocation;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
