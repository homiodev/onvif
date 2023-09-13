
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.VideoEncoderConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configurations"})
@XmlRootElement(name = "GetVideoEncoderConfigurationsResponse")
public class GetVideoEncoderConfigurationsResponse {

    @XmlElement(name = "Configurations")
    protected List<VideoEncoderConfiguration> configurations;

    public List<VideoEncoderConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<VideoEncoderConfiguration>();
        }
        return this.configurations;
    }
}
