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
        name = "LayoutOptions",
        propOrder = {"paneLayoutOptions", "extension"})
public class LayoutOptions {

    @XmlElement(name = "PaneLayoutOptions", required = true)
    protected List<PaneLayoutOptions> paneLayoutOptions;

    @Getter @XmlElement(name = "Extension")
    protected LayoutOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<PaneLayoutOptions> getPaneLayoutOptions() {
        if (paneLayoutOptions == null) {
            paneLayoutOptions = new ArrayList<PaneLayoutOptions>();
        }
        return this.paneLayoutOptions;
    }

    public void setExtension(LayoutOptionsExtension value) {
        this.extension = value;
    }
}
