package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "TransportProtocol")
@XmlEnum
public enum TransportProtocol {
    @XmlEnumValue("RtspUnicast")
    RTSP_UNICAST("RtspUnicast"),
    @XmlEnumValue("RtspMulticast")
    RTSP_MULTICAST("RtspMulticast"),
    RTSP("RTSP"),
    @XmlEnumValue("RtspOverHttp")
    RTSP_OVER_HTTP("RtspOverHttp");
    private final String value;

    TransportProtocol(String v) {
        value = v;
    }

    public static TransportProtocol fromValue(String v) {
        for (TransportProtocol c : TransportProtocol.values()) {
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
