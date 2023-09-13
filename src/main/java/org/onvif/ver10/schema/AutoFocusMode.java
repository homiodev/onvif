package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "AutoFocusMode")
@XmlEnum
public enum AutoFocusMode {
    AUTO,
    MANUAL;

    public static AutoFocusMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
