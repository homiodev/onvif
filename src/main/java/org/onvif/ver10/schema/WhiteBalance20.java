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
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "WhiteBalance20",
        propOrder = {"mode", "crGain", "cbGain", "extension"})
public class WhiteBalance20 {

    @XmlElement(name = "Mode", required = true)
    protected WhiteBalanceMode mode;

    @XmlElement(name = "CrGain")
    protected Float crGain;

    @XmlElement(name = "CbGain")
    protected Float cbGain;

    @XmlElement(name = "Extension")
    protected WhiteBalance20Extension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();
}
