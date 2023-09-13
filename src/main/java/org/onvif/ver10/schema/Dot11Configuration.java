package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
        name = "Dot11Configuration",
        propOrder = {"ssid", "mode", "alias", "priority", "security", "any"})
public class Dot11Configuration {

    @XmlElement(name = "SSID", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] ssid;

    @Getter @XmlElement(name = "Mode", required = true)
    protected Dot11StationMode mode;

    @Getter @XmlElement(name = "Alias", required = true)
    protected String alias;

    @Getter @XmlElement(name = "Priority")
    protected int priority;

    @Getter @XmlElement(name = "Security", required = true)
    protected Dot11SecurityConfiguration security;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public byte[] getSSID() {
        return ssid;
    }

    public void setSSID(byte[] value) {
        this.ssid = value;
    }

    public void setMode(Dot11StationMode value) {
        this.mode = value;
    }

    public void setAlias(String value) {
        this.alias = value;
    }

    public void setPriority(int value) {
        this.priority = value;
    }

    public void setSecurity(Dot11SecurityConfiguration value) {
        this.security = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
