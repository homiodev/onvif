package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PolylineArray",
        propOrder = {"segment", "extension"})
public class PolylineArray {

    @XmlElement(name = "Segment", required = true)
    protected List<Polyline> segment;

    @Getter @XmlElement(name = "Extension")
    protected PolylineArrayExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Polyline> getSegment() {
        if (segment == null) {
            segment = new ArrayList<Polyline>();
        }
        return this.segment;
    }

    public void setExtension(PolylineArrayExtension value) {
        this.extension = value;
    }
}
