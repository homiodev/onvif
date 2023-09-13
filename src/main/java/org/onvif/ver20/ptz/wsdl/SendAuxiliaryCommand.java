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
        propOrder = {"profileToken", "auxiliaryData"})
@XmlRootElement(name = "SendAuxiliaryCommand")
public class SendAuxiliaryCommand {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    @XmlElement(name = "AuxiliaryData", required = true)
    protected String auxiliaryData;

    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    public void setAuxiliaryData(String value) {
        this.auxiliaryData = value;
    }
}
