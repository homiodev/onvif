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
        name = "RemoteUser",
        propOrder = {"username", "password", "useDerivedPassword", "any"})
public class RemoteUser {

    @XmlElement(name = "Username", required = true)
    protected String username;

    @Getter @XmlElement(name = "Password")
    protected String password;

    @Getter @XmlElement(name = "UseDerivedPassword")
    protected boolean useDerivedPassword;

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setUsername(String value) {
        this.username = value;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public void setUseDerivedPassword(boolean value) {
        this.useDerivedPassword = value;
    }

    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }
}
