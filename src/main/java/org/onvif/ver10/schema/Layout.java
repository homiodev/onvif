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
        name = "Layout",
        propOrder = {"paneLayout", "extension"})
public class Layout {

    @XmlElement(name = "PaneLayout", required = true)
    protected List<PaneLayout> paneLayout;

    @Getter @XmlElement(name = "Extension")
    protected LayoutExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<PaneLayout> getPaneLayout() {
        if (paneLayout == null) {
            paneLayout = new ArrayList<PaneLayout>();
        }
        return this.paneLayout;
    }

    public void setExtension(LayoutExtension value) {
        this.extension = value;
    }
}
