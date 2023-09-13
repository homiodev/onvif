package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NTPInformation",
        propOrder = {"fromDHCP", "ntpFromDHCP", "ntpManual", "extension"})
public class NTPInformation {

    @XmlElement(name = "FromDHCP")
    protected boolean fromDHCP;

    @XmlElement(name = "NTPFromDHCP")
    protected List<NetworkHost> ntpFromDHCP;

    @XmlElement(name = "NTPManual")
    protected List<NetworkHost> ntpManual;

    @Getter @XmlElement(name = "Extension")
    protected NTPInformationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setFromDHCP(boolean value) {
        this.fromDHCP = value;
    }

    public List<NetworkHost> getNTPFromDHCP() {
        if (ntpFromDHCP == null) {
            ntpFromDHCP = new ArrayList<NetworkHost>();
        }
        return this.ntpFromDHCP;
    }

    public List<NetworkHost> getNTPManual() {
        if (ntpManual == null) {
            ntpManual = new ArrayList<NetworkHost>();
        }
        return this.ntpManual;
    }

    public void setExtension(NTPInformationExtension value) {
        this.extension = value;
    }
}
