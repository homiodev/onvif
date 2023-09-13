package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FocusStatus20",
        propOrder = {"position", "moveStatus", "error", "extension"})
public class FocusStatus20 {

    @XmlElement(name = "Position")
    protected float position;

    @XmlElement(name = "MoveStatus", required = true)
    protected MoveStatus moveStatus;

    @XmlElement(name = "Error")
    protected String error;

    @XmlElement(name = "Extension")
    protected FocusStatus20Extension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setPosition(float value) {
        this.position = value;
    }

    public void setMoveStatus(MoveStatus value) {
        this.moveStatus = value;
    }

    public void setError(String value) {
        this.error = value;
    }

    public void setExtension(FocusStatus20Extension value) {
        this.extension = value;
    }
}
