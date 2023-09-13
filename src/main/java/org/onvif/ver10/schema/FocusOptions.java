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
        name = "FocusOptions",
        propOrder = {"autoFocusModes", "defaultSpeed", "nearLimit", "farLimit"})
public class FocusOptions {

    @XmlElement(name = "AutoFocusModes")
    protected List<AutoFocusMode> autoFocusModes;

    @Getter @XmlElement(name = "DefaultSpeed", required = true)
    protected FloatRange defaultSpeed;

    @Getter @XmlElement(name = "NearLimit", required = true)
    protected FloatRange nearLimit;

    @Getter @XmlElement(name = "FarLimit", required = true)
    protected FloatRange farLimit;

    public List<AutoFocusMode> getAutoFocusModes() {
        if (autoFocusModes == null) {
            autoFocusModes = new ArrayList<AutoFocusMode>();
        }
        return this.autoFocusModes;
    }

    public void setDefaultSpeed(FloatRange value) {
        this.defaultSpeed = value;
    }

    public void setNearLimit(FloatRange value) {
        this.nearLimit = value;
    }

    public void setFarLimit(FloatRange value) {
        this.farLimit = value;
    }
}
