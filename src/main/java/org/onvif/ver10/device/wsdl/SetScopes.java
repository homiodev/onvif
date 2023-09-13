
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"scopes"})
@XmlRootElement(name = "SetScopes")
public class SetScopes {

    @XmlElement(name = "Scopes", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> scopes;

    public List<String> getScopes() {
        if (scopes == null) {
            scopes = new ArrayList<>();
        }
        return this.scopes;
    }
}
