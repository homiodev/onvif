
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.onvif.ver10.schema.NetworkHost;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"fromDHCP", "ntpManual"})
@XmlRootElement(name = "SetNTP")
public class SetNTP {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;

    @XmlElement(name = "NTPManual")
    protected List<NetworkHost> ntpManual;

    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

    public List<NetworkHost> getNTPManual() {
        if (ntpManual == null) {
            ntpManual = new ArrayList<NetworkHost>();
        }
        return this.ntpManual;
    }
}
