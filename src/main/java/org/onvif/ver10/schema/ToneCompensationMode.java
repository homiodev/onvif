package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ToneCompensationMode")
@XmlEnum
public enum ToneCompensationMode {
    OFF,
    ON,
    AUTO;

    public static ToneCompensationMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
