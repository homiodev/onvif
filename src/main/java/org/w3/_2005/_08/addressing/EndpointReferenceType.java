package org.w3._2005._08.addressing;

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
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "EndpointReferenceType",
        propOrder = {"address", "referenceParameters", "metadata", "any"})
@ToString
public class EndpointReferenceType {

    @XmlElement(name = "Address", required = true)
    protected AttributedURIType address;

    @XmlElement(name = "ReferenceParameters")
    protected ReferenceParametersType referenceParameters;

    @XmlElement(name = "Metadata")
    protected MetadataType metadata;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
