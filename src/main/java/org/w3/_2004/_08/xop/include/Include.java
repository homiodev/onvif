

package org.w3._2004._08.xop.include;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Include",
        propOrder = {"any"})
public class Include {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @Getter @XmlAttribute(name = "href", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
    public void setHref(String value) {
        this.href = value;
    }
}
