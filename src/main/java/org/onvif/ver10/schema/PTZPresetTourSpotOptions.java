package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZPresetTourSpotOptions",
        propOrder = {"presetDetail", "stayTime", "any"})
public class PTZPresetTourSpotOptions {

    @XmlElement(name = "PresetDetail", required = true)
    protected PTZPresetTourPresetDetailOptions presetDetail;

    @Getter @XmlElement(name = "StayTime", required = true)
    protected DurationRange stayTime;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setPresetDetail(PTZPresetTourPresetDetailOptions value) {
        this.presetDetail = value;
    }

    public void setStayTime(DurationRange value) {
        this.stayTime = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
