package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
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
        name = "PresetTour",
        propOrder = {"name", "status", "autoStart", "startingCondition", "tourSpot", "extension"})
public class PresetTour {

    @XmlElement(name = "Name")
    protected String name;

    @Getter @XmlElement(name = "Status", required = true)
    protected PTZPresetTourStatus status;

    @Getter @XmlElement(name = "AutoStart")
    protected boolean autoStart;

    @Getter @XmlElement(name = "StartingCondition", required = true)
    protected PTZPresetTourStartingCondition startingCondition;

    @XmlElement(name = "TourSpot")
    protected List<PTZPresetTourSpot> tourSpot;

    @Getter @XmlElement(name = "Extension")
    protected PTZPresetTourExtension extension;

    @Getter @XmlAttribute(name = "token")
    protected String token;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setName(String value) {
        this.name = value;
    }

    public void setStatus(PTZPresetTourStatus value) {
        this.status = value;
    }

    public void setAutoStart(boolean value) {
        this.autoStart = value;
    }

    public void setStartingCondition(PTZPresetTourStartingCondition value) {
        this.startingCondition = value;
    }

    public List<PTZPresetTourSpot> getTourSpot() {
        if (tourSpot == null) {
            tourSpot = new ArrayList<PTZPresetTourSpot>();
        }
        return this.tourSpot;
    }

    public void setExtension(PTZPresetTourExtension value) {
        this.extension = value;
    }

    public void setToken(String value) {
        this.token = value;
    }
}
