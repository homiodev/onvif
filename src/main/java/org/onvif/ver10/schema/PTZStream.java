package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZStream",
        propOrder = {"ptzStatusOrExtension"})
public class PTZStream {

    @XmlElements({
            @XmlElement(name = "PTZStatus", type = PTZStatus.class),
            @XmlElement(name = "Extension", type = PTZStreamExtension.class)
    })
    protected List<java.lang.Object> ptzStatusOrExtension;

    public List<java.lang.Object> getPTZStatusOrExtension() {
        if (ptzStatusOrExtension == null) {
            ptzStatusOrExtension = new ArrayList<>();
        }
        return this.ptzStatusOrExtension;
    }
}
