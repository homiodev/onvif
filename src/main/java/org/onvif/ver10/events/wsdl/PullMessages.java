package org.onvif.ver10.events.wsdl;

import de.onvif.soap.SOAP;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"timeout", "messageLimit", "any"})
@XmlRootElement(name = "PullMessages")
public class PullMessages {

    @XmlElement(name = "Timeout", required = true)
    protected Duration timeout = SOAP.DATATYPE_FACTORY.newDuration("PT8S");

    @XmlElement(name = "MessageLimit")
    protected int messageLimit = 1;

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
