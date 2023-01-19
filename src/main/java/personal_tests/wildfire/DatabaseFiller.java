package personal_tests.wildfire;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;
import org.igniterealtime.restclient.entity.UserEntity;
import org.igniterealtime.restclient.enums.SupportedMediaType;
import personal_tests.wildfire.enums.Gender;
import personal_tests.wildfire.enums.Level;
import personal_tests.wildfire.enums.Location;
import personal_tests.libs.MathExtended;

import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DatabaseFiller {
    public static void main(String[] args) {
        RestApiClient client = new RestApiClient("openxmpp",9090,new AuthenticationToken("bazre77fGnyVYTXo"), SupportedMediaType.JSON);
        int successful = 0;
        final int amount = 25;
        for (int i = 0; i < amount; i++) {
            user toAdd = new user("NETWORKED_USER_" + i, Gender.values()[MathExtended.randomInt(0,3)], Level.values()[MathExtended.randomInt(0,3)],MathExtended.randomInt(13,20));
            toAdd.setLoc(Location.values()[MathExtended.randomInt(0,5)]);
            String urlstring = String.format("http://userstorage/backend.php?op=0&un="+toAdd.getName()+"&pw=1234&da="+user.userToJson(toAdd));
            try {
                URL url = new URL(urlstring);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder response = new StringBuilder();
                    while ((line = in.readLine()) != null) {
                        response.append(line);
                    }
                    in.close();
                    if (response.toString().equals("DONE")) {
                        Response r = client.createUser(userToEntity(toAdd));
                        System.out.println("JSON INJECTION SUCCESSFUL.");
                        successful++;
                    }
                } else {
                    System.out.print("\nHTTP CONN ERROR\n");
                }
            } catch (Exception e) {
                System.out.print("\nError\n" + e.getMessage() + "\n");
            }
        }
        System.out.format("\nRAN %d SUCCESSFUL QUERIES OUT OF %d TOTAL QUERIES\n",successful,amount);
    }

    private static UserEntity userToEntity(user in) {
        return new UserEntity(in.getName(),in.getName(), in.getName() + "@notan.email","1234");
    }
}