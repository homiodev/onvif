
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.BinaryData;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"pkcs10Request"})
@XmlRootElement(name = "GetPkcs10RequestResponse")
public class GetPkcs10RequestResponse {

    @XmlElement(name = "Pkcs10Request", required = true)
    protected BinaryData pkcs10Request;

    public void setPkcs10Request(BinaryData value) {
        this.pkcs10Request = value;
    }
}
