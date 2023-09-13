package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ReceiverMode")
@XmlEnum
public enum ReceiverMode {

    @XmlEnumValue("AutoConnect")
    AUTO_CONNECT("AutoConnect"),

    @XmlEnumValue("AlwaysConnect")
    ALWAYS_CONNECT("AlwaysConnect"),

    @XmlEnumValue("NeverConnect")
    NEVER_CONNECT("NeverConnect"),

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverMode(String v) {
        value = v;
    }

    public static ReceiverMode fromValue(String v) {
        for (ReceiverMode c : ReceiverMode.values()) {
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
