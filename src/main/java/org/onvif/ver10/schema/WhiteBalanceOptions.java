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
        name = "WhiteBalanceOptions",
        propOrder = {"mode", "yrGain", "ybGain"})
public class WhiteBalanceOptions {

    @XmlElement(name = "Mode", required = true)
    protected List<WhiteBalanceMode> mode;

    @Getter @XmlElement(name = "YrGain", required = true)
    protected FloatRange yrGain;

    @Getter @XmlElement(name = "YbGain", required = true)
    protected FloatRange ybGain;

    public List<WhiteBalanceMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<WhiteBalanceMode>();
        }
        return this.mode;
    }

    public void setYrGain(FloatRange value) {
        this.yrGain = value;
    }

    public void setYbGain(FloatRange value) {
        this.ybGain = value;
    }
}
