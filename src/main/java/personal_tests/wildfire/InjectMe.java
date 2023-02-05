package personal_tests.wildfire;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;
import org.igniterealtime.restclient.entity.UserEntity;
import org.igniterealtime.restclient.enums.SupportedMediaType;
import personal_tests.wildfire.enums.Gender;
import personal_tests.wildfire.enums.Level;
import personal_tests.wildfire.enums.Location;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class InjectMe {
    public static void main(String[] args) throws IOException {
        //RestApiClient client = new RestApiClient("http://openxmpp", 9090, new AuthenticationToken("asEUUY1aOMz8EiA6"), SupportedMediaType.JSON);
        User me = new User("tester", 16, Gender.MALE, Gender.FEMALE, Location.MIDWEST, Level.LONGTERM);
        //client.createUser(new UserEntity(me.username, me.username, me.username + "@example.com", "12345"));
        URL url = new URL("http://userstorage/backend.php?op=0&un=" + me.username + "&pw=12345&da=" + User.userToJson(me));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        System.out.println(conn.getResponseCode());
    }
}
