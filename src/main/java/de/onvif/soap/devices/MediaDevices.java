package de.onvif.soap.devices;

import de.onvif.soap.OnvifDeviceState;
import de.onvif.soap.SOAP;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.onvif.ver10.media.wsdl.GetAudioSources;
import org.onvif.ver10.media.wsdl.GetAudioSourcesResponse;
import org.onvif.ver10.media.wsdl.GetSnapshotUri;
import org.onvif.ver10.media.wsdl.GetSnapshotUriResponse;
import org.onvif.ver10.media.wsdl.GetStreamUri;
import org.onvif.ver10.media.wsdl.GetStreamUriResponse;
import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptions;
import org.onvif.ver10.media.wsdl.GetVideoEncoderConfigurationOptionsResponse;
import org.onvif.ver10.media.wsdl.GetVideoSources;
import org.onvif.ver10.media.wsdl.GetVideoSourcesResponse;
import org.onvif.ver10.media.wsdl.SetVideoEncoderConfiguration;
import org.onvif.ver10.media.wsdl.SetVideoEncoderConfigurationResponse;
import org.onvif.ver10.schema.AudioSource;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.StreamSetup;
import org.onvif.ver10.schema.StreamType;
import org.onvif.ver10.schema.Transport;
import org.onvif.ver10.schema.TransportProtocol;
import org.onvif.ver10.schema.VideoEncoderConfiguration;
import org.onvif.ver10.schema.VideoEncoderConfigurationOptions;
import org.onvif.ver10.schema.VideoSource;

@RequiredArgsConstructor
public class MediaDevices {

    private final OnvifDeviceState onvifDeviceState;
    private final SOAP soap;

    private final Map<String, ProfileMediaDeviceCache> profileCache = new HashMap<>();

    public static VideoEncoderConfiguration getVideoEncoderConfiguration(Profile profile) {
        return profile.getVideoEncoderConfiguration();
    }

    public String getHTTPStreamUri(@NotNull String profile) {
        return getStreamUri(profile, TransportProtocol.HTTP);
    }

    public String getUDPStreamUri(@NotNull String profile) {
        return getStreamUri(profile, TransportProtocol.UDP);
    }

    public String getRTSPStreamUri(@NotNull String profile) {
        return getStreamUri(profile, TransportProtocol.TCP);
    }

    public VideoEncoderConfigurationOptions getVideoEncoderConfigurationOptions(String profileToken) {
        GetVideoEncoderConfigurationOptions request = new GetVideoEncoderConfigurationOptions();
        request.setProfileToken(profileToken);

        GetVideoEncoderConfigurationOptionsResponse response =
                soap.createSOAPMediaRequest(request, GetVideoEncoderConfigurationOptionsResponse.class);

        if (response == null) {
            return null;
        }

        return response.getOptions();
    }

    public boolean setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
        SetVideoEncoderConfiguration request = new SetVideoEncoderConfiguration();
        request.setConfiguration(videoEncoderConfiguration);
        request.setForcePersistence(true);

        SetVideoEncoderConfigurationResponse response =
                soap.createSOAPMediaRequest(request, SetVideoEncoderConfigurationResponse.class);
        return response != null;
    }

    public String getSnapshotUri(String profile) {
        profileCache.putIfAbsent(profile, new ProfileMediaDeviceCache());
        ProfileMediaDeviceCache mediaDeviceCache = profileCache.get(profile);
        if (mediaDeviceCache.snapshotUri == null) {
            try {
                GetSnapshotUri request = new GetSnapshotUri();
                request.setProfileToken(profile);

                GetSnapshotUriResponse response =
                        soap.createSOAPMediaRequest(request, GetSnapshotUriResponse.class);
                if (response == null || response.getMediaUri() == null) {
                    return null;
                }

                mediaDeviceCache.snapshotUri =
                        onvifDeviceState.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
            } catch (Exception ex) {
                return null;
            }
        }
        return mediaDeviceCache.snapshotUri;
    }

    public List<VideoSource> getVideoSources() {
        GetVideoSources request = new GetVideoSources();
        GetVideoSourcesResponse response =
                soap.createSOAPMediaRequest(request, GetVideoSourcesResponse.class);
        if (response == null) {
            return null;
        }

        return response.getVideoSources();
    }

    public List<AudioSource> getAudioSources() {
        GetAudioSources request = new GetAudioSources();
        GetAudioSourcesResponse response =
                soap.createSOAPMediaRequest(request, GetAudioSourcesResponse.class);
        if (response == null) {
            return null;
        }

        return response.getAudioSources();
    }

    public void dispose() {
        profileCache.clear();
    }

    @SneakyThrows
    private String getStreamUri(String profileToken, StreamSetup streamSetup) {
        GetStreamUri request = new GetStreamUri();
        request.setProfileToken(profileToken);
        request.setStreamSetup(streamSetup);
        GetStreamUriResponse response =
                soap.createSOAPMediaRequest(request, GetStreamUriResponse.class);

        if (response == null) {
            return null;
        }

        return onvifDeviceState.replaceLocalIpWithProxyIp(response.getMediaUri().getUri());
    }

    private String getStreamUri(@NotNull String profile, TransportProtocol transportProtocol) {
        profileCache.putIfAbsent(profile, new ProfileMediaDeviceCache());
        ProfileMediaDeviceCache mediaDeviceCache = profileCache.get(profile);
        if (!mediaDeviceCache.protocolURI.containsKey(transportProtocol)) {
            StreamSetup setup = new StreamSetup();
            setup.setStream(StreamType.RTP_UNICAST);
            Transport transport = new Transport();
            transport.setProtocol(transportProtocol);
            setup.setTransport(transport);
            mediaDeviceCache.protocolURI.put(transportProtocol, getStreamUri(profile, setup));
        }
        return mediaDeviceCache.protocolURI.get(transportProtocol);
    }

    private static class ProfileMediaDeviceCache {

        private final Map<TransportProtocol, String> protocolURI = new HashMap<>();
        private String snapshotUri;
    }
}
