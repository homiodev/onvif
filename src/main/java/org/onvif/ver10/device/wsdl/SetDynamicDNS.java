
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import lombok.Getter;
import org.onvif.ver10.schema.DynamicDNSType;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"type", "name", "ttl"})
@XmlRootElement(name = "SetDynamicDNS")
public class SetDynamicDNS {

    @XmlElement(name = "Type", required = true)
    protected DynamicDNSType type;

    @Getter @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    @XmlElement(name = "TTL")
    protected Duration ttl;

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
}
