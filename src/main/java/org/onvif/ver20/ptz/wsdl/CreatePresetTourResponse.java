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
        propOrder = {"presetTourToken"})
@XmlRootElement(name = "CreatePresetTourResponse")
public class CreatePresetTourResponse {

    @XmlElement(name = "PresetTourToken", required = true)
    protected String presetTourToken;

    public void setPresetTourToken(String value) {
        this.presetTourToken = value;
    }
}
