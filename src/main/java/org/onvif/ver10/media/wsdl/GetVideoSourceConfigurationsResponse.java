
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.VideoSourceConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configurations"})
@XmlRootElement(name = "GetVideoSourceConfigurationsResponse")
public class GetVideoSourceConfigurationsResponse {

    @XmlElement(name = "Configurations")
    protected List<VideoSourceConfiguration> configurations;

    public List<VideoSourceConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<VideoSourceConfiguration>();
        }
        return this.configurations;
    }
}
