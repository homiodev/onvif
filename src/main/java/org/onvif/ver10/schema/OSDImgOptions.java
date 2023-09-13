package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "OSDImgOptions",
        propOrder = {"imagePath", "extension"})
public class OSDImgOptions {

    @XmlElement(name = "ImagePath", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> imagePath;

    @Getter @XmlElement(name = "Extension")
    protected OSDImgOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<String> getImagePath() {
        if (imagePath == null) {
            imagePath = new ArrayList<>();
        }
        return this.imagePath;
    }

    public void setExtension(OSDImgOptionsExtension value) {
        this.extension = value;
    }
}
