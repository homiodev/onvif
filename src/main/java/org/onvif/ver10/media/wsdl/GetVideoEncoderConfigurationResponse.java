
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.VideoEncoderConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configuration"})
@XmlRootElement(name = "GetVideoEncoderConfigurationResponse")
public class GetVideoEncoderConfigurationResponse {

    @XmlElement(name = "Configuration", required = true)
    protected VideoEncoderConfiguration configuration;

    public void setConfiguration(VideoEncoderConfiguration value) {
        this.configuration = value;
    }
}
