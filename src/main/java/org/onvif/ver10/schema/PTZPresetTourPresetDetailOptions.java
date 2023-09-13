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
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "PTZPresetTourPresetDetailOptions",
    propOrder = {"presetToken", "home", "panTiltPositionSpace", "zoomPositionSpace", "extension"})
public class PTZPresetTourPresetDetailOptions {

    @XmlElement(name = "PresetToken")
    protected List<String> presetToken;

    @XmlElement(name = "Home")
    protected Boolean home;

    @Getter @XmlElement(name = "PanTiltPositionSpace")
    protected Space2DDescription panTiltPositionSpace;

    @Getter @XmlElement(name = "ZoomPositionSpace")
    protected Space1DDescription zoomPositionSpace;

    @Getter @XmlElement(name = "Extension")
    protected PTZPresetTourPresetDetailOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<String> getPresetToken() {
        if (presetToken == null) {
            presetToken = new ArrayList<>();
        }
        return this.presetToken;
    }
}
