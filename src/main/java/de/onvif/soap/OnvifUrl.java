package de.onvif.soap;

import lombok.Getter;

@Getter
public class OnvifUrl {

    private final String fullUrl;
    private final String xAddr;

    public OnvifUrl(String fullUrl) {
        this.fullUrl = fullUrl;
        this.xAddr = SOAP.removeIpFromUrl(fullUrl);
    }
}
