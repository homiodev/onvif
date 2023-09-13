package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaximumNumberOfOSDs")
public class MaximumNumberOfOSDs {

    @XmlAttribute(name = "Total", required = true)
    protected int total;

    @XmlAttribute(name = "Image")
    protected Integer image;

    @XmlAttribute(name = "PlainText")
    protected Integer plainText;

    @XmlAttribute(name = "Date")
    protected Integer date;

    @XmlAttribute(name = "Time")
    protected Integer time;

    @XmlAttribute(name = "DateAndTime")
    protected Integer dateAndTime;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setTotal(int value) {
        this.total = value;
    }

    public void setImage(Integer value) {
        this.image = value;
    }

    public void setPlainText(Integer value) {
        this.plainText = value;
    }

    public void setDate(Integer value) {
        this.date = value;
    }

    public void setTime(Integer value) {
        this.time = value;
    }

    public void setDateAndTime(Integer value) {
        this.dateAndTime = value;
    }
}
