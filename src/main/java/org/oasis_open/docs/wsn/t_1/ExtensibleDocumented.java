package org.oasis_open.docs.wsn.t_1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ExtensibleDocumented",
        propOrder = {"documentation"})
@XmlSeeAlso({TopicSetType.class, TopicNamespaceType.class, TopicType.class})
public abstract class ExtensibleDocumented {

    protected Documentation documentation;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();
}
