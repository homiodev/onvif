package de.onvif.soap.devices;

import de.onvif.soap.OnvifDeviceState;
import de.onvif.soap.SOAP;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.onvif.ver10.device.wsdl.CreateUsers;
import org.onvif.ver10.device.wsdl.CreateUsersResponse;
import org.onvif.ver10.device.wsdl.DeleteUsers;
import org.onvif.ver10.device.wsdl.DeleteUsersResponse;
import org.onvif.ver10.device.wsdl.GetCapabilities;
import org.onvif.ver10.device.wsdl.GetCapabilitiesResponse;
import org.onvif.ver10.device.wsdl.GetDeviceInformation;
import org.onvif.ver10.device.wsdl.GetDeviceInformationResponse;
import org.onvif.ver10.device.wsdl.GetHostname;
import org.onvif.ver10.device.wsdl.GetHostnameResponse;
import org.onvif.ver10.device.wsdl.GetScopes;
import org.onvif.ver10.device.wsdl.GetScopesResponse;
import org.onvif.ver10.device.wsdl.GetServices;
import org.onvif.ver10.device.wsdl.GetServicesResponse;
import org.onvif.ver10.device.wsdl.GetSystemDateAndTime;
import org.onvif.ver10.device.wsdl.GetSystemDateAndTimeResponse;
import org.onvif.ver10.device.wsdl.GetUsers;
import org.onvif.ver10.device.wsdl.GetUsersResponse;
import org.onvif.ver10.device.wsdl.Service;
import org.onvif.ver10.device.wsdl.SetHostname;
import org.onvif.ver10.device.wsdl.SetHostnameResponse;
import org.onvif.ver10.device.wsdl.SetScopes;
import org.onvif.ver10.device.wsdl.SetScopesResponse;
import org.onvif.ver10.device.wsdl.SystemReboot;
import org.onvif.ver10.device.wsdl.SystemRebootResponse;
import org.onvif.ver10.media.wsdl.CreateProfile;
import org.onvif.ver10.media.wsdl.CreateProfileResponse;
import org.onvif.ver10.media.wsdl.GetProfile;
import org.onvif.ver10.media.wsdl.GetProfileResponse;
import org.onvif.ver10.media.wsdl.GetProfiles;
import org.onvif.ver10.media.wsdl.GetProfilesResponse;
import org.onvif.ver10.schema.Capabilities;
import org.onvif.ver10.schema.Date;
import org.onvif.ver10.schema.Profile;
import org.onvif.ver10.schema.Scope;
import org.onvif.ver10.schema.Time;
import org.onvif.ver10.schema.User;
import org.onvif.ver10.schema.UserLevel;

@RequiredArgsConstructor
public class InitialDevices {

    private final @NotNull OnvifDeviceState onvifDeviceState;
    private final @NotNull SOAP soap;

    private GetProfilesResponse profilesResponse;
    private final @NotNull Map<String, Profile> profileToken2Profile = new HashMap<>();
    private GetDeviceInformationResponse deviceInformation;
    private List<Scope> scopes;
    private List<Service> services;

    public void dispose() {
        profilesResponse = null;
        profileToken2Profile.clear();
        deviceInformation = null;
        scopes = null;
    }

    public java.util.Date getDate() {
        Calendar cal;

        GetSystemDateAndTimeResponse response =
                soap.createSOAPDeviceRequestType(
                        new GetSystemDateAndTime(), GetSystemDateAndTimeResponse.class);

        Date date = response.getSystemDateAndTime().getUTCDateTime().getDate();
        Time time = response.getSystemDateAndTime().getUTCDateTime().getTime();
        cal =
                new GregorianCalendar(
                        date.getYear(),
                        date.getMonth() - 1,
                        date.getDay(),
                        time.getHour(),
                        time.getMinute(),
                        time.getSecond());

        return cal.getTime();
    }

    public GetDeviceInformationResponse getDeviceInformation() {
        if (deviceInformation == null) {
            GetDeviceInformation information = new GetDeviceInformation();
            deviceInformation = soap.createSOAPDeviceRequestType(information, GetDeviceInformationResponse.class);
        }
        return deviceInformation;
    }

    public @Nullable String getHostname() {
        GetHostname getHostname = new GetHostname();
        GetHostnameResponse response =
                soap.createSOAPDeviceRequestType(getHostname, GetHostnameResponse.class);
        return response == null ? null : response.getHostnameInformation().getName();
    }

