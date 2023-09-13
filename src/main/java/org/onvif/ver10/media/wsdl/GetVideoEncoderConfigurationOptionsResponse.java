
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.VideoEncoderConfigurationOptions;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"options"})
@XmlRootElement(name = "GetVideoEncoderConfigurationOptionsResponse")
public class GetVideoEncoderConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected VideoEncoderConfigurationOptions options;

    public void setOptions(VideoEncoderConfigurationOptions value) {
        this.options = value;
    }
}
