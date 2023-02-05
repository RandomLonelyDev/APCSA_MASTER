package personal_tests.wildfire;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;
import org.igniterealtime.restclient.entity.UserEntity;
import org.igniterealtime.restclient.enums.SupportedMediaType;

public class BasicRest {
    public static void main(String[] args) {
        RestApiClient client = new RestApiClient("openxmpp", 9090, new AuthenticationToken("asEUUY1aOMz8EiA6"), SupportedMediaType.JSON);
        for(int i = 1; i < 250; i++) {
            client.deleteUser("networked_user_" + i);
        }
    }
}
