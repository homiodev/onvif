package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MoveOptions",
        propOrder = {"absolute", "relative", "continuous"})
public class MoveOptions {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocusOptions absolute;

    @XmlElement(name = "Relative")
    protected RelativeFocusOptions relative;

    @XmlElement(name = "Continuous")
    protected ContinuousFocusOptions continuous;

    public void setAbsolute(AbsoluteFocusOptions value) {
        this.absolute = value;
    }

    public void setRelative(RelativeFocusOptions value) {
        this.relative = value;
    }

    public void setContinuous(ContinuousFocusOptions value) {
        this.continuous = value;
    }
}
