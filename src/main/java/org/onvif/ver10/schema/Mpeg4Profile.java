package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "Mpeg4Profile")
@XmlEnum
public enum Mpeg4Profile {
    SP,
    ASP;

    public static Mpeg4Profile fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }
}
