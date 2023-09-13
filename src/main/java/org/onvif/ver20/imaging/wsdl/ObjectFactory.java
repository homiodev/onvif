package org.onvif.ver20.imaging.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _Capabilities_QNAME =
            new QName("http://www.onvif.org/ver20/imaging/wsdl", "Capabilities");

    public ObjectFactory() {
    }

    public GetOptions createGetOptions() {
        return new GetOptions();
    }

    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    public GetImagingSettings createGetImagingSettings() {
        return new GetImagingSettings();
    }

    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    public GetOptionsResponse createGetOptionsResponse() {
        return new GetOptionsResponse();
    }

    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    public Stop createStop() {
        return new Stop();
    }

    public SetImagingSettingsResponse createSetImagingSettingsResponse() {
        return new SetImagingSettingsResponse();
    }

    public StopResponse createStopResponse() {
        return new StopResponse();
    }

    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    public Move createMove() {
        return new Move();
    }

    public GetImagingSettingsResponse createGetImagingSettingsResponse() {
        return new GetImagingSettingsResponse();
    }

    public SetImagingSettings createSetImagingSettings() {
        return new SetImagingSettings();
    }

    public GetMoveOptions createGetMoveOptions() {
        return new GetMoveOptions();
    }

    public GetMoveOptionsResponse createGetMoveOptionsResponse() {
        return new GetMoveOptionsResponse();
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/imaging/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }
}
