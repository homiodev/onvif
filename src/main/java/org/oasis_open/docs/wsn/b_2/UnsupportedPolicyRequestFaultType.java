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
        name = "UnsupportedPolicyRequestFaultType",
        propOrder = {"unsupportedPolicy"})
public class UnsupportedPolicyRequestFaultType extends BaseFaultType {

    @XmlElement(name = "UnsupportedPolicy")
    protected List<QName> unsupportedPolicy;

    public List<QName> getUnsupportedPolicy() {
        if (unsupportedPolicy == null) {
            unsupportedPolicy = new ArrayList<>();
        }
        return this.unsupportedPolicy;
    }
}
