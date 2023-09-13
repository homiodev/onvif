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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTControlDirectionOptions",
        propOrder = {"eFlip", "reverse", "extension"})
public class PTControlDirectionOptions {

    @XmlElement(name = "EFlip")
    protected EFlipOptions eFlip;

    @Getter @XmlElement(name = "Reverse")
    protected ReverseOptions reverse;

    @Getter @XmlElement(name = "Extension")
    protected PTControlDirectionOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public EFlipOptions getEFlip() {
        return eFlip;
    }

    public void setEFlip(EFlipOptions value) {
        this.eFlip = value;
    }

    public void setReverse(ReverseOptions value) {
        this.reverse = value;
    }

    public void setExtension(PTControlDirectionOptionsExtension value) {
        this.extension = value;
    }
}
