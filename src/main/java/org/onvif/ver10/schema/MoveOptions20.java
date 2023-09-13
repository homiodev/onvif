package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MoveOptions20",
        propOrder = {"absolute", "relative", "continuous"})
public class MoveOptions20 {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocusOptions absolute;

    @XmlElement(name = "Relative")
    protected RelativeFocusOptions20 relative;

    @XmlElement(name = "Continuous")
    protected ContinuousFocusOptions continuous;

    public void setAbsolute(AbsoluteFocusOptions value) {
        this.absolute = value;
    }

    public void setRelative(RelativeFocusOptions20 value) {
        this.relative = value;
    }

    public void setContinuous(ContinuousFocusOptions value) {
        this.continuous = value;
    }
}
