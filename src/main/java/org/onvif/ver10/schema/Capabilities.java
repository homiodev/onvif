package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Capabilities",
        propOrder = {"analytics", "device", "events", "imaging", "media", "ptz", "extension"})
public class Capabilities {

    @XmlElement(name = "Analytics")
    protected AnalyticsCapabilities analytics;

    @XmlElement(name = "Device")
    protected DeviceCapabilities device;

    @XmlElement(name = "Events")
    protected EventCapabilities events;

    @XmlElement(name = "Imaging")
    protected ImagingCapabilities imaging;

    @XmlElement(name = "Media")
    protected MediaCapabilities media;

    @XmlElement(name = "PTZ")
    protected PTZCapabilities ptz;

    @XmlElement(name = "Extension")
    protected CapabilitiesExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();
}
