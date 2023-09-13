package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "UserLevel")
@XmlEnum
public enum UserLevel {
    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),
    @XmlEnumValue("Extended")
    EXTENDED("Extended");
    private final String value;

    UserLevel(String v) {
        value = v;
    }

    public static UserLevel fromValue(String v) {
        for (UserLevel c : UserLevel.values()) {
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
