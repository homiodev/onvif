package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DurationRange",
        propOrder = {"min", "max"})
public class DurationRange {

    @XmlElement(name = "Min", required = true)
    protected Duration min;

    @XmlElement(name = "Max", required = true)
    protected Duration max;

    public void setMin(Duration value) {
        this.min = value;
    }

    public void setMax(Duration value) {
        this.max = value;
    }
}
