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
        propOrder = {"presetTour"})
@XmlRootElement(name = "GetPresetTourResponse")
public class GetPresetTourResponse {

    @XmlElement(name = "PresetTour", required = true)
    protected PresetTour presetTour;

    public void setPresetTour(PresetTour value) {
        this.presetTour = value;
    }
}
