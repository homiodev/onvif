package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DateTime",
        propOrder = {"time", "date"})
public class DateTime {

    @XmlElement(name = "Time", required = true)
    protected Time time;

    @XmlElement(name = "Date", required = true)
    protected Date date;

    public void setTime(Time value) {
        this.time = value;
    }

    public void setDate(Date value) {
        this.date = value;
    }
}
