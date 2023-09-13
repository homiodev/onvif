package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.AudioEncoder2ConfigurationOptions;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"options"})
@XmlRootElement(name = "GetAudioEncoderConfigurationOptionsResponse")
public class GetAudioEncoderConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected List<AudioEncoder2ConfigurationOptions> options;

    public List<AudioEncoder2ConfigurationOptions> getOptions() {
        if (options == null) {
            options = new ArrayList<AudioEncoder2ConfigurationOptions>();
        }
        return this.options;
    }
}
