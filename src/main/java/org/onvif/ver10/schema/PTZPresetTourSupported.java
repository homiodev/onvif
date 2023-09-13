package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
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
        name = "PTZPresetTourSupported",
        propOrder = {"maximumNumberOfPresetTours", "ptzPresetTourOperation", "extension"})
public class PTZPresetTourSupported {

    @XmlElement(name = "MaximumNumberOfPresetTours")
    protected int maximumNumberOfPresetTours;

    @XmlElement(name = "PTZPresetTourOperation")
    protected List<PTZPresetTourOperation> ptzPresetTourOperation;

    @Getter @XmlElement(name = "Extension")
    protected PTZPresetTourSupportedExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setMaximumNumberOfPresetTours(int value) {
        this.maximumNumberOfPresetTours = value;
    }

    public List<PTZPresetTourOperation> getPTZPresetTourOperation() {
        if (ptzPresetTourOperation == null) {
            ptzPresetTourOperation = new ArrayList<PTZPresetTourOperation>();
        }
        return this.ptzPresetTourOperation;
    }

    public void setExtension(PTZPresetTourSupportedExtension value) {
        this.extension = value;
    }
}
