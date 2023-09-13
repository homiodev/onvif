package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Time",
        propOrder = {"hour", "minute", "second"})
public class Time {

    @XmlElement(name = "Hour")
    protected int hour;

    @XmlElement(name = "Minute")
    protected int minute;

    @XmlElement(name = "Second")
    protected int second;

    public void setHour(int value) {
        this.hour = value;
    }

    public void setMinute(int value) {
        this.minute = value;
    }

    public void setSecond(int value) {
        this.second = value;
    }
}
