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
        name = "PTZNodeExtension",
        propOrder = {"any", "supportedPresetTour", "extension"})
public class PTZNodeExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlElement(name = "SupportedPresetTour")
    protected PTZPresetTourSupported supportedPresetTour;

    @Getter @XmlElement(name = "Extension")
    protected PTZNodeExtension2 extension;

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    public void setSupportedPresetTour(PTZPresetTourSupported value) {
        this.supportedPresetTour = value;
    }

    public void setExtension(PTZNodeExtension2 value) {
        this.extension = value;
    }
}
