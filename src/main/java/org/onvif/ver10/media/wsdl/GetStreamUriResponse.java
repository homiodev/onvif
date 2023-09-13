
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import org.onvif.ver10.schema.MediaUri;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"mediaUri"})
@XmlRootElement(name = "GetStreamUriResponse")
public class GetStreamUriResponse {

    @XmlElement(name = "MediaUri", required = true)
    protected MediaUri mediaUri;

    public void setMediaUri(MediaUri value) {
        this.mediaUri = value;
    }
}
