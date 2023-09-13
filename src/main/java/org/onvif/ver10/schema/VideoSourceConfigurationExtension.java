package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "VideoSourceConfigurationExtension",
        propOrder = {"rotate", "extension"})
public class VideoSourceConfigurationExtension {

    @XmlElement(name = "Rotate")
    protected Rotate rotate;

    @XmlElement(name = "Extension")
    protected VideoSourceConfigurationExtension2 extension;

    public void setRotate(Rotate value) {
        this.rotate = value;
    }

    public void setExtension(VideoSourceConfigurationExtension2 value) {
        this.extension = value;
    }
}
