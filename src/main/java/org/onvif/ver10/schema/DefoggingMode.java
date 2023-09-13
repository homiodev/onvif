package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "DefoggingMode")
@XmlEnum
public enum DefoggingMode {
    OFF,
    ON,
    AUTO;

    public static DefoggingMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
