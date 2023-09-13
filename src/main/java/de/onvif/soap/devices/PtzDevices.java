package de.onvif.soap.devices;

import de.onvif.soap.OnvifDeviceState;
import de.onvif.soap.SOAP;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.onvif.ver10.schema.FloatRange;
import org.onvif.ver10.schema.PTZConfiguration;
import org.onvif.ver10.schema.PTZNode;
import org.onvif.ver10.schema.PTZPreset;
import org.onvif.ver10.schema.PTZSpaces;
import org.onvif.ver10.schema.PTZSpeed;
import org.onvif.ver10.schema.PTZStatus;
import org.onvif.ver10.schema.PTZVector;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.Vector1D;
import org.onvif.ver10.schema.Vector2D;
import org.onvif.ver20.ptz.wsdl.AbsoluteMove;
import org.onvif.ver20.ptz.wsdl.AbsoluteMoveResponse;
import org.onvif.ver20.ptz.wsdl.ContinuousMove;
import org.onvif.ver20.ptz.wsdl.ContinuousMoveResponse;
import org.onvif.ver20.ptz.wsdl.GetNode;
import org.onvif.ver20.ptz.wsdl.GetNodeResponse;
import org.onvif.ver20.ptz.wsdl.GetNodes;
import org.onvif.ver20.ptz.wsdl.GetNodesResponse;
import org.onvif.ver20.ptz.wsdl.GetPresets;
import org.onvif.ver20.ptz.wsdl.GetPresetsResponse;
import org.onvif.ver20.ptz.wsdl.GetStatus;
import org.onvif.ver20.ptz.wsdl.GetStatusResponse;
import org.onvif.ver20.ptz.wsdl.GotoPreset;
import org.onvif.ver20.ptz.wsdl.GotoPresetResponse;
import org.onvif.ver20.ptz.wsdl.RelativeMove;
import org.onvif.ver20.ptz.wsdl.RelativeMoveResponse;
import org.onvif.ver20.ptz.wsdl.RemovePreset;
import org.onvif.ver20.ptz.wsdl.RemovePresetResponse;
import org.onvif.ver20.ptz.wsdl.SetHomePosition;
import org.onvif.ver20.ptz.wsdl.SetHomePositionResponse;
import org.onvif.ver20.ptz.wsdl.SetPreset;
import org.onvif.ver20.ptz.wsdl.SetPresetResponse;
import org.onvif.ver20.ptz.wsdl.Stop;
import org.onvif.ver20.ptz.wsdl.StopResponse;

@Getter
@RequiredArgsConstructor
public class PtzDevices {

    private final OnvifDeviceState onvifDeviceState;
    private final SOAP soap;

    // These hold the cameras PTZ position in the range that the camera uses, ie
    // mine is -1 to +1
    private Float panRangeMin = -1.0f;
    private Float panRangeMax = 1.0f;
    private Float tiltRangeMin = -1.0f;
    private Float tiltRangeMax = 1.0f;
    private Float zoomMin = 0.0f;
    private Float zoomMax = 1.0f;

    // These hold the PTZ values for updating controls in 0-100 range
    private Float currentPanPercentage = 0.0f;
    private Float currentTiltPercentage = 0.0f;
    private Float currentZoomPercentage = 0.0f;
    private Float currentPanCamValue = 0.0f;
    private Float currentTiltCamValue = 0.0f;
    private Float currentZoomCamValue = 0.0f;
    private List<PTZPreset> presets;

    public boolean isPtzOperationsSupported(@NotNull Profile profile) {
        return getPTZConfiguration(profile) != null;
    }

    /**
     * @param profile - profile
     * @return If is null, PTZ operations are not supported
     */
    public @Nullable PTZConfiguration getPTZConfiguration(@NotNull Profile profile) {
        if (profile.getPtzConfiguration() == null) {
            return null; // no PTZ support
        }

        return profile.getPtzConfiguration();
    }

    public @Nullable List<PTZNode> getNodes() {
        GetNodes request = new GetNodes();
        GetNodesResponse response = soap.createSOAPDeviceRequestType(request, GetNodesResponse.class);
        return response == null ? null : response.getPTZNode();
    }

