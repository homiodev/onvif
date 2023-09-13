package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Frame",
        propOrder = {"ptzStatus", "transformation", "object", "objectTree", "extension"})
public class Frame {

    @XmlElement(name = "PTZStatus")
    protected PTZStatus ptzStatus;

    @Getter @XmlElement(name = "Transformation")
    protected Transformation transformation;

    @XmlElement(name = "Object")
    protected List<Object> object;

    @Getter @XmlElement(name = "ObjectTree")
    protected ObjectTree objectTree;

    @Getter @XmlElement(name = "Extension")
    protected FrameExtension extension;

    @Getter @XmlAttribute(name = "UtcTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcTime;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public PTZStatus getPTZStatus() {
        return ptzStatus;
    }

    public void setPTZStatus(PTZStatus value) {
        this.ptzStatus = value;
    }

    public void setTransformation(Transformation value) {
        this.transformation = value;
    }

    public List<Object> getObject() {
        if (object == null) {
            object = new ArrayList<Object>();
        }
        return this.object;
    }

    public void setObjectTree(ObjectTree value) {
        this.objectTree = value;
    }

    public void setExtension(FrameExtension value) {
        this.extension = value;
    }

    public void setUtcTime(XMLGregorianCalendar value) {
        this.utcTime = value;
    }
}
