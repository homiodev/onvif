package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "ReceiverState")
@XmlEnum
public enum ReceiverState {

    @XmlEnumValue("NotConnected")
    NOT_CONNECTED("NotConnected"),

    @XmlEnumValue("Connecting")
    CONNECTING("Connecting"),

    @XmlEnumValue("Connected")
    CONNECTED("Connected"),

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ReceiverState(String v) {
        value = v;
    }

    public static ReceiverState fromValue(String v) {
        for (ReceiverState c : ReceiverState.values()) {
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
