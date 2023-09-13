package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "User",
        propOrder = {"username", "password", "userLevel", "extension"})
public class User {

    @XmlElement(name = "Username", required = true)
    protected String username;

    @XmlElement(name = "Password")
    protected String password;

    @XmlElement(name = "UserLevel", required = true)
    protected UserLevel userLevel;

    @XmlElement(name = "Extension")
    protected UserExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();
}
