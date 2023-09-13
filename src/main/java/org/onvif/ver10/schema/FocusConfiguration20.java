package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FocusConfiguration20",
        propOrder = {"autoFocusMode", "defaultSpeed", "nearLimit", "farLimit", "extension"})
public class FocusConfiguration20 {

    @XmlElement(name = "AutoFocusMode", required = true)
    protected AutoFocusMode autoFocusMode;

    @XmlElement(name = "DefaultSpeed")
    protected Float defaultSpeed;

    @XmlElement(name = "NearLimit")
    protected Float nearLimit;

    @XmlElement(name = "FarLimit")
    protected Float farLimit;

    @XmlElement(name = "Extension")
    protected FocusConfiguration20Extension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setAutoFocusMode(AutoFocusMode value) {
        this.autoFocusMode = value;
    }

    public void setDefaultSpeed(Float value) {
        this.defaultSpeed = value;
    }

    public void setNearLimit(Float value) {
        this.nearLimit = value;
    }

    public void setFarLimit(Float value) {
        this.farLimit = value;
    }

    public void setExtension(FocusConfiguration20Extension value) {
        this.extension = value;
    }
}
