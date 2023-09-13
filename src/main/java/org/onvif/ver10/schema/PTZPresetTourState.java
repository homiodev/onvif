package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "PTZPresetTourState")
@XmlEnum
public enum PTZPresetTourState {
    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Touring")
    TOURING("Touring"),
    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    PTZPresetTourState(String v) {
        value = v;
    }

    public static PTZPresetTourState fromValue(String v) {
        for (PTZPresetTourState c : PTZPresetTourState.values()) {
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
