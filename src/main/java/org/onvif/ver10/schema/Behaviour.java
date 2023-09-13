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
        name = "Behaviour",
        propOrder = {"removed", "idle", "extension"})
public class Behaviour {

    @XmlElement(name = "Removed")
    protected Behaviour.Removed removed;

    @XmlElement(name = "Idle")
    protected Behaviour.Idle idle;

    @XmlElement(name = "Extension")
    protected BehaviourExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setRemoved(Behaviour.Removed value) {
        this.removed = value;
    }

    public void setIdle(Behaviour.Idle value) {
        this.idle = value;
    }

    public void setExtension(BehaviourExtension value) {
        this.extension = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"})
    public static class Idle {

        @XmlAnyElement(lax = true)
        protected List<java.lang.Object> any;

        public List<java.lang.Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
            name = "",
            propOrder = {"any"})
    public static class Removed {

        @XmlAnyElement(lax = true)
        protected List<java.lang.Object> any;

        public List<java.lang.Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }
    }
}
