
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.OSDConfigurationOptions;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"osdOptions", "any"})
@XmlRootElement(name = "GetOSDOptionsResponse")
public class GetOSDOptionsResponse {

    @XmlElement(name = "OSDOptions", required = true)
    protected OSDConfigurationOptions osdOptions;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public OSDConfigurationOptions getOSDOptions() {
        return osdOptions;
    }

    public void setOSDOptions(OSDConfigurationOptions value) {
        this.osdOptions = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
