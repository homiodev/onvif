package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "RecordingStatus")
@XmlEnum
public enum RecordingStatus {
    @XmlEnumValue("Initiated")
    INITIATED("Initiated"),
    @XmlEnumValue("Recording")
    RECORDING("Recording"),
    @XmlEnumValue("Stopped")
    STOPPED("Stopped"),
    @XmlEnumValue("Removing")
    REMOVING("Removing"),
    @XmlEnumValue("Removed")
    REMOVED("Removed"),

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    RecordingStatus(String v) {
        value = v;
    }

    public static RecordingStatus fromValue(String v) {
        for (RecordingStatus c : RecordingStatus.values()) {
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
