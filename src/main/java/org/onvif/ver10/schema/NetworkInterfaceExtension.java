package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "NetworkInterfaceExtension",
        propOrder = {"any", "interfaceType", "dot3", "dot11", "extension"})
public class NetworkInterfaceExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "InterfaceType")
    protected int interfaceType;

    @XmlElement(name = "Dot3")
    protected List<Dot3Configuration> dot3;

    @XmlElement(name = "Dot11")
    protected List<Dot11Configuration> dot11;

    @Getter @XmlElement(name = "Extension")
    protected NetworkInterfaceExtension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setInterfaceType(int value) {
        this.interfaceType = value;
    }

    public List<Dot3Configuration> getDot3() {
        if (dot3 == null) {
            dot3 = new ArrayList<Dot3Configuration>();
        }
        return this.dot3;
    }

    public List<Dot11Configuration> getDot11() {
        if (dot11 == null) {
            dot11 = new ArrayList<Dot11Configuration>();
        }
        return this.dot11;
    }

    public void setExtension(NetworkInterfaceExtension2 value) {
        this.extension = value;
    }
}
