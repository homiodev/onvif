package org.oasis_open.docs.wsrf.bf_2;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _BaseFault_QNAME =
            new QName("http://docs.oasis-open.org/wsrf/bf-2", "BaseFault");

    public ObjectFactory() {
    }

    public BaseFaultType createBaseFaultType() {
        return new BaseFaultType();
    }

    public BaseFaultType.ErrorCode createBaseFaultTypeErrorCode() {
        return new BaseFaultType.ErrorCode();
    }

    public BaseFaultType.Description createBaseFaultTypeDescription() {
        return new BaseFaultType.Description();
    }

    public BaseFaultType.FaultCause createBaseFaultTypeFaultCause() {
        return new BaseFaultType.FaultCause();
    }

    @XmlElementDecl(namespace = "http://docs.oasis-open.org/wsrf/bf-2", name = "BaseFault")
    public JAXBElement<BaseFaultType> createBaseFault(BaseFaultType value) {
        return new JAXBElement<BaseFaultType>(_BaseFault_QNAME, BaseFaultType.class, null, value);
    }
}
