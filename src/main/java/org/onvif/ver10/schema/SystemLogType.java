package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "SystemLogType")
@XmlEnum
public enum SystemLogType {

    @XmlEnumValue("System")
    SYSTEM("System"),

    @XmlEnumValue("Access")
    ACCESS("Access");
    private final String value;

    SystemLogType(String v) {
        value = v;
    }

    public static SystemLogType fromValue(String v) {
        for (SystemLogType c : SystemLogType.values()) {
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
