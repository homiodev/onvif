package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.VideoSourceConfigurationOptions;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"options"})
@XmlRootElement(name = "GetVideoSourceConfigurationOptionsResponse")
public class GetVideoSourceConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected VideoSourceConfigurationOptions options;

    public void setOptions(VideoSourceConfigurationOptions value) {
        this.options = value;
    }
}
