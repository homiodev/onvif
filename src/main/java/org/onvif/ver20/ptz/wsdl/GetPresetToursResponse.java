package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.PresetTour;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"presetTour"})
@XmlRootElement(name = "GetPresetToursResponse")
public class GetPresetToursResponse {

    @XmlElement(name = "PresetTour")
    protected List<PresetTour> presetTour;

    public List<PresetTour> getPresetTour() {
        if (presetTour == null) {
            presetTour = new ArrayList<PresetTour>();
        }
        return this.presetTour;
    }
}
