package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import lombok.Getter;
import lombok.Setter;
import org.onvif.ver10.schema.PTZSpeed;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"profileToken", "velocity", "timeout"})
@XmlRootElement(name = "ContinuousMove")
public class ContinuousMove {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    @XmlElement(name = "Velocity", required = true)
    protected PTZSpeed velocity;

    @XmlElement(name = "Timeout")
    protected Duration timeout;
}
