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
        name = "DateTimeRange",
        propOrder = {"from", "until", "any"})
public class DateTimeRange {

    @XmlElement(name = "From", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;

    @Getter @XmlElement(name = "Until", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar until;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    public void setUntil(XMLGregorianCalendar value) {
        this.until = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
