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
        name = "ArrayOfFileProgress",
        propOrder = {"fileProgress", "extension"})
public class ArrayOfFileProgress {

    @XmlElement(name = "FileProgress")
    protected List<FileProgress> fileProgress;

    @Getter @XmlElement(name = "Extension")
    protected ArrayOfFileProgressExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<FileProgress> getFileProgress() {
        if (fileProgress == null) {
            fileProgress = new ArrayList<>();
        }
        return this.fileProgress;
    }

    public void setExtension(ArrayOfFileProgressExtension value) {
        this.extension = value;
    }
}
