package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.PresetTour;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"profileToken", "presetTour"})
@XmlRootElement(name = "ModifyPresetTour")
public class ModifyPresetTour {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    @XmlElement(name = "PresetTour", required = true)
    protected PresetTour presetTour;

    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    public void setPresetTour(PresetTour value) {
        this.presetTour = value;
    }
}
