package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FocusMove",
        propOrder = {"absolute", "relative", "continuous"})
public class FocusMove {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocus absolute;

    @XmlElement(name = "Relative")
    protected RelativeFocus relative;

    @XmlElement(name = "Continuous")
    protected ContinuousFocus continuous;

    public void setAbsolute(AbsoluteFocus value) {
        this.absolute = value;
    }

    public void setRelative(RelativeFocus value) {
        this.relative = value;
    }

    public void setContinuous(ContinuousFocus value) {
        this.continuous = value;
    }
}
