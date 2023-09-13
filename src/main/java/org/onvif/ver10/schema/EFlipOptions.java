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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "EFlipOptions",
        propOrder = {"mode", "extension"})
public class EFlipOptions {

    @XmlElement(name = "Mode")
    protected List<EFlipMode> mode;

    @Getter @XmlElement(name = "Extension")
    protected EFlipOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<EFlipMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<EFlipMode>();
        }
        return this.mode;
    }

    public void setExtension(EFlipOptionsExtension value) {
        this.extension = value;
    }
}
