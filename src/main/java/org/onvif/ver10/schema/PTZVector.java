package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZVector",
        propOrder = {"panTilt", "zoom"})
public class PTZVector {

    @XmlElement(name = "PanTilt")
    protected Vector2D panTilt;

    @XmlElement(name = "Zoom")
    protected Vector1D zoom;

    public PTZVector(float x, float y, float z) {
        this.panTilt = new Vector2D();
        this.panTilt.x = x;
        this.panTilt.y = y;
        this.zoom = new Vector1D();
        this.zoom.x = z;
    }
}
