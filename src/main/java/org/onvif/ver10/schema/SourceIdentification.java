package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
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
        name = "SourceIdentification",
        propOrder = {"name", "token", "extension"})
public class SourceIdentification {

    @XmlElement(name = "Name", required = true)
    protected String name;

    @XmlElement(name = "Token", required = true)
    protected List<String> token;

    @Getter @XmlElement(name = "Extension")
    protected SourceIdentificationExtension extension;

    @Getter @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setName(String value) {
        this.name = value;
    }

    public List<String> getToken() {
        if (token == null) {
            token = new ArrayList<>();
        }
        return this.token;
    }

    public void setExtension(SourceIdentificationExtension value) {
        this.extension = value;
    }
}
