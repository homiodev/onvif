package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ExposureMode")
@XmlEnum
public enum ExposureMode {
    AUTO,
    MANUAL;

    public static ExposureMode fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
