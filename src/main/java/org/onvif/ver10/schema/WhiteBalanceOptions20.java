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
        name = "WhiteBalanceOptions20",
        propOrder = {"mode", "yrGain", "ybGain", "extension"})
public class WhiteBalanceOptions20 {

    @XmlElement(name = "Mode", required = true)
    protected List<WhiteBalanceMode> mode;

    @Getter @XmlElement(name = "YrGain")
    protected FloatRange yrGain;

    @Getter @XmlElement(name = "YbGain")
    protected FloatRange ybGain;

    @Getter @XmlElement(name = "Extension")
    protected WhiteBalanceOptions20Extension extension;

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

    public void setExtension(WhiteBalanceOptions20Extension value) {
        this.extension = value;
    }
}
