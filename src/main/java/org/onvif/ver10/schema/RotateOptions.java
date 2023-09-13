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
        name = "RotateOptions",
        propOrder = {"mode", "degreeList", "extension"})
public class RotateOptions {

    @XmlElement(name = "Mode", required = true)
    protected List<RotateMode> mode;

    @Getter @XmlElement(name = "DegreeList")
    protected IntList degreeList;

    @Getter @XmlElement(name = "Extension")
    protected RotateOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<RotateMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<RotateMode>();
        }
        return this.mode;
    }

    public void setDegreeList(IntList value) {
        this.degreeList = value;
    }

    public void setExtension(RotateOptionsExtension value) {
        this.extension = value;
    }
}
