package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "TransportProtocol")
@XmlEnum
public enum TransportProtocol {
    UDP,
    TCP,
    RTSP,
    HTTP;

    public static TransportProtocol fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
