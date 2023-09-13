package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "TrackType")
@XmlEnum
public enum TrackType {
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Audio")
    AUDIO("Audio"),
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),

    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    TrackType(String v) {
        value = v;
    }

    public static TrackType fromValue(String v) {
        for (TrackType c : TrackType.values()) {
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
