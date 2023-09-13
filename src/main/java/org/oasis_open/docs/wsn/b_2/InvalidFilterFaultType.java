
package org.oasis_open.docs.wsn.b_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import org.oasis_open.docs.wsrf.bf_2.BaseFaultType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "InvalidFilterFaultType",
        propOrder = {"unknownFilter"})
public class InvalidFilterFaultType extends BaseFaultType {

    @XmlElement(name = "UnknownFilter", required = true)
    protected List<QName> unknownFilter;

    public List<QName> getUnknownFilter() {
        if (unknownFilter == null) {
            unknownFilter = new ArrayList<QName>();
        }
        return this.unknownFilter;
    }
}
