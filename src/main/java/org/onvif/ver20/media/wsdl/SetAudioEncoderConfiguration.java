package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.AudioEncoder2Configuration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configuration"})
@XmlRootElement(name = "SetAudioEncoderConfiguration")
public class SetAudioEncoderConfiguration {

    @XmlElement(name = "Configuration", required = true)
    protected AudioEncoder2Configuration configuration;

    public void setConfiguration(AudioEncoder2Configuration value) {
        this.configuration = value;
    }
}
