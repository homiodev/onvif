package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "Enabled")
@XmlEnum
public enum Enabled {
    ENABLED,
    DISABLED;

    public static Enabled fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
