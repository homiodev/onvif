package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
        name = "PTZPresetTourPresetDetail",
        propOrder = {"presetToken", "home", "ptzPosition", "typeExtension", "any"})
public class PTZPresetTourPresetDetail {

    @XmlElement(name = "PresetToken")
    protected String presetToken;

    @XmlElement(name = "Home")
    protected Boolean home;

    @XmlElement(name = "PTZPosition")
    protected PTZVector ptzPosition;

    @Getter @XmlElement(name = "TypeExtension")
    protected PTZPresetTourTypeExtension typeExtension;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setPresetToken(String value) {
        this.presetToken = value;
    }

    public Boolean isHome() {
        return home;
    }

    public void setHome(Boolean value) {
        this.home = value;
    }

    public PTZVector getPTZPosition() {
        return ptzPosition;
    }

    public void setPTZPosition(PTZVector value) {
        this.ptzPosition = value;
    }

    public void setTypeExtension(PTZPresetTourTypeExtension value) {
        this.typeExtension = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
