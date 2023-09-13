package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.AudioOutputConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configurations"})
@XmlRootElement(name = "GetAudioOutputConfigurationsResponse")
public class GetAudioOutputConfigurationsResponse {

    @XmlElement(name = "Configurations")
    protected List<AudioOutputConfiguration> configurations;

    public List<AudioOutputConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<AudioOutputConfiguration>();
        }
        return this.configurations;
    }
}
