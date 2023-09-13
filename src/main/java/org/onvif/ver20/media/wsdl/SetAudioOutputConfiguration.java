package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.AudioOutputConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configuration"})
@XmlRootElement(name = "SetAudioOutputConfiguration")
public class SetAudioOutputConfiguration {

    @XmlElement(name = "Configuration", required = true)
    protected AudioOutputConfiguration configuration;

    public void setConfiguration(AudioOutputConfiguration value) {
        this.configuration = value;
    }
}
