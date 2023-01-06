package personal_tests.wildfire;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;
import org.igniterealtime.restclient.entity.UserEntity;
import org.igniterealtime.restclient.enums.SupportedMediaType;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RESTtest {
    public static void main(String[] args) {
        RestApiClient client = new RestApiClient("openxmpp",9090,new AuthenticationToken("bazre77fGnyVYTXo"), SupportedMediaType.JSON);
        String us = client.getUser("admin").getUsername();
        System.out.println(us);
    }
}
