
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.VideoAnalyticsConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"configurations"})
@XmlRootElement(name = "GetVideoAnalyticsConfigurationsResponse")
public class GetVideoAnalyticsConfigurationsResponse {

    @XmlElement(name = "Configurations")
    protected List<VideoAnalyticsConfiguration> configurations;

    public List<VideoAnalyticsConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<VideoAnalyticsConfiguration>();
        }
        return this.configurations;
    }
}
