package org.onvif.ver10.schema;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName _VideoSourceConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "VideoSourceConfiguration");
    private static final QName _MetadataStream_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "MetadataStream");
    private static final QName _AudioEncoderConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "AudioEncoderConfiguration");
    private static final QName _VideoEncoderConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "VideoEncoderConfiguration");
    private static final QName _VideoAnalyticsConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "VideoAnalyticsConfiguration");
    private static final QName _AudioOutputConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "AudioOutputConfiguration");
    private static final QName _Polygon_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "Polygon");
    private static final QName _Polyline_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "Polyline");
    private static final QName _AudioSourceConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "AudioSourceConfiguration");
    private static final QName _MetadataConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "MetadataConfiguration");
    private static final QName _PTZConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "PTZConfiguration");
    private static final QName _AudioDecoderConfiguration_QNAME =
            new QName("http://www.onvif.org/ver10/schema", "AudioDecoderConfiguration");

    public ObjectFactory() {
    }

    public ItemListDescription createItemListDescription() {
        return new ItemListDescription();
    }

    public ConfigDescription createConfigDescription() {
        return new ConfigDescription();
    }

    public Behaviour createBehaviour() {
        return new Behaviour();
    }

    public ColorDescriptor createColorDescriptor() {
        return new ColorDescriptor();
    }

    public EventSubscription createEventSubscription() {
        return new EventSubscription();
    }

    public ClassDescriptor createClassDescriptor() {
        return new ClassDescriptor();
    }

    public ItemList createItemList() {
        return new ItemList();
    }

    public User createUser() {
        return new User();
    }

    public Scope createScope() {
        return new Scope();
    }

    public Dot11AvailableNetworks createDot11AvailableNetworks() {
        return new Dot11AvailableNetworks();
    }

    public NTPInformation createNTPInformation() {
        return new NTPInformation();
    }

    public DynamicDNSInformation createDynamicDNSInformation() {
        return new DynamicDNSInformation();
    }

    public Dot1XConfiguration createDot1XConfiguration() {
        return new Dot1XConfiguration();
    }

    public AttachmentData createAttachmentData() {
        return new AttachmentData();
    }

    public NetworkZeroConfiguration createNetworkZeroConfiguration() {
        return new NetworkZeroConfiguration();
    }

    public Certificate createCertificate() {
        return new Certificate();
    }

    public BackupFile createBackupFile() {
        return new BackupFile();
    }

    public RelayOutput createRelayOutput() {
        return new RelayOutput();
    }

    public SystemDateTime createSystemDateTime() {
        return new SystemDateTime();
    }

    public TimeZone createTimeZone() {
        return new TimeZone();
    }

    public DateTime createDateTime() {
        return new DateTime();
    }

    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    public CertificateStatus createCertificateStatus() {
        return new CertificateStatus();
    }

    public SupportInformation createSupportInformation() {
        return new SupportInformation();
    }

    public CertificateInformation createCertificateInformation() {
        return new CertificateInformation();
    }

    public NetworkHost createNetworkHost() {
        return new NetworkHost();
    }

    public RemoteUser createRemoteUser() {
        return new RemoteUser();
    }

    public RelayOutputSettings createRelayOutputSettings() {
        return new RelayOutputSettings();
    }

    public HostnameInformation createHostnameInformation() {
        return new HostnameInformation();
    }

    public Dot11Status createDot11Status() {
        return new Dot11Status();
    }

    public BinaryData createBinaryData() {
        return new BinaryData();
    }

    public IPAddressFilter createIPAddressFilter() {
        return new IPAddressFilter();
    }

    public NetworkInterfaceSetConfiguration createNetworkInterfaceSetConfiguration() {
        return new NetworkInterfaceSetConfiguration();
    }

    public NetworkProtocol createNetworkProtocol() {
        return new NetworkProtocol();
    }

    public SystemLogUriList createSystemLogUriList() {
        return new SystemLogUriList();
    }

    public DNSInformation createDNSInformation() {
        return new DNSInformation();
    }

    public NetworkInterface createNetworkInterface() {
        return new NetworkInterface();
    }

    public CertificateWithPrivateKey createCertificateWithPrivateKey() {
        return new CertificateWithPrivateKey();
    }

    public IPAddress createIPAddress() {
        return new IPAddress();
    }

    public Dot11Capabilities createDot11Capabilities() {
        return new Dot11Capabilities();
    }

    public NetworkGateway createNetworkGateway() {
        return new NetworkGateway();
    }

    public SystemLog createSystemLog() {
        return new SystemLog();
    }

    public AudioSourceConfiguration createAudioSourceConfiguration() {
        return new AudioSourceConfiguration();
    }

    public PTZConfiguration createPTZConfiguration() {
        return new PTZConfiguration();
    }

    public VideoSourceConfiguration createVideoSourceConfiguration() {
        return new VideoSourceConfiguration();
    }

    public Message createMessage() {
        return new Message();
    }

    public MessageExtension createMessageExtension() {
        return new MessageExtension();
    }

    public AudioEncoderConfiguration createAudioEncoderConfiguration() {
        return new AudioEncoderConfiguration();
    }

    public VideoEncoderConfiguration createVideoEncoderConfiguration() {
        return new VideoEncoderConfiguration();
    }

    public MetadataStream createMetadataStream() {
        return new MetadataStream();
    }

    public AudioDecoderConfiguration createAudioDecoderConfiguration() {
        return new AudioDecoderConfiguration();
    }

    public VideoAnalyticsConfiguration createVideoAnalyticsConfiguration() {
        return new VideoAnalyticsConfiguration();
    }

    public AudioOutputConfiguration createAudioOutputConfiguration() {
        return new AudioOutputConfiguration();
    }

    public Polygon createPolygon() {
        return new Polygon();
    }

    public MetadataConfiguration createMetadataConfiguration() {
        return new MetadataConfiguration();
    }

    public Polyline createPolyline() {
        return new Polyline();
    }

    public IrCutFilterAutoAdjustment createIrCutFilterAutoAdjustment() {
        return new IrCutFilterAutoAdjustment();
    }

    public PTZNodeExtension2 createPTZNodeExtension2() {
        return new PTZNodeExtension2();
    }

    public WideDynamicRangeOptions20 createWideDynamicRangeOptions20() {
        return new WideDynamicRangeOptions20();
    }

    public CertificateGenerationParametersExtension createCertificateGenerationParametersExtension() {
        return new CertificateGenerationParametersExtension();
    }

    public PTZSpacesExtension createPTZSpacesExtension() {
        return new PTZSpacesExtension();
    }

    public EFlip createEFlip() {
        return new EFlip();
    }

    public VideoAttributes createVideoAttributes() {
        return new VideoAttributes();
    }

    public MediaAttributes createMediaAttributes() {
        return new MediaAttributes();
    }

    public SearchCapabilities createSearchCapabilities() {
        return new SearchCapabilities();
    }

    public G726DecOptions createG726DecOptions() {
        return new G726DecOptions();
    }

    public DeviceEntity createDeviceEntity() {
        return new DeviceEntity();
    }

    public PTZVector createPTZVector() {
        return new PTZVector();
    }

    public AACDecOptions createAACDecOptions() {
        return new AACDecOptions();
    }

    public ImagingStatus20Extension createImagingStatus20Extension() {
        return new ImagingStatus20Extension();
    }

    public PTZConfigurationOptions createPTZConfigurationOptions() {
        return new PTZConfigurationOptions();
    }

    public IPv6ConfigurationExtension createIPv6ConfigurationExtension() {
        return new IPv6ConfigurationExtension();
    }

    public VideoOutputConfigurationOptions createVideoOutputConfigurationOptions() {
        return new VideoOutputConfigurationOptions();
    }

    public Rename createRename() {
        return new Rename();
    }

    public G711DecOptions createG711DecOptions() {
        return new G711DecOptions();
    }

    public CertificateGenerationParameters createCertificateGenerationParameters() {
        return new CertificateGenerationParameters();
    }

    public Receiver createReceiver() {
        return new Receiver();
    }

    public Transport createTransport() {
        return new Transport();
    }

    public PTZPresetTourSpotOptions createPTZPresetTourSpotOptions() {
        return new PTZPresetTourSpotOptions();
    }

    public Dot11Configuration createDot11Configuration() {
        return new Dot11Configuration();
    }

    public PolylineArrayExtension createPolylineArrayExtension() {
        return new PolylineArrayExtension();
    }

    public EventFilter createEventFilter() {
        return new EventFilter();
    }

    public PolygonConfiguration createPolygonConfiguration() {
        return new PolygonConfiguration();
    }

    public GetTracksResponseList createGetTracksResponseList() {
        return new GetTracksResponseList();
    }

    public RotateOptions createRotateOptions() {
        return new RotateOptions();
    }

    public SupportedRules createSupportedRules() {
        return new SupportedRules();
    }

    public NetworkInterfaceExtension createNetworkInterfaceExtension() {
        return new NetworkInterfaceExtension();
    }

    public OSDConfigurationOptionsExtension createOSDConfigurationOptionsExtension() {
        return new OSDConfigurationOptionsExtension();
    }

    public BacklightCompensationOptions createBacklightCompensationOptions() {
        return new BacklightCompensationOptions();
    }

    public AudioDecoderConfigurationOptionsExtension
    createAudioDecoderConfigurationOptionsExtension() {
        return new AudioDecoderConfigurationOptionsExtension();
    }

    public Merge createMerge() {
        return new Merge();
    }

    public Rotate createRotate() {
        return new Rotate();
    }

    public OSDConfigurationExtension createOSDConfigurationExtension() {
        return new OSDConfigurationExtension();
    }

    public SystemCapabilitiesExtension createSystemCapabilitiesExtension() {
        return new SystemCapabilitiesExtension();
    }

    public PaneOptionExtension createPaneOptionExtension() {
        return new PaneOptionExtension();
    }

    public IrCutFilterAutoAdjustmentOptions createIrCutFilterAutoAdjustmentOptions() {
        return new IrCutFilterAutoAdjustmentOptions();
    }

    public PTZStatusFilterOptionsExtension createPTZStatusFilterOptionsExtension() {
        return new PTZStatusFilterOptionsExtension();
    }

    public OSDColor createOSDColor() {
        return new OSDColor();
    }

    public Split createSplit() {
        return new Split();
    }

    public PTZPresetTourStartingConditionOptions createPTZPresetTourStartingConditionOptions() {
        return new PTZPresetTourStartingConditionOptions();
    }

    public DisplayCapabilities createDisplayCapabilities() {
        return new DisplayCapabilities();
    }

    public PolylineArray createPolylineArray() {
        return new PolylineArray();
    }

    public Rectangle createRectangle() {
        return new Rectangle();
    }

    public TLSConfiguration createTLSConfiguration() {
        return new TLSConfiguration();
    }

    public NetworkInterfaceConnectionSetting createNetworkInterfaceConnectionSetting() {
        return new NetworkInterfaceConnectionSetting();
    }

    public SourceIdentificationExtension createSourceIdentificationExtension() {
        return new SourceIdentificationExtension();
    }

    public AnalyticsEngineInput createAnalyticsEngineInput() {
        return new AnalyticsEngineInput();
    }

    public ColorOptions createColorOptions() {
        return new ColorOptions();
    }

    public AnalyticsDeviceCapabilities createAnalyticsDeviceCapabilities() {
        return new AnalyticsDeviceCapabilities();
    }

    public SourceReference createSourceReference() {
        return new SourceReference();
    }

    public RecordingCapabilities createRecordingCapabilities() {
        return new RecordingCapabilities();
    }

    public OSDPosConfigurationExtension createOSDPosConfigurationExtension() {
        return new OSDPosConfigurationExtension();
    }

    public MediaCapabilities createMediaCapabilities() {
        return new MediaCapabilities();
    }

    public NetworkZeroConfigurationExtension createNetworkZeroConfigurationExtension() {
        return new NetworkZeroConfigurationExtension();
    }

    public FocusOptions20 createFocusOptions20() {
        return new FocusOptions20();
    }

    public ConfigDescriptionExtension createConfigDescriptionExtension() {
        return new ConfigDescriptionExtension();
    }

    public MulticastConfiguration createMulticastConfiguration() {
        return new MulticastConfiguration();
    }

    public SourceIdentification createSourceIdentification() {
        return new SourceIdentification();
    }

    public ZoomLimits createZoomLimits() {
        return new ZoomLimits();
    }

    public ExposureOptions20 createExposureOptions20() {
        return new ExposureOptions20();
    }

    public VideoOutput createVideoOutput() {
        return new VideoOutput();
    }

    public VideoEncoderConfigurationOptions createVideoEncoderConfigurationOptions() {
        return new VideoEncoderConfigurationOptions();
    }

    public JpegOptions2 createJpegOptions2() {
        return new JpegOptions2();
    }

    public IPv6Configuration createIPv6Configuration() {
        return new IPv6Configuration();
    }

    public MetadataConfigurationOptions createMetadataConfigurationOptions() {
        return new MetadataConfigurationOptions();
    }

    public VideoResolution createVideoResolution() {
        return new VideoResolution();
    }

    public MetadataAttributes createMetadataAttributes() {
        return new MetadataAttributes();
    }

    public VideoSourceConfigurationOptions createVideoSourceConfigurationOptions() {
        return new VideoSourceConfigurationOptions();
    }

    public JpegDecOptions createJpegDecOptions() {
        return new JpegDecOptions();
    }

    public ItemListDescriptionExtension createItemListDescriptionExtension() {
        return new ItemListDescriptionExtension();
    }

    public GenericEapPwdConfigurationExtension createGenericEapPwdConfigurationExtension() {
        return new GenericEapPwdConfigurationExtension();
    }

    public LayoutOptionsExtension createLayoutOptionsExtension() {
        return new LayoutOptionsExtension();
    }

    public Mpeg4Configuration createMpeg4Configuration() {
        return new Mpeg4Configuration();
    }

    public AudioSource createAudioSource() {
        return new AudioSource();
    }

    public ImageStabilizationOptions createImageStabilizationOptions() {
        return new ImageStabilizationOptions();
    }

    public EAPMethodConfiguration createEAPMethodConfiguration() {
        return new EAPMethodConfiguration();
    }

    public FocusOptions20Extension createFocusOptions20Extension() {
        return new FocusOptions20Extension();
    }

    public ReverseOptions createReverseOptions() {
        return new ReverseOptions();
    }

    public ColorspaceRange createColorspaceRange() {
        return new ColorspaceRange();
    }

    public FocusStatus20Extension createFocusStatus20Extension() {
        return new FocusStatus20Extension();
    }

    public H264Options2 createH264Options2() {
        return new H264Options2();
    }

    public H264DecOptions createH264DecOptions() {
        return new H264DecOptions();
    }

    public OSDReference createOSDReference() {
        return new OSDReference();
    }

    public AbsoluteFocus createAbsoluteFocus() {
        return new AbsoluteFocus();
    }

    public PTZStatus createPTZStatus() {
        return new PTZStatus();
    }

    public DynamicDNSInformationExtension createDynamicDNSInformationExtension() {
        return new DynamicDNSInformationExtension();
    }

    public IPv6NetworkInterfaceSetConfiguration createIPv6NetworkInterfaceSetConfiguration() {
        return new IPv6NetworkInterfaceSetConfiguration();
    }

    public RecordingJobConfiguration createRecordingJobConfiguration() {
        return new RecordingJobConfiguration();
    }

    public AudioClassDescriptor createAudioClassDescriptor() {
        return new AudioClassDescriptor();
    }

    public TrackConfiguration createTrackConfiguration() {
        return new TrackConfiguration();
    }

    public Space2DDescription createSpace2DDescription() {
        return new Space2DDescription();
    }

    public NetworkZeroConfigurationExtension2 createNetworkZeroConfigurationExtension2() {
        return new NetworkZeroConfigurationExtension2();
    }

    public RecordingJobStateSource createRecordingJobStateSource() {
        return new RecordingJobStateSource();
    }

    public IOCapabilities createIOCapabilities() {
        return new IOCapabilities();
    }

    public DateTimeRange createDateTimeRange() {
        return new DateTimeRange();
    }

    public TrackAttributes createTrackAttributes() {
        return new TrackAttributes();
    }

    public CertificateUsage createCertificateUsage() {
        return new CertificateUsage();
    }

    public Transformation createTransformation() {
        return new Transformation();
    }

    public PaneLayoutOptions createPaneLayoutOptions() {
        return new PaneLayoutOptions();
    }

    public AnyHolder createAnyHolder() {
        return new AnyHolder();
    }

    public Space1DDescription createSpace1DDescription() {
        return new Space1DDescription();
    }

    public PolylineArrayConfiguration createPolylineArrayConfiguration() {
        return new PolylineArrayConfiguration();
    }

    public ImageStabilization createImageStabilization() {
        return new ImageStabilization();
    }

    public AudioClassDescriptorExtension createAudioClassDescriptorExtension() {
        return new AudioClassDescriptorExtension();
    }

    public Dot11SecurityConfiguration createDot11SecurityConfiguration() {
        return new Dot11SecurityConfiguration();
    }

    public IPv4NetworkInterfaceSetConfiguration createIPv4NetworkInterfaceSetConfiguration() {
        return new IPv4NetworkInterfaceSetConfiguration();
    }

    public Vector1D createVector1D() {
        return new Vector1D();
    }

    public PTZPresetTourSupportedExtension createPTZPresetTourSupportedExtension() {
        return new PTZPresetTourSupportedExtension();
    }

    public WhiteBalance createWhiteBalance() {
        return new WhiteBalance();
    }

    public RecordingInformation createRecordingInformation() {
        return new RecordingInformation();
    }

    public PTZPositionFilter createPTZPositionFilter() {
        return new PTZPositionFilter();
    }

    public ImagingSettings createImagingSettings() {
        return new ImagingSettings();
    }

    public Color createColor() {
        return new Color();
    }

    public NetworkCapabilitiesExtension2 createNetworkCapabilitiesExtension2() {
        return new NetworkCapabilitiesExtension2();
    }

    public MediaUri createMediaUri() {
        return new MediaUri();
    }

    public FindPTZPositionResult createFindPTZPositionResult() {
        return new FindPTZPositionResult();
    }

    public GetRecordingsResponseItem createGetRecordingsResponseItem() {
        return new GetRecordingsResponseItem();
    }

    public Vector2D createVector2D() {
        return new Vector2D();
    }

    public ObjectTreeExtension createObjectTreeExtension() {
        return new ObjectTreeExtension();
    }

    public RecordingJobStateTrack createRecordingJobStateTrack() {
        return new RecordingJobStateTrack();
    }

    public PTZConfigurationExtension createPTZConfigurationExtension() {
        return new PTZConfigurationExtension();
    }

    public NetworkInterfaceLink createNetworkInterfaceLink() {
        return new NetworkInterfaceLink();
    }

    public AudioSourceConfigurationOptions createAudioSourceConfigurationOptions() {
        return new AudioSourceConfigurationOptions();
    }

    public ReverseOptionsExtension createReverseOptionsExtension() {
        return new ReverseOptionsExtension();
    }

    public MessageDescription createMessageDescription() {
        return new MessageDescription();
    }

    public JpegOptions createJpegOptions() {
        return new JpegOptions();
    }

    public IntRectangleRange createIntRectangleRange() {
        return new IntRectangleRange();
    }

    public EFlipOptions createEFlipOptions() {
        return new EFlipOptions();
    }

    public AnalyticsStateInformation createAnalyticsStateInformation() {
        return new AnalyticsStateInformation();
    }

    public IPv6NetworkInterface createIPv6NetworkInterface() {
        return new IPv6NetworkInterface();
    }

    public AudioDescriptor createAudioDescriptor() {
        return new AudioDescriptor();
    }

    public ProfileCapabilities createProfileCapabilities() {
        return new ProfileCapabilities();
    }

    public BacklightCompensation20 createBacklightCompensation20() {
        return new BacklightCompensation20();
    }

    public ImageStabilizationExtension createImageStabilizationExtension() {
        return new ImageStabilizationExtension();
    }

    public EventStreamExtension createEventStreamExtension() {
        return new EventStreamExtension();
    }

    public IOCapabilitiesExtension createIOCapabilitiesExtension() {
        return new IOCapabilitiesExtension();
    }

    public OSDConfigurationOptions createOSDConfigurationOptions() {
        return new OSDConfigurationOptions();
    }

    public FocusStatus20 createFocusStatus20() {
        return new FocusStatus20();
    }

    public RelativeFocusOptions20 createRelativeFocusOptions20() {
        return new RelativeFocusOptions20();
    }

    public MetadataInputExtension createMetadataInputExtension() {
        return new MetadataInputExtension();
    }

    public AudioAnalyticsStreamExtension createAudioAnalyticsStreamExtension() {
        return new AudioAnalyticsStreamExtension();
    }

    public AudioAnalyticsStream createAudioAnalyticsStream() {
        return new AudioAnalyticsStream();
    }

    public OSDColorOptionsExtension createOSDColorOptionsExtension() {
        return new OSDColorOptionsExtension();
    }

    public EventCapabilities createEventCapabilities() {
        return new EventCapabilities();
    }

    public AudioEncoderConfigurationOption createAudioEncoderConfigurationOption() {
        return new AudioEncoderConfigurationOption();
    }

    public BacklightCompensationOptions20 createBacklightCompensationOptions20() {
        return new BacklightCompensationOptions20();
    }

    public MetadataFilter createMetadataFilter() {
        return new MetadataFilter();
    }

    public PTZNodeExtension createPTZNodeExtension() {
        return new PTZNodeExtension();
    }

    public ImagingStatus createImagingStatus() {
        return new ImagingStatus();
    }

    public WhiteBalance20 createWhiteBalance20() {
        return new WhiteBalance20();
    }

    public OSDConfiguration createOSDConfiguration() {
        return new OSDConfiguration();
    }

    public FocusStatus createFocusStatus() {
        return new FocusStatus();
    }

    public Frame createFrame() {
        return new Frame();
    }

    public IPAddressFilterExtension createIPAddressFilterExtension() {
        return new IPAddressFilterExtension();
    }

    public ReplayCapabilities createReplayCapabilities() {
        return new ReplayCapabilities();
    }

    public ContinuousFocus createContinuousFocus() {
        return new ContinuousFocus();
    }

    public MotionExpressionConfiguration createMotionExpressionConfiguration() {
        return new MotionExpressionConfiguration();
    }

    public RecordingJobConfigurationExtension createRecordingJobConfigurationExtension() {
        return new RecordingJobConfigurationExtension();
    }

    public PTZPresetTourOptions createPTZPresetTourOptions() {
        return new PTZPresetTourOptions();
    }

    public StreamSetup createStreamSetup() {
        return new StreamSetup();
    }

    public IntRectangle createIntRectangle() {
        return new IntRectangle();
    }

    public VideoDecoderConfigurationOptionsExtension
    createVideoDecoderConfigurationOptionsExtension() {
        return new VideoDecoderConfigurationOptionsExtension();
    }

    public PTControlDirection createPTControlDirection() {
        return new PTControlDirection();
    }

    public VideoRateControl createVideoRateControl() {
        return new VideoRateControl();
    }

    public RelativeFocus createRelativeFocus() {
        return new RelativeFocus();
    }

    public GetTracksResponseItem createGetTracksResponseItem() {
        return new GetTracksResponseItem();
    }

    public Vector createVector() {
        return new Vector();
    }

    public FocusConfiguration createFocusConfiguration() {
        return new FocusConfiguration();
    }

    public ProfileExtension createProfileExtension() {
        return new ProfileExtension();
    }

    public BehaviourExtension createBehaviourExtension() {
        return new BehaviourExtension();
    }

    public IrCutFilterAutoAdjustmentExtension createIrCutFilterAutoAdjustmentExtension() {
        return new IrCutFilterAutoAdjustmentExtension();
    }

    public ImagingOptions20Extension2 createImagingOptions20Extension2() {
        return new ImagingOptions20Extension2();
    }

    public NetworkCapabilities createNetworkCapabilities() {
        return new NetworkCapabilities();
    }

    public ImagingOptions20Extension3 createImagingOptions20Extension3() {
        return new ImagingOptions20Extension3();
    }

    public RecordingJobStateInformationExtension createRecordingJobStateInformationExtension() {
        return new RecordingJobStateInformationExtension();
    }

    public ObjectTree createObjectTree() {
        return new ObjectTree();
    }

    public PTZCapabilities createPTZCapabilities() {
        return new PTZCapabilities();
    }

    public FocusConfiguration20 createFocusConfiguration20() {
        return new FocusConfiguration20();
    }

    public OSDImgConfigurationExtension createOSDImgConfigurationExtension() {
        return new OSDImgConfigurationExtension();
    }

    public TrackAttributesExtension createTrackAttributesExtension() {
        return new TrackAttributesExtension();
    }

    public SystemCapabilities createSystemCapabilities() {
        return new SystemCapabilities();
    }

    public WhiteBalanceOptions20Extension createWhiteBalanceOptions20Extension() {
        return new WhiteBalanceOptions20Extension();
    }

    public NetworkInterfaceInfo createNetworkInterfaceInfo() {
        return new NetworkInterfaceInfo();
    }

    public VideoSourceExtension2 createVideoSourceExtension2() {
        return new VideoSourceExtension2();
    }

    public FindMetadataResultList createFindMetadataResultList() {
        return new FindMetadataResultList();
    }

    public AnalyticsEngineInputInfoExtension createAnalyticsEngineInputInfoExtension() {
        return new AnalyticsEngineInputInfoExtension();
    }

    public ReceiverCapabilities createReceiverCapabilities() {
        return new ReceiverCapabilities();
    }

    public FindRecordingResultList createFindRecordingResultList() {
        return new FindRecordingResultList();
    }

    public SystemDateTimeExtension createSystemDateTimeExtension() {
        return new SystemDateTimeExtension();
    }

    public FindPTZPositionResultList createFindPTZPositionResultList() {
        return new FindPTZPositionResultList();
    }

    public RuleEngineConfigurationExtension createRuleEngineConfigurationExtension() {
        return new RuleEngineConfigurationExtension();
    }

    public ClassDescriptorExtension createClassDescriptorExtension() {
        return new ClassDescriptorExtension();
    }

    public NetworkInterfaceSetConfigurationExtension2
    createNetworkInterfaceSetConfigurationExtension2() {
        return new NetworkInterfaceSetConfigurationExtension2();
    }

    public Dot3Configuration createDot3Configuration() {
        return new Dot3Configuration();
    }

    public OSDTextConfigurationExtension createOSDTextConfigurationExtension() {
        return new OSDTextConfigurationExtension();
    }

    public AnalyticsEngineInputInfo createAnalyticsEngineInputInfo() {
        return new AnalyticsEngineInputInfo();
    }

    public VideoOutputExtension createVideoOutputExtension() {
        return new VideoOutputExtension();
    }

    public ExposureOptions createExposureOptions() {
        return new ExposureOptions();
    }

    public VideoSourceConfigurationOptionsExtension2
    createVideoSourceConfigurationOptionsExtension2() {
        return new VideoSourceConfigurationOptionsExtension2();
    }

    public ReplayConfiguration createReplayConfiguration() {
        return new ReplayConfiguration();
    }

    public IrCutFilterAutoAdjustmentOptionsExtension
    createIrCutFilterAutoAdjustmentOptionsExtension() {
        return new IrCutFilterAutoAdjustmentOptionsExtension();
    }

    public OSDColorOptions createOSDColorOptions() {
        return new OSDColorOptions();
    }

    public PTZStatusFilterOptions createPTZStatusFilterOptions() {
        return new PTZStatusFilterOptions();
    }

    public SystemCapabilitiesExtension2 createSystemCapabilitiesExtension2() {
        return new SystemCapabilitiesExtension2();
    }

    public VideoEncoderOptionsExtension2 createVideoEncoderOptionsExtension2() {
        return new VideoEncoderOptionsExtension2();
    }

    public RelativeFocusOptions createRelativeFocusOptions() {
        return new RelativeFocusOptions();
    }

    public VideoSourceConfigurationExtension2 createVideoSourceConfigurationExtension2() {
        return new VideoSourceConfigurationExtension2();
    }

    public FocusMove createFocusMove() {
        return new FocusMove();
    }

    public AnalyticsEngineControl createAnalyticsEngineControl() {
        return new AnalyticsEngineControl();
    }

    public ObjectId createObjectId() {
        return new ObjectId();
    }

    public CellLayout createCellLayout() {
        return new CellLayout();
    }

    public Profile createProfile() {
        return new Profile();
    }

    public ImagingSettingsExtension202 createImagingSettingsExtension202() {
        return new ImagingSettingsExtension202();
    }

    public SearchScopeExtension createSearchScopeExtension() {
        return new SearchScopeExtension();
    }

    public ImagingSettingsExtension203 createImagingSettingsExtension203() {
        return new ImagingSettingsExtension203();
    }

    public ImageStabilizationOptionsExtension createImageStabilizationOptionsExtension() {
        return new ImageStabilizationOptionsExtension();
    }

    public ColorDescriptorExtension createColorDescriptorExtension() {
        return new ColorDescriptorExtension();
    }

    public Layout createLayout() {
        return new Layout();
    }

    public NetworkInterfaceSetConfigurationExtension
    createNetworkInterfaceSetConfigurationExtension() {
        return new NetworkInterfaceSetConfigurationExtension();
    }

    public SecurityCapabilities createSecurityCapabilities() {
        return new SecurityCapabilities();
    }

    public IOCapabilitiesExtension2 createIOCapabilitiesExtension2() {
        return new IOCapabilitiesExtension2();
    }

    public AppearanceExtension createAppearanceExtension() {
        return new AppearanceExtension();
    }

    public RecordingJobSourceExtension createRecordingJobSourceExtension() {
        return new RecordingJobSourceExtension();
    }

    public FindEventResult createFindEventResult() {
        return new FindEventResult();
    }

    public RecordingConfiguration createRecordingConfiguration() {
        return new RecordingConfiguration();
    }

    public FloatList createFloatList() {
        return new FloatList();
    }

    public PaneConfiguration createPaneConfiguration() {
        return new PaneConfiguration();
    }

    public MediaCapabilitiesExtension createMediaCapabilitiesExtension() {
        return new MediaCapabilitiesExtension();
    }

    public IPv4NetworkInterface createIPv4NetworkInterface() {
        return new IPv4NetworkInterface();
    }

    public VideoEncoderOptionsExtension createVideoEncoderOptionsExtension() {
        return new VideoEncoderOptionsExtension();
    }

    public AudioSourceOptionsExtension createAudioSourceOptionsExtension() {
        return new AudioSourceOptionsExtension();
    }

    public PTZPresetTourSupported createPTZPresetTourSupported() {
        return new PTZPresetTourSupported();
    }

    public IntList createIntList() {
        return new IntList();
    }

    public CertificateInformationExtension createCertificateInformationExtension() {
        return new CertificateInformationExtension();
    }

    public PTZPresetTourStartingConditionExtension createPTZPresetTourStartingConditionExtension() {
        return new PTZPresetTourStartingConditionExtension();
    }

    public LayoutOptions createLayoutOptions() {
        return new LayoutOptions();
    }

    public ContinuousFocusOptions createContinuousFocusOptions() {
        return new ContinuousFocusOptions();
    }

    public MetadataConfigurationExtension createMetadataConfigurationExtension() {
        return new MetadataConfigurationExtension();
    }

    public CapabilitiesExtension createCapabilitiesExtension() {
        return new CapabilitiesExtension();
    }

    public PTZStreamExtension createPTZStreamExtension() {
        return new PTZStreamExtension();
    }

    public AudioDecoderConfigurationOptions createAudioDecoderConfigurationOptions() {
        return new AudioDecoderConfigurationOptions();
    }

    public DurationRange createDurationRange() {
        return new DurationRange();
    }

    public AudioEncoderConfigurationOptions createAudioEncoderConfigurationOptions() {
        return new AudioEncoderConfigurationOptions();
    }

    public SystemLogUri createSystemLogUri() {
        return new SystemLogUri();
    }

    public AnalyticsEngineConfigurationExtension createAnalyticsEngineConfigurationExtension() {
        return new AnalyticsEngineConfigurationExtension();
    }

    public Mpeg4Options createMpeg4Options() {
        return new Mpeg4Options();
    }

    public PTZFilter createPTZFilter() {
        return new PTZFilter();
    }

    public DeviceCapabilitiesExtension createDeviceCapabilitiesExtension() {
        return new DeviceCapabilitiesExtension();
    }

    public Dot11AvailableNetworksExtension createDot11AvailableNetworksExtension() {
        return new Dot11AvailableNetworksExtension();
    }

    public Dot11PSKSet createDot11PSKSet() {
        return new Dot11PSKSet();
    }

    public AnalyticsCapabilities createAnalyticsCapabilities() {
        return new AnalyticsCapabilities();
    }

    public EapMethodExtension createEapMethodExtension() {
        return new EapMethodExtension();
    }

    public PTZPreset createPTZPreset() {
        return new PTZPreset();
    }

    public WideDynamicRange createWideDynamicRange() {
        return new WideDynamicRange();
    }

    public FocusConfiguration20Extension createFocusConfiguration20Extension() {
        return new FocusConfiguration20Extension();
    }

    public UserExtension createUserExtension() {
        return new UserExtension();
    }

    public PTZSpaces createPTZSpaces() {
        return new PTZSpaces();
    }

    public SupportedAnalyticsModulesExtension createSupportedAnalyticsModulesExtension() {
        return new SupportedAnalyticsModulesExtension();
    }

    public SupportedRulesExtension createSupportedRulesExtension() {
        return new SupportedRulesExtension();
    }

    public Exposure20 createExposure20() {
        return new Exposure20();
    }

    public AnalyticsEngineConfiguration createAnalyticsEngineConfiguration() {
        return new AnalyticsEngineConfiguration();
    }

    public IPv4Configuration createIPv4Configuration() {
        return new IPv4Configuration();
    }

    public Exposure createExposure() {
        return new Exposure();
    }

    public ClassDescriptorExtension2 createClassDescriptorExtension2() {
        return new ClassDescriptorExtension2();
    }

    public Dot1XConfigurationExtension createDot1XConfigurationExtension() {
        return new Dot1XConfigurationExtension();
    }

    public ShapeDescriptor createShapeDescriptor() {
        return new ShapeDescriptor();
    }

    public MetadataStreamExtension createMetadataStreamExtension() {
        return new MetadataStreamExtension();
    }

    public OtherType createOtherType() {
        return new OtherType();
    }

    public SearchScope createSearchScope() {
        return new SearchScope();
    }

    public VideoSourceExtension createVideoSourceExtension() {
        return new VideoSourceExtension();
    }

    public PTZPresetTourStartingCondition createPTZPresetTourStartingCondition() {
        return new PTZPresetTourStartingCondition();
    }

    public EngineConfiguration createEngineConfiguration() {
        return new EngineConfiguration();
    }

    public SecurityCapabilitiesExtension createSecurityCapabilitiesExtension() {
        return new SecurityCapabilitiesExtension();
    }

    public FrameExtension2 createFrameExtension2() {
        return new FrameExtension2();
    }

    public AudioOutput createAudioOutput() {
        return new AudioOutput();
    }

    public RecordingJobStateTracks createRecordingJobStateTracks() {
        return new RecordingJobStateTracks();
    }

    public PTZConfigurationOptions2 createPTZConfigurationOptions2() {
        return new PTZConfigurationOptions2();
    }

    public PrefixedIPv6Address createPrefixedIPv6Address() {
        return new PrefixedIPv6Address();
    }

    public IntRange createIntRange() {
        return new IntRange();
    }

    public TransformationExtension createTransformationExtension() {
        return new TransformationExtension();
    }

    public GetRecordingJobsResponseItem createGetRecordingJobsResponseItem() {
        return new GetRecordingJobsResponseItem();
    }

    public CodingCapabilities createCodingCapabilities() {
        return new CodingCapabilities();
    }

    public RealTimeStreamingCapabilitiesExtension createRealTimeStreamingCapabilitiesExtension() {
        return new RealTimeStreamingCapabilitiesExtension();
    }

    public RecordingSourceInformation createRecordingSourceInformation() {
        return new RecordingSourceInformation();
    }

    public EFlipOptionsExtension createEFlipOptionsExtension() {
        return new EFlipOptionsExtension();
    }

    public ImagingSettings20 createImagingSettings20() {
        return new ImagingSettings20();
    }

    public PrefixedIPv4Address createPrefixedIPv4Address() {
        return new PrefixedIPv4Address();
    }

    public RealTimeStreamingCapabilities createRealTimeStreamingCapabilities() {
        return new RealTimeStreamingCapabilities();
    }

    public OnvifVersion createOnvifVersion() {
        return new OnvifVersion();
    }

    public AudioOutputConfigurationOptions createAudioOutputConfigurationOptions() {
        return new AudioOutputConfigurationOptions();
    }

    public ShapeDescriptorExtension createShapeDescriptorExtension() {
        return new ShapeDescriptorExtension();
    }

    public PTZMoveStatus createPTZMoveStatus() {
        return new PTZMoveStatus();
    }

    public AnalyticsDeviceEngineConfigurationExtension
    createAnalyticsDeviceEngineConfigurationExtension() {
        return new AnalyticsDeviceEngineConfigurationExtension();
    }

    public RotateExtension createRotateExtension() {
        return new RotateExtension();
    }

    public PTZPresetTourStartingConditionOptionsExtension
    createPTZPresetTourStartingConditionOptionsExtension() {
        return new PTZPresetTourStartingConditionOptionsExtension();
    }

    public VideoSource createVideoSource() {
        return new VideoSource();
    }

    public MetadataStreamExtension2 createMetadataStreamExtension2() {
        return new MetadataStreamExtension2();
    }

    public PTControlDirectionExtension createPTControlDirectionExtension() {
        return new PTControlDirectionExtension();
    }

    public ProfileExtension2 createProfileExtension2() {
        return new ProfileExtension2();
    }

    public PTZPresetTourPresetDetailOptions createPTZPresetTourPresetDetailOptions() {
        return new PTZPresetTourPresetDetailOptions();
    }

    public LayoutExtension createLayoutExtension() {
        return new LayoutExtension();
    }

    public H264Configuration createH264Configuration() {
        return new H264Configuration();
    }

    public Mpeg4DecOptions createMpeg4DecOptions() {
        return new Mpeg4DecOptions();
    }

    public RotateOptionsExtension createRotateOptionsExtension() {
        return new RotateOptionsExtension();
    }

    public AudioAttributes createAudioAttributes() {
        return new AudioAttributes();
    }

    public PTZPresetTourStatusExtension createPTZPresetTourStatusExtension() {
        return new PTZPresetTourStatusExtension();
    }

    public MaximumNumberOfOSDs createMaximumNumberOfOSDs() {
        return new MaximumNumberOfOSDs();
    }

    public AnalyticsState createAnalyticsState() {
        return new AnalyticsState();
    }

    public MoveOptions createMoveOptions() {
        return new MoveOptions();
    }

    public AbsoluteFocusOptions createAbsoluteFocusOptions() {
        return new AbsoluteFocusOptions();
    }

    public WideDynamicRange20 createWideDynamicRange20() {
        return new WideDynamicRange20();
    }

    public EventStream createEventStream() {
        return new EventStream();
    }

    public FloatRange createFloatRange() {
        return new FloatRange();
    }

    public PTZPresetTourSpotExtension createPTZPresetTourSpotExtension() {
        return new PTZPresetTourSpotExtension();
    }

    public WideDynamicRangeOptions createWideDynamicRangeOptions() {
        return new WideDynamicRangeOptions();
    }

    public Date createDate() {
        return new Date();
    }

    public OSDImgConfiguration createOSDImgConfiguration() {
        return new OSDImgConfiguration();
    }

    public AnalyticsEngine createAnalyticsEngine() {
        return new AnalyticsEngine();
    }

    public FindEventResultList createFindEventResultList() {
        return new FindEventResultList();
    }

    public PTControlDirectionOptionsExtension createPTControlDirectionOptionsExtension() {
        return new PTControlDirectionOptionsExtension();
    }

    public PTZPresetTourPresetDetail createPTZPresetTourPresetDetail() {
        return new PTZPresetTourPresetDetail();
    }

    public Mpeg4Options2 createMpeg4Options2() {
        return new Mpeg4Options2();
    }

    public ReceiverConfiguration createReceiverConfiguration() {
        return new ReceiverConfiguration();
    }

    public ImagingOptions20 createImagingOptions20() {
        return new ImagingOptions20();
    }

    public MetadataInput createMetadataInput() {
        return new MetadataInput();
    }

    public OSDImgOptionsExtension createOSDImgOptionsExtension() {
        return new OSDImgOptionsExtension();
    }

    public ItemListExtension createItemListExtension() {
        return new ItemListExtension();
    }

    public DNSInformationExtension createDNSInformationExtension() {
        return new DNSInformationExtension();
    }

    public Config createConfig() {
        return new Config();
    }

    public DeviceIOCapabilities createDeviceIOCapabilities() {
        return new DeviceIOCapabilities();
    }

    public PTZConfigurationExtension2 createPTZConfigurationExtension2() {
        return new PTZConfigurationExtension2();
    }

    public ActionEngineEventPayloadExtension createActionEngineEventPayloadExtension() {
        return new ActionEngineEventPayloadExtension();
    }

    public PTZPresetTourPresetDetailOptionsExtension
    createPTZPresetTourPresetDetailOptionsExtension() {
        return new PTZPresetTourPresetDetailOptionsExtension();
    }

    public ImagingOptions20Extension createImagingOptions20Extension() {
        return new ImagingOptions20Extension();
    }

    public Time createTime() {
        return new Time();
    }

    public PTControlDirectionOptions createPTControlDirectionOptions() {
        return new PTControlDirectionOptions();
    }

    public MessageDescriptionExtension createMessageDescriptionExtension() {
        return new MessageDescriptionExtension();
    }

    public Object createObject() {
        return new Object();
    }

    public BacklightCompensation createBacklightCompensation() {
        return new BacklightCompensation();
    }

    public VideoSourceConfigurationOptionsExtension createVideoSourceConfigurationOptionsExtension() {
        return new VideoSourceConfigurationOptionsExtension();
    }

    public FindMetadataResult createFindMetadataResult() {
        return new FindMetadataResult();
    }

    public ImagingSettingsExtension createImagingSettingsExtension() {
        return new ImagingSettingsExtension();
    }

    public RecordingJobTrack createRecordingJobTrack() {
        return new RecordingJobTrack();
    }

    public Dot11PSKSetExtension createDot11PSKSetExtension() {
        return new Dot11PSKSetExtension();
    }

    public WhiteBalanceOptions20 createWhiteBalanceOptions20() {
        return new WhiteBalanceOptions20();
    }

    public NTPInformationExtension createNTPInformationExtension() {
        return new NTPInformationExtension();
    }

    public RecordingJobSource createRecordingJobSource() {
        return new RecordingJobSource();
    }

    public ImagingOptions createImagingOptions() {
        return new ImagingOptions();
    }

    public MotionInCells createMotionInCells() {
        return new MotionInCells();
    }

    public ImagingStatus20 createImagingStatus20() {
        return new ImagingStatus20();
    }

    public Reverse createReverse() {
        return new Reverse();
    }

    public SupportedAnalyticsModules createSupportedAnalyticsModules() {
        return new SupportedAnalyticsModules();
    }

    public ImagingSettingsExtension20 createImagingSettingsExtension20() {
        return new ImagingSettingsExtension20();
    }

    public DigitalInput createDigitalInput() {
        return new DigitalInput();
    }

    public VideoAnalyticsStreamExtension createVideoAnalyticsStreamExtension() {
        return new VideoAnalyticsStreamExtension();
    }

    public PresetTour createPresetTour() {
        return new PresetTour();
    }

    public NetworkInterfaceExtension2 createNetworkInterfaceExtension2() {
        return new NetworkInterfaceExtension2();
    }

    public VideoDecoderConfigurationOptions createVideoDecoderConfigurationOptions() {
        return new VideoDecoderConfigurationOptions();
    }

    public OSDImgOptions createOSDImgOptions() {
        return new OSDImgOptions();
    }

    public Appearance createAppearance() {
        return new Appearance();
    }

    public WhiteBalance20Extension createWhiteBalance20Extension() {
        return new WhiteBalance20Extension();
    }

    public PaneLayout createPaneLayout() {
        return new PaneLayout();
    }

    public WhiteBalanceOptions createWhiteBalanceOptions() {
        return new WhiteBalanceOptions();
    }

    public DeviceCapabilities createDeviceCapabilities() {
        return new DeviceCapabilities();
    }

    public OSDTextOptions createOSDTextOptions() {
        return new OSDTextOptions();
    }

    public ObjectExtension createObjectExtension() {
        return new ObjectExtension();
    }

    public CapabilitiesExtension2 createCapabilitiesExtension2() {
        return new CapabilitiesExtension2();
    }

    public AnalyticsDeviceEngineConfiguration createAnalyticsDeviceEngineConfiguration() {
        return new AnalyticsDeviceEngineConfiguration();
    }

    public OSDTextConfiguration createOSDTextConfiguration() {
        return new OSDTextConfiguration();
    }

    public ColorCovariance createColorCovariance() {
        return new ColorCovariance();
    }

    public OSDPosConfiguration createOSDPosConfiguration() {
        return new OSDPosConfiguration();
    }

    public PTZSpeed createPTZSpeed() {
        return new PTZSpeed();
    }

    public NetworkCapabilitiesExtension createNetworkCapabilitiesExtension() {
        return new NetworkCapabilitiesExtension();
    }

    public PanTiltLimits createPanTiltLimits() {
        return new PanTiltLimits();
    }

    public RecordingSummary createRecordingSummary() {
        return new RecordingSummary();
    }

    public SecurityCapabilitiesExtension2 createSecurityCapabilitiesExtension2() {
        return new SecurityCapabilitiesExtension2();
    }

    public PTZNode createPTZNode() {
        return new PTZNode();
    }

    public PTZPresetTourStatus createPTZPresetTourStatus() {
        return new PTZPresetTourStatus();
    }

    public RuleEngineConfiguration createRuleEngineConfiguration() {
        return new RuleEngineConfiguration();
    }

    public VideoSourceConfigurationExtension createVideoSourceConfigurationExtension() {
        return new VideoSourceConfigurationExtension();
    }

    public TrackInformation createTrackInformation() {
        return new TrackInformation();
    }

    public AnalyticsDeviceExtension createAnalyticsDeviceExtension() {
        return new AnalyticsDeviceExtension();
    }

    public RecordingJobStateInformation createRecordingJobStateInformation() {
        return new RecordingJobStateInformation();
    }

    public VideoAnalyticsStream createVideoAnalyticsStream() {
        return new VideoAnalyticsStream();
    }

    public ConfigurationEntity createConfigurationEntity() {
        return new ConfigurationEntity();
    }

    public MoveOptions20 createMoveOptions20() {
        return new MoveOptions20();
    }

    public HostnameInformationExtension createHostnameInformationExtension() {
        return new HostnameInformationExtension();
    }

    public PTZPresetTourExtension createPTZPresetTourExtension() {
        return new PTZPresetTourExtension();
    }

    public MotionExpression createMotionExpression() {
        return new MotionExpression();
    }

    public H264Options createH264Options() {
        return new H264Options();
    }

    public ReceiverStateInformation createReceiverStateInformation() {
        return new ReceiverStateInformation();
    }

    public Dot11SecurityConfigurationExtension createDot11SecurityConfigurationExtension() {
        return new Dot11SecurityConfigurationExtension();
    }

    public NetworkProtocolExtension createNetworkProtocolExtension() {
        return new NetworkProtocolExtension();
    }

    public PTZStream createPTZStream() {
        return new PTZStream();
    }

    public FrameExtension createFrameExtension() {
        return new FrameExtension();
    }

    public PTZPresetTourSpot createPTZPresetTourSpot() {
        return new PTZPresetTourSpot();
    }

    public PTZPresetTourTypeExtension createPTZPresetTourTypeExtension() {
        return new PTZPresetTourTypeExtension();
    }

    public FocusOptions createFocusOptions() {
        return new FocusOptions();
    }

    public OSDTextOptionsExtension createOSDTextOptionsExtension() {
        return new OSDTextOptionsExtension();
    }

    public ImagingCapabilities createImagingCapabilities() {
        return new ImagingCapabilities();
    }

    public VideoOutputConfiguration createVideoOutputConfiguration() {
        return new VideoOutputConfiguration();
    }

    public AudioClassCandidate createAudioClassCandidate() {
        return new AudioClassCandidate();
    }

    public NetworkHostExtension createNetworkHostExtension() {
        return new NetworkHostExtension();
    }

    public ItemListDescription.SimpleItemDescription
    createItemListDescriptionSimpleItemDescription() {
        return new ItemListDescription.SimpleItemDescription();
    }

    public ItemListDescription.ElementItemDescription
    createItemListDescriptionElementItemDescription() {
        return new ItemListDescription.ElementItemDescription();
    }

    public ConfigDescription.Messages createConfigDescriptionMessages() {
        return new ConfigDescription.Messages();
    }

    public Behaviour.Removed createBehaviourRemoved() {
        return new Behaviour.Removed();
    }

    public Behaviour.Idle createBehaviourIdle() {
        return new Behaviour.Idle();
    }

    public ColorDescriptor.ColorCluster createColorDescriptorColorCluster() {
        return new ColorDescriptor.ColorCluster();
    }

    public EventSubscription.SubscriptionPolicy createEventSubscriptionSubscriptionPolicy() {
        return new EventSubscription.SubscriptionPolicy();
    }

    public ClassDescriptor.ClassCandidate createClassDescriptorClassCandidate() {
        return new ClassDescriptor.ClassCandidate();
    }

    public ItemList.SimpleItem createItemListSimpleItem() {
        return new ItemList.SimpleItem();
    }

    public ItemList.ElementItem createItemListElementItem() {
        return new ItemList.ElementItem();
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/schema",
            name = "VideoSourceConfiguration")
    public JAXBElement<VideoSourceConfiguration> createVideoSourceConfiguration(
            VideoSourceConfiguration value) {
        return new JAXBElement<VideoSourceConfiguration>(
                _VideoSourceConfiguration_QNAME, VideoSourceConfiguration.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataStream")
    public JAXBElement<MetadataStream> createMetadataStream(MetadataStream value) {
        return new JAXBElement<MetadataStream>(
                _MetadataStream_QNAME, MetadataStream.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/schema",
            name = "AudioEncoderConfiguration")
    public JAXBElement<AudioEncoderConfiguration> createAudioEncoderConfiguration(
            AudioEncoderConfiguration value) {
        return new JAXBElement<AudioEncoderConfiguration>(
                _AudioEncoderConfiguration_QNAME, AudioEncoderConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/schema",
            name = "VideoEncoderConfiguration")
    public JAXBElement<VideoEncoderConfiguration> createVideoEncoderConfiguration(
            VideoEncoderConfiguration value) {
        return new JAXBElement<VideoEncoderConfiguration>(
                _VideoEncoderConfiguration_QNAME, VideoEncoderConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/schema",
            name = "VideoAnalyticsConfiguration")
    public JAXBElement<VideoAnalyticsConfiguration> createVideoAnalyticsConfiguration(
            VideoAnalyticsConfiguration value) {
        return new JAXBElement<VideoAnalyticsConfiguration>(
                _VideoAnalyticsConfiguration_QNAME, VideoAnalyticsConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/schema",
            name = "AudioOutputConfiguration")
    public JAXBElement<AudioOutputConfiguration> createAudioOutputConfiguration(
            AudioOutputConfiguration value) {
        return new JAXBElement<AudioOutputConfiguration>(
                _AudioOutputConfiguration_QNAME, AudioOutputConfiguration.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polygon")
    public JAXBElement<Polygon> createPolygon(Polygon value) {
        return new JAXBElement<Polygon>(_Polygon_QNAME, Polygon.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "Polyline")
    public JAXBElement<Polyline> createPolyline(Polyline value) {
        return new JAXBElement<Polyline>(_Polyline_QNAME, Polyline.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/schema",
            name = "AudioSourceConfiguration")
    public JAXBElement<AudioSourceConfiguration> createAudioSourceConfiguration(
            AudioSourceConfiguration value) {
        return new JAXBElement<AudioSourceConfiguration>(
                _AudioSourceConfiguration_QNAME, AudioSourceConfiguration.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "MetadataConfiguration")
    public JAXBElement<MetadataConfiguration> createMetadataConfiguration(
            MetadataConfiguration value) {
        return new JAXBElement<MetadataConfiguration>(
                _MetadataConfiguration_QNAME, MetadataConfiguration.class, null, value);
    }

    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/schema", name = "PTZConfiguration")
    public JAXBElement<PTZConfiguration> createPTZConfiguration(PTZConfiguration value) {
        return new JAXBElement<PTZConfiguration>(
                _PTZConfiguration_QNAME, PTZConfiguration.class, null, value);
    }

    @XmlElementDecl(
            namespace = "http://www.onvif.org/ver10/schema",
            name = "AudioDecoderConfiguration")
    public JAXBElement<AudioDecoderConfiguration> createAudioDecoderConfiguration(
            AudioDecoderConfiguration value) {
        return new JAXBElement<AudioDecoderConfiguration>(
                _AudioDecoderConfiguration_QNAME, AudioDecoderConfiguration.class, null, value);
    }
}
