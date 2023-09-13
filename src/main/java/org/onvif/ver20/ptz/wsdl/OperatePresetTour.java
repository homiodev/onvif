package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.PTZPresetTourOperation;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"profileToken", "presetTourToken", "operation"})
@XmlRootElement(name = "OperatePresetTour")
public class OperatePresetTour {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    @XmlElement(name = "PresetTourToken", required = true)
    protected String presetTourToken;

    @XmlElement(name = "Operation", required = true)
    protected PTZPresetTourOperation operation;

    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    public void setPresetTourToken(String value) {
        this.presetTourToken = value;
    }

    public void setOperation(PTZPresetTourOperation value) {
        this.operation = value;
    }
}
