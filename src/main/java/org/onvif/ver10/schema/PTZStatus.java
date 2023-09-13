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
        name = "PTZStatus",
        propOrder = {"position", "moveStatus", "error", "utcTime", "any"})
public class PTZStatus {

    @XmlElement(name = "Position")
    protected PTZVector position;

    @Getter @XmlElement(name = "MoveStatus")
    protected PTZMoveStatus moveStatus;

    @Getter @XmlElement(name = "Error")
    protected String error;

    @Getter @XmlElement(name = "UtcTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTime;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setPosition(PTZVector value) {
        this.position = value;
    }

    public void setMoveStatus(PTZMoveStatus value) {
        this.moveStatus = value;
    }

    public void setError(String value) {
        this.error = value;
    }

    public void setUtcTime(XMLGregorianCalendar value) {
        this.utcTime = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
