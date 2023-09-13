package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "CapabilityCategory")
@XmlEnum
public enum CapabilityCategory {
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("Events")
    EVENTS("Events"),
    @XmlEnumValue("Imaging")
    IMAGING("Imaging"),
    @XmlEnumValue("Media")
    MEDIA("Media"),
    PTZ("PTZ");
    private final String value;

    CapabilityCategory(String v) {
        value = v;
    }

    public static CapabilityCategory fromValue(String v) {
        for (CapabilityCategory c : CapabilityCategory.values()) {
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
