package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
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
        name = "PTZPositionFilter",
        propOrder = {"minPosition", "maxPosition", "enterOrExit", "any"})
public class PTZPositionFilter {

    @XmlElement(name = "MinPosition", required = true)
    protected PTZVector minPosition;

    @Getter @XmlElement(name = "MaxPosition", required = true)
    protected PTZVector maxPosition;

    @Getter @XmlElement(name = "EnterOrExit")
    protected boolean enterOrExit;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setMinPosition(PTZVector value) {
        this.minPosition = value;
    }

    public void setMaxPosition(PTZVector value) {
        this.maxPosition = value;
    }

    public void setEnterOrExit(boolean value) {
        this.enterOrExit = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
