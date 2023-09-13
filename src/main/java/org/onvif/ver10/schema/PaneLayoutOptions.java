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
        name = "PaneLayoutOptions",
        propOrder = {"area", "extension"})
public class PaneLayoutOptions {

    @XmlElement(name = "Area", required = true)
    protected List<Rectangle> area;

    @Getter @XmlElement(name = "Extension")
    protected PaneOptionExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Rectangle> getArea() {
        if (area == null) {
            area = new ArrayList<Rectangle>();
        }
        return this.area;
    }

    public void setExtension(PaneOptionExtension value) {
        this.extension = value;
    }
}
