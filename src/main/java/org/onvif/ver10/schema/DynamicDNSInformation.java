package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "DynamicDNSInformation",
        propOrder = {"type", "name", "ttl", "extension"})
public class DynamicDNSInformation {

    @XmlElement(name = "Type", required = true)
    protected DynamicDNSType type;

    @Getter @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    @XmlElement(name = "TTL")
    protected Duration ttl;

    @Getter @XmlElement(name = "Extension")
    protected DynamicDNSInformationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setType(DynamicDNSType value) {
        this.type = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Duration getTTL() {
        return ttl;
    }

    public void setTTL(Duration value) {
        this.ttl = value;
    }

    public void setExtension(DynamicDNSInformationExtension value) {
        this.extension = value;
    }
}
