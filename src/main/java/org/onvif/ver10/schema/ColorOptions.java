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
        name = "ColorOptions",
        propOrder = {"colorList", "colorspaceRange"})
public class ColorOptions {

    @XmlElement(name = "ColorList")
    protected List<Color> colorList;

    @XmlElement(name = "ColorspaceRange")
    protected List<ColorspaceRange> colorspaceRange;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<Color> getColorList() {
        if (colorList == null) {
            colorList = new ArrayList<Color>();
        }
        return this.colorList;
    }

    public List<ColorspaceRange> getColorspaceRange() {
        if (colorspaceRange == null) {
            colorspaceRange = new ArrayList<ColorspaceRange>();
        }
        return this.colorspaceRange;
    }
}
