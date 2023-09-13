
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.Dot1XConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"dot1XConfiguration"})
@XmlRootElement(name = "GetDot1XConfigurationsResponse")
public class GetDot1XConfigurationsResponse {

    @XmlElement(name = "Dot1XConfiguration")
    protected List<Dot1XConfiguration> dot1XConfiguration;

    public List<Dot1XConfiguration> getDot1XConfiguration() {
        if (dot1XConfiguration == null) {
            dot1XConfiguration = new ArrayList<Dot1XConfiguration>();
        }
        return this.dot1XConfiguration;
    }
}
