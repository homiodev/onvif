
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.AudioEncoderConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configurations"})
@XmlRootElement(name = "GetAudioEncoderConfigurationsResponse")
public class GetAudioEncoderConfigurationsResponse {

    @XmlElement(name = "Configurations")
    protected List<AudioEncoderConfiguration> configurations;

    public List<AudioEncoderConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<AudioEncoderConfiguration>();
        }
        return this.configurations;
    }
}
