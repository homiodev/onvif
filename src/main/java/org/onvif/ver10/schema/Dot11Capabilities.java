package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Dot11Capabilities",
        propOrder = {
                "tkip",
                "scanAvailableNetworks",
                "multipleConfiguration",
                "adHocStationMode",
                "wep",
                "any"
        })
public class Dot11Capabilities {

    @XmlElement(name = "TKIP")
    protected boolean tkip;

    @Getter @XmlElement(name = "ScanAvailableNetworks")
    protected boolean scanAvailableNetworks;

    @Getter @XmlElement(name = "MultipleConfiguration")
    protected boolean multipleConfiguration;

    @Getter @XmlElement(name = "AdHocStationMode")
    protected boolean adHocStationMode;

    @XmlElement(name = "WEP")
    protected boolean wep;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public boolean isTKIP() {
        return tkip;
    }

    public void setTKIP(boolean value) {
        this.tkip = value;
    }

    public void setScanAvailableNetworks(boolean value) {
        this.scanAvailableNetworks = value;
    }

    public void setMultipleConfiguration(boolean value) {
        this.multipleConfiguration = value;
    }

    public void setAdHocStationMode(boolean value) {
        this.adHocStationMode = value;
    }

    public boolean isWEP() {
        return wep;
    }

    public void setWEP(boolean value) {
        this.wep = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