    public @Nullable PTZNode getNode(@NotNull Profile profile) {
        return getNode(getPTZConfiguration(profile));
    }

    public @Nullable PTZNode getNode(@Nullable PTZConfiguration ptzConfiguration) {
        GetNode request = new GetNode();
        if (ptzConfiguration == null) {
            return null; // no PTZ support
        }
        request.setNodeToken(ptzConfiguration.getNodeToken());

        GetNodeResponse response = soap.createSOAPDeviceRequestType(request, GetNodeResponse.class);
        return response == null ? null : response.getPTZNode();
    }

    public @Nullable FloatRange getPanSpaces(@NotNull Profile profile) {
        PTZNode node = getNode(profile);
        if (node != null) {
            PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
            return ptzSpaces.getAbsolutePanTiltPositionSpace().get(0).getXRange();
        }
        return null;
    }

    public @Nullable FloatRange getTiltSpaces(@NotNull Profile profile) {
        PTZNode node = getNode(profile);
        if (node != null) {
            PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
            return ptzSpaces.getAbsolutePanTiltPositionSpace().get(0).getYRange();
        }
        return null;
    }

    public @Nullable FloatRange getZoomSpaces(@NotNull Profile profile) {
        PTZNode node = getNode(profile);
        if (node != null) {
            PTZSpaces ptzSpaces = node.getSupportedPTZSpaces();
            return ptzSpaces.getAbsoluteZoomPositionSpace().get(0).getXRange();
        }
        return null;
    }

    public boolean isAbsoluteMoveSupported(@NotNull Profile profile) {
        try {
            if (profile.getPtzConfiguration().getDefaultAbsolutePantTiltPositionSpace() != null) {
                return true;
            }
        } catch (NullPointerException ignore) {
        }
        return false;
    }

    public boolean isRelativeMoveSupported(@NotNull Profile profile) {
        try {
            if (profile.getPtzConfiguration().getDefaultRelativePanTiltTranslationSpace() != null) {
                return true;
            }
        } catch (NullPointerException ignore) {
        }
        return false;
    }

    public boolean relativeMove(float x, float y, float zoom, @NotNull Profile profile) {
        RelativeMove request = new RelativeMove();
        Vector2D panTiltVector = new Vector2D();
        panTiltVector.setX(x);
        panTiltVector.setY(y);
        Vector1D zoomVector = new Vector1D();
        zoomVector.setX(zoom);

        PTZVector translation = new PTZVector();
        translation.setPanTilt(panTiltVector);
        translation.setZoom(zoomVector);

        request.setProfileToken(profile.getToken());
        request.setTranslation(translation);

        RelativeMoveResponse response = soap.createSOAPPtzRequest(request, RelativeMoveResponse.class);
        return response != null;
    }

    public boolean isContinuousMoveSupported(@NotNull Profile profile) {
        try {
            if (profile.getPtzConfiguration().getDefaultContinuousPanTiltVelocitySpace() != null) {
                return true;
            }
        } catch (NullPointerException ignored) {
        }
        return false;
    }

    public boolean continuousMove(float x, float y, float zoom, @NotNull Profile profile) {
        ContinuousMove request = new ContinuousMove();
        Vector2D panTiltVector = new Vector2D();
        panTiltVector.setX(x);
        panTiltVector.setY(y);
        Vector1D zoomVector = new Vector1D();
        zoomVector.setX(zoom);

        PTZSpeed ptzSpeed = new PTZSpeed();
        ptzSpeed.setPanTilt(panTiltVector);
        ptzSpeed.setZoom(zoomVector);
        request.setVelocity(ptzSpeed);

        request.setProfileToken(profile.getToken());

        return null != soap.createSOAPPtzRequest(request, ContinuousMoveResponse.class);
    }

    public boolean stopMove(@NotNull Profile profile) {
        Stop request = new Stop();
        request.setPanTilt(true);
        request.setZoom(true);
        request.setProfileToken(profile.getToken());

        return null != soap.createSOAPPtzRequest(request, StopResponse.class);
    }

