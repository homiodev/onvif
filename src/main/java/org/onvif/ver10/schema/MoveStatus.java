package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "MoveStatus")
@XmlEnum
public enum MoveStatus {
    IDLE,
    MOVING,
    UNKNOWN;

    public static MoveStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
