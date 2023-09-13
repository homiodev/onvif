package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"profileToken", "presetTourToken"})
@XmlRootElement(name = "GetPresetTourOptions")
public class GetPresetTourOptions {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    @XmlElement(name = "PresetTourToken")
    protected String presetTourToken;

    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    public void setPresetTourToken(String value) {
        this.presetTourToken = value;
    }
}
