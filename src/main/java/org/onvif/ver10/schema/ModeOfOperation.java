package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ModeOfOperation")
@XmlEnum
public enum ModeOfOperation {
    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ModeOfOperation(String v) {
        value = v;
    }

    public static ModeOfOperation fromValue(String v) {
        for (ModeOfOperation c : ModeOfOperation.values()) {
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
