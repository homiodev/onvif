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
        name = "PTZPresetTourStatus",
        propOrder = {"state", "currentTourSpot", "extension"})
public class PTZPresetTourStatus {

    @XmlElement(name = "State", required = true)
    protected PTZPresetTourState state;

    @XmlElement(name = "CurrentTourSpot")
    protected PTZPresetTourSpot currentTourSpot;

    @XmlElement(name = "Extension")
    protected PTZPresetTourStatusExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setState(PTZPresetTourState value) {
        this.state = value;
    }

    public void setCurrentTourSpot(PTZPresetTourSpot value) {
        this.currentTourSpot = value;
    }

    public void setExtension(PTZPresetTourStatusExtension value) {
        this.extension = value;
    }
}
