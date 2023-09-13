
package org.w3._2005._08.addressing;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "AttributedAnyType",
        propOrder = {"any"})
public class AttributedAnyType {

    @XmlAnyElement(lax = true)
    protected Object any;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setAny(Object value) {
        this.any = value;
    }
}
