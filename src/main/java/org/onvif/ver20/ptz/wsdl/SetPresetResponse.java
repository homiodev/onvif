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
        propOrder = {"presetToken"})
@XmlRootElement(name = "SetPresetResponse")
public class SetPresetResponse {

    @XmlElement(name = "PresetToken", required = true)
    protected String presetToken;

    public void setPresetToken(String value) {
        this.presetToken = value;
    }
}
