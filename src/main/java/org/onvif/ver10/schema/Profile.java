package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
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
    name = "Profile",
    propOrder = {
        "name",
        "videoSourceConfiguration",
        "audioSourceConfiguration",
        "videoEncoderConfiguration",
        "audioEncoderConfiguration",
        "videoAnalyticsConfiguration",
        "ptzConfiguration",
        "metadataConfiguration",
        "extension"
    })
public class Profile {

    @XmlElement(name = "Name", required = true)
    protected String name;

    @Getter @XmlElement(name = "VideoSourceConfiguration")
    protected VideoSourceConfiguration videoSourceConfiguration;

    @Getter @XmlElement(name = "AudioSourceConfiguration")
    protected AudioSourceConfiguration audioSourceConfiguration;

    @Getter @XmlElement(name = "VideoEncoderConfiguration")
    protected VideoEncoderConfiguration videoEncoderConfiguration;

    @Getter @XmlElement(name = "AudioEncoderConfiguration")
    protected AudioEncoderConfiguration audioEncoderConfiguration;

    @Getter @XmlElement(name = "VideoAnalyticsConfiguration")
    protected VideoAnalyticsConfiguration videoAnalyticsConfiguration;

    @XmlElement(name = "PTZConfiguration")
    protected PTZConfiguration ptzConfiguration;

    @Getter @XmlElement(name = "MetadataConfiguration")
    protected MetadataConfiguration metadataConfiguration;

    @Getter @XmlElement(name = "Extension")
    protected ProfileExtension extension;

    @Getter @XmlAttribute(name = "token", required = true)
    protected String token;

    @XmlAttribute(name = "fixed")
    protected Boolean fixed;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();
}
