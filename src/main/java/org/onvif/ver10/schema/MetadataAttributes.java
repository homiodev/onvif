package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
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
        name = "MetadataAttributes",
        propOrder = {"canContainPTZ", "canContainAnalytics", "canContainNotifications", "any"})
public class MetadataAttributes {

    @XmlElement(name = "CanContainPTZ")
    protected boolean canContainPTZ;

    @Getter @XmlElement(name = "CanContainAnalytics")
    protected boolean canContainAnalytics;

    @Getter @XmlElement(name = "CanContainNotifications")
    protected boolean canContainNotifications;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @XmlAttribute(name = "PtzSpaces")
    protected List<String> ptzSpaces;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setCanContainPTZ(boolean value) {
        this.canContainPTZ = value;
    }

    public void setCanContainAnalytics(boolean value) {
        this.canContainAnalytics = value;
    }

    public void setCanContainNotifications(boolean value) {
        this.canContainNotifications = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public List<String> getPtzSpaces() {
        if (ptzSpaces == null) {
            ptzSpaces = new ArrayList<>();
        }
        return this.ptzSpaces;
    }
}
