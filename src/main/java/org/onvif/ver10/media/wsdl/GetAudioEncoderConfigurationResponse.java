
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.AudioEncoderConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configuration"})
@XmlRootElement(name = "GetAudioEncoderConfigurationResponse")
public class GetAudioEncoderConfigurationResponse {

    @XmlElement(name = "Configuration", required = true)
    protected AudioEncoderConfiguration configuration;

    public void setConfiguration(AudioEncoderConfiguration value) {
        this.configuration = value;
    }
}
