

package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"osdToken", "any"})
@XmlRootElement(name = "GetOSD")
public class GetOSD {

    @XmlElement(name = "OSDToken", required = true)
    protected String osdToken;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public String getOSDToken() {
        return osdToken;
    }

    public void setOSDToken(String value) {
        this.osdToken = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
