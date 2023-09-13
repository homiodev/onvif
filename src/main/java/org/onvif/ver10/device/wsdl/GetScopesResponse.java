
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.Scope;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"scopes"})
@XmlRootElement(name = "GetScopesResponse")
public class GetScopesResponse {

    @XmlElement(name = "Scopes", required = true)
    protected List<Scope> scopes;

    public List<Scope> getScopes() {
        if (scopes == null) {
            scopes = new ArrayList<Scope>();
        }
        return this.scopes;
    }
}
