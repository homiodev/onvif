package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "IrCutFilterAutoBoundaryType")
@XmlEnum
public enum IrCutFilterAutoBoundaryType {
    @XmlEnumValue("Common")
    COMMON("Common"),
    @XmlEnumValue("ToOn")
    TO_ON("ToOn"),
    @XmlEnumValue("ToOff")
    TO_OFF("ToOff"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    IrCutFilterAutoBoundaryType(String v) {
        value = v;
    }

    public static IrCutFilterAutoBoundaryType fromValue(String v) {
        for (IrCutFilterAutoBoundaryType c : IrCutFilterAutoBoundaryType.values()) {
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
