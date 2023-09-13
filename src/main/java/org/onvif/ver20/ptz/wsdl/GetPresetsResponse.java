package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.PTZPreset;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"preset"})
@XmlRootElement(name = "GetPresetsResponse")
public class GetPresetsResponse {

    @XmlElement(name = "Preset")
    protected List<PTZPreset> preset;

    public List<PTZPreset> getPreset() {
        if (preset == null) {
            preset = new ArrayList<PTZPreset>();
        }
        return this.preset;
    }
}
