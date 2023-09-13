package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "VideoEncoding")
@XmlEnum
public enum VideoEncoding {
    JPEG("JPEG"),
    @XmlEnumValue("MPEG4")
    MPEG_4("MPEG4"),
    @XmlEnumValue("H264")
    H_264("H264");
    private final String value;

    VideoEncoding(String v) {
        value = v;
    }

    public static VideoEncoding fromValue(String v) {
        for (VideoEncoding c : VideoEncoding.values()) {
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
