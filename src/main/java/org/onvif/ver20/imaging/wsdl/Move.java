package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.FocusMove;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"videoSourceToken", "focus"})
@XmlRootElement(name = "Move")
public class Move {

    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;

    @XmlElement(name = "Focus", required = true)
    protected FocusMove focus;

    public void setVideoSourceToken(String value) {
        this.videoSourceToken = value;
    }

    public void setFocus(FocusMove value) {
        this.focus = value;
    }
}
