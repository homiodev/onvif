package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Date",
        propOrder = {"year", "month", "day"})
public class Date {

    @XmlElement(name = "Year")
    protected int year;

    @XmlElement(name = "Month")
    protected int month;

    @XmlElement(name = "Day")
    protected int day;

    public void setYear(int value) {
        this.year = value;
    }

    public void setMonth(int value) {
        this.month = value;
    }

    public void setDay(int value) {
        this.day = value;
    }
}