    public void setHostname(String hostname) {
        SetHostname setHostname = new SetHostname();
        setHostname.setName(hostname);
        soap.createSOAPDeviceRequest(setHostname, SetHostnameResponse.class);
    }

    public @NotNull List<User> getUsers() {
        GetUsers getUsers = new GetUsers();
        GetUsersResponse response = soap.createSOAPDeviceRequestType(getUsers, GetUsersResponse.class);
        return response == null ? List.of() : response.getUser();
    }

    public boolean createUsers(String userName, UserLevel userLevel, String password) {
        CreateUsers request = new CreateUsers();
        request.getUser().add(new User()
            .setUserLevel(userLevel)
            .setPassword(password)
            .setUsername(userName));
        return null != soap.createSOAPDeviceRequestType(request, CreateUsersResponse.class);
    }

    public boolean deleteUser(String userName) {
        DeleteUsers request = new DeleteUsers();
        request.getUsername().add(userName);
        return null != soap.createSOAPDeviceRequestType(request, DeleteUsersResponse.class);
    }

    @SneakyThrows
    public @Nullable Capabilities getCapabilities() {
        GetCapabilities request = new GetCapabilities();
        GetCapabilitiesResponse response =
                soap.createSOAPRequest(
                        request,
                        GetCapabilitiesResponse.class,
                        onvifDeviceState.getServerDeviceUri(),
                        false);
        return response == null ? null : response.getCapabilities();
    }

    public @NotNull List<Profile> getProfiles() {
        if (this.profilesResponse == null) {
            profilesResponse = soap.createSOAPMediaRequest(new GetProfiles(), GetProfilesResponse.class);
        }

        return profilesResponse == null ? List.of() : profilesResponse.getProfiles();
    }

    public @Nullable Profile getProfile(@NotNull String profileToken) {
        if (!profileToken2Profile.containsKey(profileToken)) {
            GetProfile request = new GetProfile();
            request.setProfileToken(profileToken);

            GetProfileResponse response = soap.createSOAPMediaRequest(request, GetProfileResponse.class);

            if (response == null) {
                return null;
            }

            profileToken2Profile.put(profileToken, response.getProfile());
        }
        return profileToken2Profile.get(profileToken);
    }

    public @Nullable Profile createProfile(String name) {
        CreateProfile request = new CreateProfile();
        request.setName(name);

        CreateProfileResponse response = soap.createSOAPMediaRequest(request, CreateProfileResponse.class);
        return response == null ? null : response.getProfile();
    }

    public @NotNull List<Service> getServices() {
        if (services == null) {
            GetServices request = new GetServices().setIncludeCapability(true);
            GetServicesResponse response = soap.createSOAPDeviceRequestType(request, GetServicesResponse.class);
            services = response == null ? null : response.getService();
        }
        return services == null ? List.of() : services;
    }

    public @NotNull List<Scope> getScopes() {
        if (this.scopes == null) {
            GetScopesResponse response = soap.createSOAPMediaRequest(new GetScopes(), GetScopesResponse.class);
            if (response == null) {
                return List.of();
            }

            this.scopes = response.getScopes();
        }
        return this.scopes;
    }

    public @NotNull String getName() {
        List<String> nameScopes = getScope("odm:name:");
        if (!nameScopes.isEmpty()) {
            return nameScopes.get(nameScopes.size() - 1).substring("odm:name:".length());
        }
        nameScopes = getScope("onvif://www.onvif.org/name/");
        return nameScopes.isEmpty()
                ? ""
                : nameScopes.get(nameScopes.size() - 1).substring("onvif://www.onvif.org/name/".length());
    }

    @SneakyThrows
    public void setName(String name) {
        this.scopes = null;
        if (!getName().equals(name)) {
            SetScopes request = new SetScopes();
            request.getScopes().add("odm:name:" + name);
            soap.createSOAPDeviceRequest(request, SetScopesResponse.class);
            this.scopes = null;
        }
    }

    @SneakyThrows
    public @Nullable String reboot() {
        SystemReboot request = new SystemReboot();
        SystemRebootResponse response = soap.createSOAPMediaRequest(request, SystemRebootResponse.class);
        return response == null ? null : response.getMessage();
    }

    public List<String> getScope(String name) {
        return getScopes().stream()
                .map(Scope::getScopeItem)
                .filter(s -> s.startsWith(name))
                .collect(Collectors.toList());
    }
}