    public @Nullable PTZStatus getStatus(@NotNull Profile profile) {
        GetStatus request = new GetStatus();
        request.setProfileToken(profile.getToken());

        GetStatusResponse response = soap.createSOAPPtzRequest(request, GetStatusResponse.class);
        return response == null ? null : response.getPTZStatus();
    }

    public @Nullable PTZVector getPosition(@NotNull Profile profile) {
        PTZStatus status = getStatus(profile);

        if (status == null) {
            return null;
        }

        return status.getPosition();
    }

    public boolean setHomePosition(@NotNull Profile profile) {
        SetHomePosition request = new SetHomePosition();
        request.setProfileToken(profile.getToken());

        return null != soap.createSOAPPtzRequest(request, SetHomePositionResponse.class);
    }

    public @Nullable List<PTZPreset> getPresets(@NotNull Profile profile) {
        if (this.presets == null) {
            GetPresets request = new GetPresets();
            request.setProfileToken(profile.getToken());

            GetPresetsResponse response = soap.createSOAPPtzRequest(request, GetPresetsResponse.class);

            if (response == null) {
                return null;
            }

            this.presets = response.getPreset();
        }
        return this.presets;
    }

    public @Nullable String setPreset(@NotNull String presetName, @Nullable String presetToken, @NotNull Profile profile) {
        SetPreset request = new SetPreset();
        request.setProfileToken(profile.getToken());
        request.setPresetName(presetName);
        request.setPresetToken(presetToken);

        SetPresetResponse response = soap.createSOAPPtzRequest(request, SetPresetResponse.class);
        return response == null ? null : response.getPresetToken();
    }

    public @Nullable String setPreset(@NotNull String presetName, @NotNull Profile profile) {
        return setPreset(presetName, null, profile);
    }

    public boolean removePreset(@NotNull String presetToken, @NotNull Profile profile) {
        RemovePreset request = new RemovePreset();
        request.setProfileToken(profile.getToken());
        request.setPresetToken(presetToken);

        return null != soap.createSOAPPtzRequest(request, RemovePresetResponse.class);
    }

    public void setAbsolutePan(float panValue, @NotNull Profile profile) {
        currentPanPercentage = panValue;
        currentPanCamValue = ((((panRangeMin - panRangeMax) * -1) / 100) * panValue + panRangeMin);
        absoluteMove(currentPanCamValue, currentTiltCamValue, currentZoomCamValue, profile);
    }

    public void setAbsoluteTilt(float tiltValue, @NotNull Profile profile) {
        currentTiltPercentage = tiltValue;
        currentTiltCamValue = ((((panRangeMin - panRangeMax) * -1) / 100) * tiltValue + tiltRangeMin);
        absoluteMove(currentPanCamValue, currentTiltCamValue, currentZoomCamValue, profile);
    }

    public void setAbsoluteZoom(float zoomValue, @NotNull Profile profile) { // Value is 0-100% of cameras range
        currentZoomPercentage = zoomValue;
        currentZoomCamValue = ((((zoomMin - zoomMax) * -1) / 100) * zoomValue + zoomMin);
        absoluteMove(currentPanCamValue, currentTiltCamValue, currentZoomCamValue, profile);
    }

    public void moveLeft(boolean continuous, @NotNull Profile profile) {
        if (continuous) {
            continuousMove(-0.5f, 0f, 0f, profile);
        } else {
            relativeMove(0.05000000f, 0f, 0f, profile);
        }
    }

    public void moveRight(boolean continuous, @NotNull Profile profile) {
        if (continuous) {
            continuousMove(0.5f, 0f, 0f, profile);
        } else {
            relativeMove(-0.05000000f, 0f, 0f, profile);
        }
    }

    public void moveUp(boolean continuous, @NotNull Profile profile) {
        if (continuous) {
            continuousMove(0f, -0f, 0f, profile);
        } else {
            relativeMove(0f, 0.100000000f, 0f, profile);
        }
    }

    public void moveDown(boolean continuous, @NotNull Profile profile) {
        if (continuous) {
            continuousMove(0f, 0.5f, 0f, profile);
        } else {
            relativeMove(0f, -0.100000000f, 0f, profile);
        }
    }

