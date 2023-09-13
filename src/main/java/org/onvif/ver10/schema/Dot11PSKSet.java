package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "Dot11PSKSet",
        propOrder = {"key", "passphrase", "extension"})
public class Dot11PSKSet {

    @XmlElement(name = "Key", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] key;

    @XmlElement(name = "Passphrase")
    protected String passphrase;

    @XmlElement(name = "Extension")
    protected Dot11PSKSetExtension extension;

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

    public void setKey(byte[] value) {
        this.key = value;
    }

    public void setPassphrase(String value) {
        this.passphrase = value;
    }

    public void setExtension(Dot11PSKSetExtension value) {
        this.extension = value;
    }
}
