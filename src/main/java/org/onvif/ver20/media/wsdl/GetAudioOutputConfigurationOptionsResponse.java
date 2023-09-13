package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.AudioOutputConfigurationOptions;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"options"})
@XmlRootElement(name = "GetAudioOutputConfigurationOptionsResponse")
public class GetAudioOutputConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected AudioOutputConfigurationOptions options;

    public void setOptions(AudioOutputConfigurationOptions value) {
        this.options = value;
    }
}
