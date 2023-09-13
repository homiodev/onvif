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
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MetadataConfiguration",
        propOrder = {
                "ptzStatus",
                "events",
                "analytics",
                "multicast",
                "sessionTimeout",
                "any",
                "analyticsEngineConfiguration",
                "extension"
        })
public class MetadataConfiguration extends ConfigurationEntity {

    @XmlElement(name = "PTZStatus")
    protected PTZFilter ptzStatus;

    @Getter @XmlElement(name = "Events")
    protected EventSubscription events;

    @XmlElement(name = "Analytics")
    protected Boolean analytics;

    @Getter @XmlElement(name = "Multicast", required = true)
    protected MulticastConfiguration multicast;

    @Getter @XmlElement(name = "SessionTimeout", required = true)
    protected Duration sessionTimeout;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "AnalyticsEngineConfiguration")
    protected AnalyticsEngineConfiguration analyticsEngineConfiguration;

    @Getter @XmlElement(name = "Extension")
    protected MetadataConfigurationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public PTZFilter getPTZStatus() {
        return ptzStatus;
    }

    public void setPTZStatus(PTZFilter value) {
        this.ptzStatus = value;
    }

    public void setEvents(EventSubscription value) {
        this.events = value;
    }

    public Boolean isAnalytics() {
        return analytics;
    }

    public void setAnalytics(Boolean value) {
        this.analytics = value;
    }

    public void setMulticast(MulticastConfiguration value) {
        this.multicast = value;
    }

    public void setSessionTimeout(Duration value) {
        this.sessionTimeout = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setAnalyticsEngineConfiguration(AnalyticsEngineConfiguration value) {
        this.analyticsEngineConfiguration = value;
    }

    public void setExtension(MetadataConfigurationExtension value) {
        this.extension = value;
    }
}
