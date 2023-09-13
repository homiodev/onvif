package org.onvif.ver20.media.wsdl;

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
        propOrder = {"videoSourceToken", "videoSourceModeToken"})
@XmlRootElement(name = "SetVideoSourceMode")
public class SetVideoSourceMode {

    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;

    @XmlElement(name = "VideoSourceModeToken", required = true)
    protected String videoSourceModeToken;

    public void setVideoSourceToken(String value) {
        this.videoSourceToken = value;
    }

    public void setVideoSourceModeToken(String value) {
        this.videoSourceModeToken = value;
    }
}
