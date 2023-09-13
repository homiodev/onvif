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
        name = "PTZConfigurationExtension",
        propOrder = {"any", "ptControlDirection", "extension"})
public class PTZConfigurationExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @XmlElement(name = "PTControlDirection")
    protected PTControlDirection ptControlDirection;

    @Getter @XmlElement(name = "Extension")
    protected PTZConfigurationExtension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public PTControlDirection getPTControlDirection() {
        return ptControlDirection;
    }

    public void setPTControlDirection(PTControlDirection value) {
        this.ptControlDirection = value;
    }

    public void setExtension(PTZConfigurationExtension2 value) {
        this.extension = value;
    }
}
