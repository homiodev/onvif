package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "WideDynamicRangeOptions",
        propOrder = {"mode", "level"})
public class WideDynamicRangeOptions {

    @XmlElement(name = "Mode", required = true)
    protected List<WideDynamicMode> mode;

    @Getter @XmlElement(name = "Level", required = true)
    protected FloatRange level;

    public List<WideDynamicMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<>();
        }
        return this.mode;
    }

    public void setLevel(FloatRange value) {
        this.level = value;
    }
}
