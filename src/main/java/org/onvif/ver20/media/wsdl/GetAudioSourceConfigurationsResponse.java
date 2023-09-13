package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.AudioSourceConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configurations"})
@XmlRootElement(name = "GetAudioSourceConfigurationsResponse")
public class GetAudioSourceConfigurationsResponse {

    @XmlElement(name = "Configurations")
    protected List<AudioSourceConfiguration> configurations;

    public List<AudioSourceConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<AudioSourceConfiguration>();
        }
        return this.configurations;
    }
}
