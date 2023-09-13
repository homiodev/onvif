
package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.OSDConfiguration;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"osd", "any"})
@XmlRootElement(name = "SetOSD")
public class SetOSD {

    @XmlElement(name = "OSD", required = true)
    protected OSDConfiguration osd;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public OSDConfiguration getOSD() {
        return osd;
    }

    public void setOSD(OSDConfiguration value) {
        this.osd = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
