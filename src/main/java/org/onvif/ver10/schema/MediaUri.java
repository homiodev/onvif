package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "MediaUri",
        propOrder = {"uri", "invalidAfterConnect", "invalidAfterReboot", "timeout", "any"})
public class MediaUri {

    @XmlElement(name = "Uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    @Getter @XmlElement(name = "InvalidAfterConnect")
    protected boolean invalidAfterConnect;

    @Getter @XmlElement(name = "InvalidAfterReboot")
    protected boolean invalidAfterReboot;

    @Getter @XmlElement(name = "Timeout", required = true)
    protected Duration timeout;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setUri(String value) {
        this.uri = value;
    }

    public void setInvalidAfterConnect(boolean value) {
        this.invalidAfterConnect = value;
    }

    public void setInvalidAfterReboot(boolean value) {
        this.invalidAfterReboot = value;
    }

    public void setTimeout(Duration value) {
        this.timeout = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
