package org.onvif.ver10.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.Getter;
import org.oasis_open.docs.wsn.b_2.FilterType;

@Getter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventFilter")
public class EventFilter extends FilterType {

    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<>();

}
