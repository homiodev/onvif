
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.StreamSetup;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"streamSetup", "profileToken"})
@XmlRootElement(name = "GetStreamUri")
public class GetStreamUri {

    @XmlElement(name = "StreamSetup", required = true)
    protected StreamSetup streamSetup;

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;

    public void setStreamSetup(StreamSetup value) {
        this.streamSetup = value;
    }

    public void setProfileToken(String value) {
        this.profileToken = value;
    }
}
