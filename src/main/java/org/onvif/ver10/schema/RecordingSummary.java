package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "RecordingSummary",
        propOrder = {"dataFrom", "dataUntil", "numberRecordings", "any"})
public class RecordingSummary {

    @XmlElement(name = "DataFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFrom;

    @Getter @XmlElement(name = "DataUntil", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUntil;

    @Getter @XmlElement(name = "NumberRecordings")
    protected int numberRecordings;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setDataFrom(XMLGregorianCalendar value) {
        this.dataFrom = value;
    }

    public void setDataUntil(XMLGregorianCalendar value) {
        this.dataUntil = value;
    }

    public void setNumberRecordings(int value) {
        this.numberRecordings = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
