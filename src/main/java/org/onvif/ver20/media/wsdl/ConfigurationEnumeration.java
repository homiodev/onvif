package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ConfigurationEnumeration")
@XmlEnum
public enum ConfigurationEnumeration {
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("VideoSource")
    VIDEO_SOURCE("VideoSource"),
    @XmlEnumValue("VideoEncoder")
    VIDEO_ENCODER("VideoEncoder"),
    @XmlEnumValue("AudioSource")
    AUDIO_SOURCE("AudioSource"),
    @XmlEnumValue("AudioEncoder")
    AUDIO_ENCODER("AudioEncoder"),
    @XmlEnumValue("AudioOutput")
    AUDIO_OUTPUT("AudioOutput"),
    @XmlEnumValue("AudioDecoder")
    AUDIO_DECODER("AudioDecoder"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),
    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),
    PTZ("PTZ");
    private final String value;

    ConfigurationEnumeration(String v) {
        value = v;
    }

    public static ConfigurationEnumeration fromValue(String v) {
        for (ConfigurationEnumeration c : ConfigurationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }
}
