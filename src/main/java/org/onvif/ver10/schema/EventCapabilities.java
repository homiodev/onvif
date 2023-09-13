package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "EventCapabilities",
        propOrder = {
                "xAddr",
                "wsSubscriptionPolicySupport",
                "wsPullPointSupport",
                "wsPausableSubscriptionManagerInterfaceSupport",
                "any"
        })
public class EventCapabilities {

    @XmlElement(name = "XAddr", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String xAddr;

    @XmlElement(name = "WSSubscriptionPolicySupport")
    protected boolean wsSubscriptionPolicySupport;

    @XmlElement(name = "WSPullPointSupport")
    protected boolean wsPullPointSupport;

    @XmlElement(name = "WSPausableSubscriptionManagerInterfaceSupport")
    protected boolean wsPausableSubscriptionManagerInterfaceSupport;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public String getXAddr() {
        return xAddr;
    }

    public void setXAddr(String value) {
        this.xAddr = value;
    }

    public boolean isWSSubscriptionPolicySupport() {
        return wsSubscriptionPolicySupport;
    }

    public void setWSSubscriptionPolicySupport(boolean value) {
        this.wsSubscriptionPolicySupport = value;
    }

    public boolean isWSPullPointSupport() {
        return wsPullPointSupport;
    }

    public void setWSPullPointSupport(boolean value) {
        this.wsPullPointSupport = value;
    }

    public boolean isWSPausableSubscriptionManagerInterfaceSupport() {
        return wsPausableSubscriptionManagerInterfaceSupport;
    }

    public void setWSPausableSubscriptionManagerInterfaceSupport(boolean value) {
        this.wsPausableSubscriptionManagerInterfaceSupport = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
