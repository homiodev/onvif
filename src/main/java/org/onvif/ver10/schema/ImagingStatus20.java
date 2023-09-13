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
        name = "ImagingStatus20",
        propOrder = {"focusStatus20", "extension"})
public class ImagingStatus20 {

    @XmlElement(name = "FocusStatus20")
    protected FocusStatus20 focusStatus20;

    @XmlElement(name = "Extension")
    protected ImagingStatus20Extension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setFocusStatus20(FocusStatus20 value) {
        this.focusStatus20 = value;
    }

    public void setExtension(ImagingStatus20Extension value) {
        this.extension = value;
    }
}
