package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "EngineConfiguration",
        propOrder = {"videoAnalyticsConfiguration", "analyticsEngineInputInfo", "any"})
public class EngineConfiguration {

    @XmlElement(name = "VideoAnalyticsConfiguration", required = true)
    protected VideoAnalyticsConfiguration videoAnalyticsConfiguration;

    @Getter @XmlElement(name = "AnalyticsEngineInputInfo", required = true)
    protected AnalyticsEngineInputInfo analyticsEngineInputInfo;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
        this.videoAnalyticsConfiguration = value;
    }

    public void setAnalyticsEngineInputInfo(AnalyticsEngineInputInfo value) {
        this.analyticsEngineInputInfo = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
