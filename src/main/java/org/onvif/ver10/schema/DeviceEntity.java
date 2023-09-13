package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceEntity")
@XmlSeeAlso({
        RelayOutput.class,
        NetworkInterface.class,
        VideoOutput.class,
        AudioSource.class,
        OSDConfiguration.class,
        AudioOutput.class,
        VideoSource.class,
        DigitalInput.class,
        PTZNode.class
})
public class DeviceEntity {

    @XmlAttribute(name = "token", required = true)
    protected String token;

    public void setToken(String value) {
        this.token = value;
    }
}
