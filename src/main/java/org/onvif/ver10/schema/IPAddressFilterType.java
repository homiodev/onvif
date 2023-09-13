package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "IPAddressFilterType")
@XmlEnum
public enum IPAddressFilterType {
    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Deny")
    DENY("Deny");
    private final String value;

    IPAddressFilterType(String v) {
        value = v;
    }

    public static IPAddressFilterType fromValue(String v) {
        for (IPAddressFilterType c : IPAddressFilterType.values()) {
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
