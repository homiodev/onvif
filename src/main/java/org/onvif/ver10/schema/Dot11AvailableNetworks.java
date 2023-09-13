package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Dot11AvailableNetworks",
        propOrder = {
                "ssid",
                "bssid",
                "authAndMangementSuite",
                "pairCipher",
                "groupCipher",
                "signalStrength",
                "extension"
        })
public class Dot11AvailableNetworks {

    @XmlElement(name = "SSID", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] ssid;

    @XmlElement(name = "BSSID")
    protected String bssid;

    @XmlElement(name = "AuthAndMangementSuite")
    protected List<Dot11AuthAndMangementSuite> authAndMangementSuite;

    @XmlElement(name = "PairCipher")
    protected List<Dot11Cipher> pairCipher;

    @XmlElement(name = "GroupCipher")
    protected List<Dot11Cipher> groupCipher;

    @Getter @XmlElement(name = "SignalStrength")
    protected Dot11SignalStrength signalStrength;

    @Getter @XmlElement(name = "Extension")
    protected Dot11AvailableNetworksExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public byte[] getSSID() {
        return ssid;
    }

    public void setSSID(byte[] value) {
        this.ssid = value;
    }

    public String getBSSID() {
        return bssid;
    }

    public void setBSSID(String value) {
        this.bssid = value;
    }

    public List<Dot11AuthAndMangementSuite> getAuthAndMangementSuite() {
        if (authAndMangementSuite == null) {
            authAndMangementSuite = new ArrayList<Dot11AuthAndMangementSuite>();
        }
        return this.authAndMangementSuite;
    }

    public List<Dot11Cipher> getPairCipher() {
        if (pairCipher == null) {
            pairCipher = new ArrayList<Dot11Cipher>();
        }
        return this.pairCipher;
    }

    public List<Dot11Cipher> getGroupCipher() {
        if (groupCipher == null) {
            groupCipher = new ArrayList<Dot11Cipher>();
        }
        return this.groupCipher;
    }

    public void setSignalStrength(Dot11SignalStrength value) {
        this.signalStrength = value;
    }

    public void setExtension(Dot11AvailableNetworksExtension value) {
        this.extension = value;
    }
}
