package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _Capabilities_QNAME =
            new QName("http://www.onvif.org/ver20/ptz/wsdl", "Capabilities");

    public ObjectFactory() {
    }

    public GetNodes createGetNodes() {
        return new GetNodes();
    }

    public RemovePresetResponse createRemovePresetResponse() {
        return new RemovePresetResponse();
    }

    public SetHomePosition createSetHomePosition() {
        return new SetHomePosition();
    }

    public GotoHomePosition createGotoHomePosition() {
        return new GotoHomePosition();
    }

    public RelativeMoveResponse createRelativeMoveResponse() {
        return new RelativeMoveResponse();
    }

    public GetNode createGetNode() {
        return new GetNode();
    }

    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    public GotoPresetResponse createGotoPresetResponse() {
        return new GotoPresetResponse();
    }

    public SendAuxiliaryCommand createSendAuxiliaryCommand() {
        return new SendAuxiliaryCommand();
    }

    public OperatePresetTour createOperatePresetTour() {
        return new OperatePresetTour();
    }

    public GotoPreset createGotoPreset() {
        return new GotoPreset();
    }

    public SetConfigurationResponse createSetConfigurationResponse() {
        return new SetConfigurationResponse();
    }

    public GetPresetTourResponse createGetPresetTourResponse() {
        return new GetPresetTourResponse();
    }

    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    public SetConfiguration createSetConfiguration() {
        return new SetConfiguration();
    }

    public GetNodesResponse createGetNodesResponse() {
        return new GetNodesResponse();
    }

    public GetPresetTourOptions createGetPresetTourOptions() {
        return new GetPresetTourOptions();
    }

    public CreatePresetTour createCreatePresetTour() {
        return new CreatePresetTour();
    }

    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    public GetPresetTour createGetPresetTour() {
        return new GetPresetTour();
    }

    public GetPresetTourOptionsResponse createGetPresetTourOptionsResponse() {
        return new GetPresetTourOptionsResponse();
    }

    public GetPresetTours createGetPresetTours() {
        return new GetPresetTours();
    }

    public GetConfigurationsResponse createGetConfigurationsResponse() {
        return new GetConfigurationsResponse();
    }

    public AbsoluteMove createAbsoluteMove() {
        return new AbsoluteMove();
    }

    public OperatePresetTourResponse createOperatePresetTourResponse() {
        return new OperatePresetTourResponse();
    }

    public GetNodeResponse createGetNodeResponse() {
        return new GetNodeResponse();
    }

    public SendAuxiliaryCommandResponse createSendAuxiliaryCommandResponse() {
        return new SendAuxiliaryCommandResponse();
    }

    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    public RemovePresetTour createRemovePresetTour() {
        return new RemovePresetTour();
    }

    public GetPresets createGetPresets() {
        return new GetPresets();
    }

    public ContinuousMoveResponse createContinuousMoveResponse() {
        return new ContinuousMoveResponse();
    }

    public SetHomePositionResponse createSetHomePositionResponse() {
        return new SetHomePositionResponse();
    }

    public GetCompatibleConfigurations createGetCompatibleConfigurations() {
        return new GetCompatibleConfigurations();
    }

    public ContinuousMove createContinuousMove() {
        return new ContinuousMove();
    }

    public RelativeMove createRelativeMove() {
        return new RelativeMove();
    }

    public ModifyPresetTour createModifyPresetTour() {
        return new ModifyPresetTour();
    }

    public GetPresetToursResponse createGetPresetToursResponse() {
        return new GetPresetToursResponse();
    }

    public ModifyPresetTourResponse createModifyPresetTourResponse() {
        return new ModifyPresetTourResponse();
    }

    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    public SetPresetResponse createSetPresetResponse() {
        return new SetPresetResponse();
    }

    public Stop createStop() {
        return new Stop();
    }

    public AbsoluteMoveResponse createAbsoluteMoveResponse() {
        return new AbsoluteMoveResponse();
    }

    public GotoHomePositionResponse createGotoHomePositionResponse() {
        return new GotoHomePositionResponse();
    }

    public GetCompatibleConfigurationsResponse createGetCompatibleConfigurationsResponse() {
        return new GetCompatibleConfigurationsResponse();
    }

    public StopResponse createStopResponse() {
        return new StopResponse();
    }

    public GetConfigurationOptions createGetConfigurationOptions() {
        return new GetConfigurationOptions();
    }

    public CreatePresetTourResponse createCreatePresetTourResponse() {
        return new CreatePresetTourResponse();
    }

    public GetPresetsResponse createGetPresetsResponse() {
        return new GetPresetsResponse();
    }

    public GetConfigurations createGetConfigurations() {
        return new GetConfigurations();
    }

    public RemovePresetTourResponse createRemovePresetTourResponse() {
        return new RemovePresetTourResponse();
    }

    public SetPreset createSetPreset() {
        return new SetPreset();
    }

    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    public RemovePreset createRemovePreset() {
        return new RemovePreset();
    }

    public GetConfigurationOptionsResponse createGetConfigurationOptionsResponse() {
        return new GetConfigurationOptionsResponse();
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/ptz/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }
}
