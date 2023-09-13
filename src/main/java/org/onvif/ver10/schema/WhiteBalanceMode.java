package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "WhiteBalanceMode")
@XmlEnum
public enum WhiteBalanceMode {
    AUTO,
    MANUAL;

    public static WhiteBalanceMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
