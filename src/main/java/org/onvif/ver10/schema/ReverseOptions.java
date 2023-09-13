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
        name = "ReverseOptions",
        propOrder = {"mode", "extension"})
public class ReverseOptions {

    @XmlElement(name = "Mode")
    protected List<ReverseMode> mode;

    @Getter @XmlElement(name = "Extension")
    protected ReverseOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<ReverseMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<ReverseMode>();
        }
        return this.mode;
    }

    public void setExtension(ReverseOptionsExtension value) {
        this.extension = value;
    }
}
