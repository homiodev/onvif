package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZPreset",
        propOrder = {"name", "ptzPosition"})
public class PTZPreset {

    @XmlElement(name = "Name")
    protected String name;

    @XmlElement(name = "PTZPosition")
    protected PTZVector ptzPosition;

    @Getter @XmlAttribute(name = "token")
    protected String token;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setName(String value) {
        this.name = value;
    }

    public PTZVector getPTZPosition() {
        return ptzPosition;
    }

    public void setPTZPosition(PTZVector value) {
        this.ptzPosition = value;
    }

    public void setToken(String value) {
        this.token = value;
    }
}
