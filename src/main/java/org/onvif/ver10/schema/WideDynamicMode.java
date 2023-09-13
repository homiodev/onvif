package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "WideDynamicMode")
@XmlEnum
public enum WideDynamicMode {
    OFF,
    ON;

    public static WideDynamicMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
