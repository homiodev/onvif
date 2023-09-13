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
        name = "TrackInformation",
        propOrder = {"trackToken", "trackType", "description", "dataFrom", "dataTo", "any"})
public class TrackInformation {

    @XmlElement(name = "TrackToken", required = true)
    protected String trackToken;

    @Getter @XmlElement(name = "TrackType", required = true)
    protected TrackType trackType;

    @Getter @XmlElement(name = "Description", required = true)
    protected String description;

    @Getter @XmlElement(name = "DataFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFrom;

    @Getter @XmlElement(name = "DataTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataTo;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setTrackToken(String value) {
        this.trackToken = value;
    }

    public void setTrackType(TrackType value) {
        this.trackType = value;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public void setDataFrom(XMLGregorianCalendar value) {
        this.dataFrom = value;
    }

    public void setDataTo(XMLGregorianCalendar value) {
        this.dataTo = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
