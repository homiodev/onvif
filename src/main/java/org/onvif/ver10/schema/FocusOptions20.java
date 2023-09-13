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
        name = "FocusOptions20",
        propOrder = {"autoFocusModes", "defaultSpeed", "nearLimit", "farLimit", "extension"})
public class FocusOptions20 {

    @XmlElement(name = "AutoFocusModes")
    protected List<AutoFocusMode> autoFocusModes;

    @Getter @XmlElement(name = "DefaultSpeed")
    protected FloatRange defaultSpeed;

    @Getter @XmlElement(name = "NearLimit")
    protected FloatRange nearLimit;

    @Getter @XmlElement(name = "FarLimit")
    protected FloatRange farLimit;

    @Getter @XmlElement(name = "Extension")
    protected FocusOptions20Extension extension;

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

    public void setExtension(FocusOptions20Extension value) {
        this.extension = value;
    }
}
