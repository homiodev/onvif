package org.onvif.ver20.media.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _GetVideoEncoderConfigurationOptions_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurationOptions");
    private static final QName _Capabilities_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "Capabilities");
    private static final QName _StopMulticastStreaming_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "StopMulticastStreaming");
    private static final QName _GetAnalyticsConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAnalyticsConfigurations");
    private static final QName _StartMulticastStreaming_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "StartMulticastStreaming");
    private static final QName _GetVideoSourceConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurations");
    private static final QName _GetAudioEncoderConfigurationOptions_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurationOptions");
    private static final QName _GetVideoSourceConfigurationOptions_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurationOptions");
    private static final QName _GetVideoEncoderConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurations");
    private static final QName _GetMetadataConfigurationOptions_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurationOptions");
    private static final QName _GetAudioOutputConfigurationOptions_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurationOptions");
    private static final QName _ConfigurationEnumeration_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "ConfigurationEnumeration");
    private static final QName _GetAudioSourceConfigurationOptions_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurationOptions");
    private static final QName _GetAudioOutputConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurations");
    private static final QName _GetAudioDecoderConfigurationOptions_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurationOptions");
    private static final QName _GetMetadataConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurations");
    private static final QName _GetAudioSourceConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurations");
    private static final QName _GetAudioDecoderConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurations");
    private static final QName _GetAudioEncoderConfigurations_QNAME =
            new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurations");

    public ObjectFactory() {
    }

    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    public SetVideoSourceMode createSetVideoSourceMode() {
        return new SetVideoSourceMode();
    }

    public GetMetadataConfigurationsResponse createGetMetadataConfigurationsResponse() {
        return new GetMetadataConfigurationsResponse();
    }

    public DeleteProfileResponse createDeleteProfileResponse() {
        return new DeleteProfileResponse();
    }

    public SetMetadataConfiguration createSetMetadataConfiguration() {
        return new SetMetadataConfiguration();
    }

    public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
        return new SetSynchronizationPointResponse();
    }

    public GetAnalyticsConfigurationsResponse createGetAnalyticsConfigurationsResponse() {
        return new GetAnalyticsConfigurationsResponse();
    }

    public RemoveConfiguration createRemoveConfiguration() {
        return new RemoveConfiguration();
    }

    public ConfigurationRef createConfigurationRef() {
        return new ConfigurationRef();
    }

    public SetVideoSourceModeResponse createSetVideoSourceModeResponse() {
        return new SetVideoSourceModeResponse();
    }

    public GetOSDOptions createGetOSDOptions() {
        return new GetOSDOptions();
    }

    public SetAudioSourceConfiguration createSetAudioSourceConfiguration() {
        return new SetAudioSourceConfiguration();
    }

    public DeleteOSD createDeleteOSD() {
        return new DeleteOSD();
    }

    public SetVideoEncoderConfiguration createSetVideoEncoderConfiguration() {
        return new SetVideoEncoderConfiguration();
    }

    public DeleteProfile createDeleteProfile() {
        return new DeleteProfile();
    }

    public GetOSDsResponse createGetOSDsResponse() {
        return new GetOSDsResponse();
    }

    public CreateProfileResponse createCreateProfileResponse() {
        return new CreateProfileResponse();
    }

    public GetVideoSourceModesResponse createGetVideoSourceModesResponse() {
        return new GetVideoSourceModesResponse();
    }

    public VideoSourceMode createVideoSourceMode() {
        return new VideoSourceMode();
    }

    public GetAudioOutputConfigurationOptionsResponse
    createGetAudioOutputConfigurationOptionsResponse() {
        return new GetAudioOutputConfigurationOptionsResponse();
    }

    public GetVideoSourceModes createGetVideoSourceModes() {
        return new GetVideoSourceModes();
    }

    public GetStreamUriResponse createGetStreamUriResponse() {
        return new GetStreamUriResponse();
    }

    public GetProfilesResponse createGetProfilesResponse() {
        return new GetProfilesResponse();
    }

    public MediaProfile createMediaProfile() {
        return new MediaProfile();
    }

    public SetOSD createSetOSD() {
        return new SetOSD();
    }

    public CreateOSDResponse createCreateOSDResponse() {
        return new CreateOSDResponse();
    }

    public GetAudioEncoderConfigurationOptionsResponse
    createGetAudioEncoderConfigurationOptionsResponse() {
        return new GetAudioEncoderConfigurationOptionsResponse();
    }

    public AddConfiguration createAddConfiguration() {
        return new AddConfiguration();
    }

    public GetAudioOutputConfigurationsResponse createGetAudioOutputConfigurationsResponse() {
        return new GetAudioOutputConfigurationsResponse();
    }

    public GetProfiles createGetProfiles() {
        return new GetProfiles();
    }

    public SetAudioEncoderConfiguration createSetAudioEncoderConfiguration() {
        return new SetAudioEncoderConfiguration();
    }

    public GetAudioSourceConfigurationsResponse createGetAudioSourceConfigurationsResponse() {
        return new GetAudioSourceConfigurationsResponse();
    }

    public SetVideoSourceConfiguration createSetVideoSourceConfiguration() {
        return new SetVideoSourceConfiguration();
    }

    public GetSnapshotUriResponse createGetSnapshotUriResponse() {
        return new GetSnapshotUriResponse();
    }

    public SetAudioDecoderConfiguration createSetAudioDecoderConfiguration() {
        return new SetAudioDecoderConfiguration();
    }

    public GetVideoEncoderConfigurationOptionsResponse
    createGetVideoEncoderConfigurationOptionsResponse() {
        return new GetVideoEncoderConfigurationOptionsResponse();
    }

    public GetAudioEncoderConfigurationsResponse createGetAudioEncoderConfigurationsResponse() {
        return new GetAudioEncoderConfigurationsResponse();
    }

    public RemoveConfigurationResponse createRemoveConfigurationResponse() {
        return new RemoveConfigurationResponse();
    }

    public SetConfigurationResponse createSetConfigurationResponse() {
        return new SetConfigurationResponse();
    }

    public StartStopMulticastStreaming createStartStopMulticastStreaming() {
        return new StartStopMulticastStreaming();
    }

    public SetSynchronizationPoint createSetSynchronizationPoint() {
        return new SetSynchronizationPoint();
    }

    public CreateOSD createCreateOSD() {
        return new CreateOSD();
    }

    public GetAudioDecoderConfigurationsResponse createGetAudioDecoderConfigurationsResponse() {
        return new GetAudioDecoderConfigurationsResponse();
    }

    public GetStreamUri createGetStreamUri() {
        return new GetStreamUri();
    }

    public AddConfigurationResponse createAddConfigurationResponse() {
        return new AddConfigurationResponse();
    }

    public GetAudioSourceConfigurationOptionsResponse
    createGetAudioSourceConfigurationOptionsResponse() {
        return new GetAudioSourceConfigurationOptionsResponse();
    }

    public GetSnapshotUri createGetSnapshotUri() {
        return new GetSnapshotUri();
    }

    public SetAudioOutputConfiguration createSetAudioOutputConfiguration() {
        return new SetAudioOutputConfiguration();
    }

    public GetAudioDecoderConfigurationOptionsResponse
    createGetAudioDecoderConfigurationOptionsResponse() {
        return new GetAudioDecoderConfigurationOptionsResponse();
    }

    public GetOSDOptionsResponse createGetOSDOptionsResponse() {
        return new GetOSDOptionsResponse();
    }

    public GetMetadataConfigurationOptionsResponse createGetMetadataConfigurationOptionsResponse() {
        return new GetMetadataConfigurationOptionsResponse();
    }

    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    public GetVideoSourceConfigurationsResponse createGetVideoSourceConfigurationsResponse() {
        return new GetVideoSourceConfigurationsResponse();
    }

    public GetOSDs createGetOSDs() {
        return new GetOSDs();
    }

    public Capabilities2 createCapabilities2() {
        return new Capabilities2();
    }

    public GetVideoEncoderConfigurationsResponse createGetVideoEncoderConfigurationsResponse() {
        return new GetVideoEncoderConfigurationsResponse();
    }

    public GetVideoSourceConfigurationOptionsResponse
    createGetVideoSourceConfigurationOptionsResponse() {
        return new GetVideoSourceConfigurationOptionsResponse();
    }

    public CreateProfile createCreateProfile() {
        return new CreateProfile();
    }

    public StartStopMulticastStreamingResponse createStartStopMulticastStreamingResponse() {
        return new StartStopMulticastStreamingResponse();
    }

    public GetServiceCapabilitiesResponse2 createGetServiceCapabilitiesResponse2() {
        return new GetServiceCapabilitiesResponse2();
    }

    public ProfileCapabilities createProfileCapabilities() {
        return new ProfileCapabilities();
    }

    public StreamingCapabilities createStreamingCapabilities() {
        return new StreamingCapabilities();
    }

    public ConfigurationSet createConfigurationSet() {
        return new ConfigurationSet();
    }

    public VideoSourceModeExtension createVideoSourceModeExtension() {
        return new VideoSourceModeExtension();
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetVideoEncoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurationOptions(
            GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetVideoEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities2> createCapabilities(Capabilities2 value) {
        return new JAXBElement<Capabilities2>(_Capabilities_QNAME, Capabilities2.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "StopMulticastStreaming")
    public JAXBElement<StartStopMulticastStreaming> createStopMulticastStreaming(
            StartStopMulticastStreaming value) {
        return new JAXBElement<StartStopMulticastStreaming>(
                _StopMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAnalyticsConfigurations")
    public JAXBElement<GetConfiguration> createGetAnalyticsConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAnalyticsConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "StartMulticastStreaming")
    public JAXBElement<StartStopMulticastStreaming> createStartMulticastStreaming(
            StartStopMulticastStreaming value) {
        return new JAXBElement<StartStopMulticastStreaming>(
                _StartMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetVideoSourceConfigurations")
    public JAXBElement<GetConfiguration> createGetVideoSourceConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetVideoSourceConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioEncoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurationOptions(
            GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetVideoSourceConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetVideoSourceConfigurationOptions(
            GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetVideoSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetVideoEncoderConfigurations")
    public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetVideoEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetMetadataConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetMetadataConfigurationOptions(
            GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetMetadataConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioOutputConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioOutputConfigurationOptions(
            GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioOutputConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "ConfigurationEnumeration")
    public JAXBElement<ConfigurationEnumeration> createConfigurationEnumeration(
            ConfigurationEnumeration value) {
        return new JAXBElement<ConfigurationEnumeration>(
                _ConfigurationEnumeration_QNAME, ConfigurationEnumeration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioSourceConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioSourceConfigurationOptions(
            GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioOutputConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioOutputConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioOutputConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioDecoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurationOptions(
            GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioDecoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetMetadataConfigurations")
    public JAXBElement<GetConfiguration> createGetMetadataConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetMetadataConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioSourceConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioSourceConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioSourceConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioDecoderConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioDecoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver20/media/wsdl",
            name = "GetAudioEncoderConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(
                _GetAudioEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }
}
