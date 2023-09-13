package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "IPv6DHCPConfiguration")
@XmlEnum
public enum IPv6DHCPConfiguration {
    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Stateful")
    STATEFUL("Stateful"),
    @XmlEnumValue("Stateless")
    STATELESS("Stateless"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    IPv6DHCPConfiguration(String v) {
        value = v;
    }

    public static IPv6DHCPConfiguration fromValue(String v) {
        for (IPv6DHCPConfiguration c : IPv6DHCPConfiguration.values()) {
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
