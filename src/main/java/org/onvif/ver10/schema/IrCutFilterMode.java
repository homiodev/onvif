package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "IrCutFilterMode")
@XmlEnum
public enum IrCutFilterMode {
    ON,
    OFF,
    AUTO;

    public static IrCutFilterMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
