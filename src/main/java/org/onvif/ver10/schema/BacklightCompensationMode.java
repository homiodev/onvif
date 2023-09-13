package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "BacklightCompensationMode")
@XmlEnum
public enum BacklightCompensationMode {

    OFF,

    ON;

    public static BacklightCompensationMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