    public void moveIn(boolean continuous, @NotNull Profile profile) {
        if (continuous) {
            continuousMove(0f, 0f, 0.5f, profile);
        } else {
            relativeMove(0f, 0f, 0.0240506344f, profile);
        }
    }

    public void moveOut(boolean continuous, @NotNull Profile profile) {
        if (continuous) {
            continuousMove(0f, 0f, -0.5f, profile);
        } else {
            relativeMove(0f, 0f, -0.0240506344f, profile);
        }
    }

    public void initFully(@NotNull Profile profile) {
        PTZStatus ptzStatus = getStatus(profile);
        this.presets = getPresets();

        currentPanCamValue = ptzStatus.getPosition().getPanTilt().getX();
        currentPanPercentage =
                (((panRangeMin - currentPanCamValue) * -1) / ((panRangeMin - panRangeMax) * -1)) * 100;

        currentTiltCamValue = ptzStatus.getPosition().getPanTilt().getY();
        currentTiltPercentage =
                (((tiltRangeMin - currentTiltCamValue) * -1) / ((tiltRangeMin - tiltRangeMax) * -1)) * 100;

        currentZoomCamValue = ptzStatus.getPosition().getZoom().getX();
        currentZoomPercentage =
                (((zoomMin - currentZoomCamValue) * -1) / ((zoomMin - zoomMax) * -1)) * 100;
    }

    public void gotoPreset(int index, @NotNull Profile profile) {
        gotoPreset(getPresets().get(index).getToken(), profile);
    }

    public boolean supportPTZ() {
        return onvifDeviceState.getServerPtzUri() != null;
    }

    public void dispose() {
        presets = null;
        panRangeMin = -1.0f;
        panRangeMax = 1.0f;
        tiltRangeMin = -1.0f;
        tiltRangeMax = 1.0f;
        zoomMin = 0.0f;
        zoomMax = 1.0f;

        currentPanPercentage = 0.0f;
        currentTiltPercentage = 0.0f;
        currentZoomPercentage = 0.0f;
        currentPanCamValue = 0.0f;
        currentTiltCamValue = 0.0f;
        currentZoomCamValue = 0.0f;
    }

    /**
     * @param x    Pan-Position
     * @param y    Tilt-Position
     * @param zoom Zoom
     * @return True if move successful
     */
    @SneakyThrows
    private boolean absoluteMove(float x, float y, float zoom, @NotNull Profile profile) {
        PTZNode node = getNode(profile);
        if (node != null) {
            FloatRange xRange =
                    node.getSupportedPTZSpaces().getAbsolutePanTiltPositionSpace().get(0).getXRange();
            FloatRange yRange =
                    node.getSupportedPTZSpaces().getAbsolutePanTiltPositionSpace().get(0).getYRange();
            FloatRange zRange =
                    node.getSupportedPTZSpaces().getAbsoluteZoomPositionSpace().get(0).getXRange();

            if (zoom < zRange.getMin() || zoom > zRange.getMax()) {
                throw new IllegalArgumentException("Bad value for zoom: " + zoom);
            }
            if (x < xRange.getMin() || x > xRange.getMax()) {
                throw new IllegalArgumentException("Bad value for pan:/x " + x);
            }
            if (y < yRange.getMin() || y > yRange.getMax()) {
                throw new IllegalArgumentException("Bad value for tilt/y: " + y);
            }
        }

        AbsoluteMove request = new AbsoluteMove();
        request.setPosition(new PTZVector(x, y, zoom));
        request.setProfileToken(profile.getToken());
        request.setSpeed(new PTZSpeed(0.1f, 0.1f, 0));

        AbsoluteMoveResponse response = soap.createSOAPPtzRequest(request, AbsoluteMoveResponse.class);
        return response != null;
    }

    private boolean gotoPreset(@NotNull String presetToken, @NotNull Profile profile) {
        GotoPreset request = new GotoPreset();
        request.setProfileToken(profile.getToken());
        request.setPresetToken(presetToken);

        GotoPresetResponse response = soap.createSOAPPtzRequest(request, GotoPresetResponse.class);
        return response != null;
    }
}
