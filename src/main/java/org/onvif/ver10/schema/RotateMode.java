package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "RotateMode")
@XmlEnum
public enum RotateMode {
    OFF,
    ON,
    AUTO;

    public static RotateMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
