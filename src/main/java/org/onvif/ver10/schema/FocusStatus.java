package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FocusStatus",
        propOrder = {"position", "moveStatus", "error", "any"})
public class FocusStatus {

    @XmlElement(name = "Position")
    protected float position;

    @Getter @XmlElement(name = "MoveStatus", required = true)
    protected MoveStatus moveStatus;

    @Getter @XmlElement(name = "Error", required = true)
    protected String error;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
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

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
