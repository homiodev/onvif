
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"maximumNumber", "any"})
@XmlRootElement(name = "GetMessages")
public class GetMessages {

    @XmlElement(name = "MaximumNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumNumber;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setMaximumNumber(BigInteger value) {
        this.maximumNumber = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
