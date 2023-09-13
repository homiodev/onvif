
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import org.onvif.ver10.schema.EventFilter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "FilterType",
        propOrder = {"any"})
@XmlSeeAlso({EventFilter.class})
public class FilterType {

    @XmlAnyElement(lax = true)
    protected List<Object> any;

    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }
}
