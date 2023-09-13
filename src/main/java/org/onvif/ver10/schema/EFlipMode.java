package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "EFlipMode")
@XmlEnum
public enum EFlipMode {
    OFF("OFF"),
    ON("ON"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    EFlipMode(String v) {
        value = v;
    }

    public static EFlipMode fromValue(String v) {
        for (EFlipMode c : EFlipMode.values()) {
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
