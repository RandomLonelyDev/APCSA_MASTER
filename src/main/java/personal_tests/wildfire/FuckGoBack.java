package personal_tests.wildfire;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;
import org.igniterealtime.restclient.entity.UserEntity;
import org.igniterealtime.restclient.enums.SupportedMediaType;
import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

public class FuckGoBack {
    public static void main(String[] args) throws Exception {
        RestApiClient client = new RestApiClient("23.254.201.235", 9090, new AuthenticationToken("CURUBHRjK7qJlNKB"), SupportedMediaType.JSON);
    }
}
