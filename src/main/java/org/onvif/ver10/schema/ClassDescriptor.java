package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "ClassDescriptor",
    propOrder = {"classCandidate", "extension"})
public class ClassDescriptor {

    @XmlElement(name = "ClassCandidate")
    protected List<ClassDescriptor.ClassCandidate> classCandidate;

    @XmlElement(name = "Extension")
    protected ClassDescriptorExtension extension;

    public List<ClassDescriptor.ClassCandidate> getClassCandidate() {
        if (classCandidate == null) {
            classCandidate = new ArrayList<>();
        }
        return this.classCandidate;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {"type", "likelihood"})
    public static class ClassCandidate {

        @XmlElement(name = "Type", required = true)
        protected ClassType type;

        @XmlElement(name = "Likelihood")
        protected float likelihood;
    }
}
