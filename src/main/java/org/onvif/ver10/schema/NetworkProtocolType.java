package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "NetworkProtocolType")
@XmlEnum
public enum NetworkProtocolType {
    HTTP,
    HTTPS,
    RTSP;

    public static NetworkProtocolType fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
