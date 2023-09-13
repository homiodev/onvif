package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZFilter",
        propOrder = {"status", "position"})
public class PTZFilter {

    @XmlElement(name = "Status")
    protected boolean status;

    @XmlElement(name = "Position")
    protected boolean position;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setStatus(boolean value) {
        this.status = value;
    }

    public void setPosition(boolean value) {
        this.position = value;
    }
}
