package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MetadataStream",
        propOrder = {"videoAnalyticsOrPTZOrEvent"})
public class MetadataStream {

    @XmlElements({
            @XmlElement(name = "VideoAnalytics", type = VideoAnalyticsStream.class),
            @XmlElement(name = "PTZ", type = PTZStream.class),
            @XmlElement(name = "Event", type = EventStream.class),
            @XmlElement(name = "Extension", type = MetadataStreamExtension.class)
    })
    protected List<java.lang.Object> videoAnalyticsOrPTZOrEvent;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<java.lang.Object> getVideoAnalyticsOrPTZOrEvent() {
        if (videoAnalyticsOrPTZOrEvent == null) {
            videoAnalyticsOrPTZOrEvent = new ArrayList<>();
        }
        return this.videoAnalyticsOrPTZOrEvent;
    }
}
