package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "SearchState")
@XmlEnum
public enum SearchState {

    @XmlEnumValue("Queued")
    QUEUED("Queued"),

    @XmlEnumValue("Searching")
    SEARCHING("Searching"),

    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    SearchState(String v) {
        value = v;
    }

    public static SearchState fromValue(String v) {
        for (SearchState c : SearchState.values()) {
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
