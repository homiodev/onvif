package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"profileToken", "name", "configuration"})
@XmlRootElement(name = "AddConfiguration")
public class AddConfiguration {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

     @XmlElement(name = "Name")
    protected String name;

    @XmlElement(name = "Configuration")
    protected List<ConfigurationRef> configuration;

    public List<ConfigurationRef> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<>();
        }
        return this.configuration;
    }
}
