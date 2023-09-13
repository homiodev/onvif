package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"name", "configuration"})
@XmlRootElement(name = "CreateProfile")
public class CreateProfile {

    @XmlElement(name = "Name", required = true)
    protected String name;

    @XmlElement(name = "Configuration")
    protected List<ConfigurationRef> configuration;

    public void setName(String value) {
        this.name = value;
    }

    public List<ConfigurationRef> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<ConfigurationRef>();
        }
        return this.configuration;
    }
}
