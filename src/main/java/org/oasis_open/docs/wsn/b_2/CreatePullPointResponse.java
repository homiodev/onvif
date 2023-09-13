
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import org.w3._2005._08.addressing.EndpointReferenceType;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"pullPoint", "any"})
@XmlRootElement(name = "CreatePullPointResponse")
public class CreatePullPointResponse {

    @XmlElement(name = "PullPoint", required = true)
    protected EndpointReferenceType pullPoint;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setPullPoint(EndpointReferenceType value) {
        this.pullPoint = value;
    }

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
