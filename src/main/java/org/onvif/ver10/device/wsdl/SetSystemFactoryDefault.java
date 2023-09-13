
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.FactoryDefaultType;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"factoryDefault"})
@XmlRootElement(name = "SetSystemFactoryDefault")
public class SetSystemFactoryDefault {

    @XmlElement(name = "FactoryDefault", required = true)
    protected FactoryDefaultType factoryDefault;

    public void setFactoryDefault(FactoryDefaultType value) {
        this.factoryDefault = value;
    }
}
