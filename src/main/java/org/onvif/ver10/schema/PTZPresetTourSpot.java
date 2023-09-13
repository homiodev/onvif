package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZPresetTourSpot",
        propOrder = {"presetDetail", "speed", "stayTime", "extension"})
public class PTZPresetTourSpot {

    @XmlElement(name = "PresetDetail", required = true)
    protected PTZPresetTourPresetDetail presetDetail;

    @XmlElement(name = "Speed")
    protected PTZSpeed speed;

    @XmlElement(name = "StayTime")
    protected Duration stayTime;

    @XmlElement(name = "Extension")
    protected PTZPresetTourSpotExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setPresetDetail(PTZPresetTourPresetDetail value) {
        this.presetDetail = value;
    }

    public void setSpeed(PTZSpeed value) {
        this.speed = value;
    }

    public void setStayTime(Duration value) {
        this.stayTime = value;
    }

    public void setExtension(PTZPresetTourSpotExtension value) {
        this.extension = value;
    }
}
