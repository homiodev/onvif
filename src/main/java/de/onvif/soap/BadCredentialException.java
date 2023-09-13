package de.onvif.soap;

public class BadCredentialException extends RuntimeException {

    public BadCredentialException(String message) {
        super(message);
    }
}
