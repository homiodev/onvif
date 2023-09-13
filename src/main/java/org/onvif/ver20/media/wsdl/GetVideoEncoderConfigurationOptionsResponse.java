package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.VideoEncoder2ConfigurationOptions;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"options"})
@XmlRootElement(name = "GetVideoEncoderConfigurationOptionsResponse")
public class GetVideoEncoderConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected List<VideoEncoder2ConfigurationOptions> options;

    public List<VideoEncoder2ConfigurationOptions> getOptions() {
        if (options == null) {
            options = new ArrayList<VideoEncoder2ConfigurationOptions>();
        }
        return this.options;
    }
}
