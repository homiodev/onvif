package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Polygon",
        propOrder = {"point"})
public class Polygon {

    @XmlElement(name = "Point", required = true)
    protected List<Vector> point;

    public List<Vector> getPoint() {
        if (point == null) {
            point = new ArrayList<Vector>();
        }
        return this.point;
    }
}
