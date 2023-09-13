package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OSDConfiguration",
        propOrder = {
                "videoSourceConfigurationToken",
                "type",
                "position",
                "textString",
                "image",
                "extension"
        })
public class OSDConfiguration extends DeviceEntity {

    @XmlElement(name = "VideoSourceConfigurationToken", required = true)
    protected OSDReference videoSourceConfigurationToken;

    @XmlElement(name = "Type", required = true)
    protected OSDType type;

    @XmlElement(name = "Position", required = true)
    protected OSDPosConfiguration position;

    @XmlElement(name = "TextString")
    protected OSDTextConfiguration textString;

    @XmlElement(name = "Image")
    protected OSDImgConfiguration image;

    @XmlElement(name = "Extension")
    protected OSDConfigurationExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setVideoSourceConfigurationToken(OSDReference value) {
        this.videoSourceConfigurationToken = value;
    }

    public void setType(OSDType value) {
        this.type = value;
    }

    public void setPosition(OSDPosConfiguration value) {
        this.position = value;
    }

    public void setTextString(OSDTextConfiguration value) {
        this.textString = value;
    }

    public void setImage(OSDImgConfiguration value) {
        this.image = value;
    }

    public void setExtension(OSDConfigurationExtension value) {
        this.extension = value;
    }
}
