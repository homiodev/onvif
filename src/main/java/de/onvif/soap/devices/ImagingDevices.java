package de.onvif.soap.devices;

import de.onvif.soap.OnvifDeviceState;
import de.onvif.soap.SOAP;
import lombok.RequiredArgsConstructor;
import org.onvif.ver10.schema.AbsoluteFocus;
import org.onvif.ver10.schema.FocusMove;
import org.onvif.ver10.schema.ImagingOptions20;
import org.onvif.ver10.schema.ImagingSettings20;
import org.onvif.ver20.imaging.wsdl.GetImagingSettings;
import org.onvif.ver20.imaging.wsdl.GetImagingSettingsResponse;
import org.onvif.ver20.imaging.wsdl.GetOptions;
import org.onvif.ver20.imaging.wsdl.GetOptionsResponse;
import org.onvif.ver20.imaging.wsdl.Move;
import org.onvif.ver20.imaging.wsdl.MoveResponse;
import org.onvif.ver20.imaging.wsdl.SetImagingSettings;
import org.onvif.ver20.imaging.wsdl.SetImagingSettingsResponse;

@RequiredArgsConstructor
public class ImagingDevices {

    private final OnvifDeviceState onvifDeviceState;
    private final SOAP soap;

    public ImagingOptions20 getOptions(String videoSourceToken) {
        if (videoSourceToken == null) {
            return null;
        }

        GetOptions request = new GetOptions();
        request.setVideoSourceToken(videoSourceToken);

        GetOptionsResponse response = soap.createSOAPImagingRequest(request, GetOptionsResponse.class);
        return response == null ? null : response.getImagingOptions();
    }

    public boolean moveFocus(String videoSourceToken, float absoluteFocusValue) {
        if (videoSourceToken == null) {
            return false;
        }

        Move request = new Move();
        AbsoluteFocus absoluteFocus = new AbsoluteFocus();
        absoluteFocus.setPosition(absoluteFocusValue);

        FocusMove focusMove = new FocusMove();
        focusMove.setAbsolute(absoluteFocus);

        request.setVideoSourceToken(videoSourceToken);
        request.setFocus(focusMove);

        MoveResponse response = soap.createSOAPImagingRequest(request, MoveResponse.class);

        return response != null;
    }

    public ImagingSettings20 getImagingSettings(String videoSourceToken) {
        if (videoSourceToken == null) {
            return null;
        }

        GetImagingSettings request = new GetImagingSettings();
        request.setVideoSourceToken(videoSourceToken);

        GetImagingSettingsResponse response =
                soap.createSOAPImagingRequest(request, GetImagingSettingsResponse.class);
        return response == null ? null : response.getImagingSettings();
    }

    public boolean setImagingSettings(String videoSourceToken, ImagingSettings20 imagingSettings) {
        if (videoSourceToken == null) {
            return false;
        }

        SetImagingSettings request = new SetImagingSettings();
        request.setVideoSourceToken(videoSourceToken);
        request.setImagingSettings(imagingSettings);

        SetImagingSettingsResponse response =
                soap.createSOAPImagingRequest(request, SetImagingSettingsResponse.class);
        return response != null;
    }

    public void dispose() {
    }
}
