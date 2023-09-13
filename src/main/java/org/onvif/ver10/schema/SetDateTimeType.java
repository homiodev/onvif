package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "SetDateTimeType")
@XmlEnum
public enum SetDateTimeType {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    NTP("NTP");
    private final String value;

    SetDateTimeType(String v) {
        value = v;
    }

    public static SetDateTimeType fromValue(String v) {
        for (SetDateTimeType c : SetDateTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }
}
