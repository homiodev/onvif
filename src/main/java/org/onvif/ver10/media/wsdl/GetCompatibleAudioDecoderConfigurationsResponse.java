
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.AudioDecoderConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configurations"})
@XmlRootElement(name = "GetCompatibleAudioDecoderConfigurationsResponse")
public class GetCompatibleAudioDecoderConfigurationsResponse {

    @XmlElement(name = "Configurations")
    protected List<AudioDecoderConfiguration> configurations;

    public List<AudioDecoderConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<AudioDecoderConfiguration>();
        }
        return this.configurations;
    }
}
