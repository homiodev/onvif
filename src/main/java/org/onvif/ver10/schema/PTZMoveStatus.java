package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZMoveStatus",
        propOrder = {"panTilt", "zoom"})
public class PTZMoveStatus {

    @XmlElement(name = "PanTilt")
    protected MoveStatus panTilt;

    @XmlElement(name = "Zoom")
    protected MoveStatus zoom;

    public void setPanTilt(MoveStatus value) {
        this.panTilt = value;
    }

    public void setZoom(MoveStatus value) {
        this.zoom = value;
    }
}
