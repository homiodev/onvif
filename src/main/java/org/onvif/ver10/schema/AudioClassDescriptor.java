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
        name = "AudioClassDescriptor",
        propOrder = {"classCandidate", "extension"})
public class AudioClassDescriptor {

    @XmlElement(name = "ClassCandidate")
    protected List<AudioClassCandidate> classCandidate;

    @Getter @XmlElement(name = "Extension")
    protected AudioClassDescriptorExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public List<AudioClassCandidate> getClassCandidate() {
        if (classCandidate == null) {
            classCandidate = new ArrayList<AudioClassCandidate>();
        }
        return this.classCandidate;
    }

    public void setExtension(AudioClassDescriptorExtension value) {
        this.extension = value;
    }
}
