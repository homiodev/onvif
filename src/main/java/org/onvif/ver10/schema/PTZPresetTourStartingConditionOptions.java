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

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "PTZPresetTourStartingConditionOptions",
        propOrder = {"recurringTime", "recurringDuration", "direction", "extension"})
public class PTZPresetTourStartingConditionOptions {

    @XmlElement(name = "RecurringTime")
    protected IntRange recurringTime;

    @Getter @XmlElement(name = "RecurringDuration")
    protected DurationRange recurringDuration;

    @XmlElement(name = "Direction")
    protected List<PTZPresetTourDirection> direction;

    @Getter @XmlElement(name = "Extension")
    protected PTZPresetTourStartingConditionOptionsExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setRecurringTime(IntRange value) {
        this.recurringTime = value;
    }

    public void setRecurringDuration(DurationRange value) {
        this.recurringDuration = value;
    }

    public List<PTZPresetTourDirection> getDirection() {
        if (direction == null) {
            direction = new ArrayList<PTZPresetTourDirection>();
        }
        return this.direction;
    }

    public void setExtension(PTZPresetTourStartingConditionOptionsExtension value) {
        this.extension = value;
    }
}
