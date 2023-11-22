
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import org.onvif.ver10.schema.Dot1XConfiguration;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"dot1XConfiguration"})
@XmlRootElement(name = "CreateDot1XConfiguration")
public class CreateDot1XConfiguration {

    @XmlElement(name = "Dot1XConfiguration", required = true)
    protected @Setter Dot1XConfiguration dot1XConfiguration;
}
