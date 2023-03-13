package personal_tests.wildfire;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;
import org.igniterealtime.restclient.entity.UserEntity;
import org.igniterealtime.restclient.enums.SupportedMediaType;
import personal_tests.libs.MathExtended;
import personal_tests.wildfire.enums.Gender;
import personal_tests.wildfire.enums.Level;
import personal_tests.wildfire.enums.Location;

import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.net.*;

public class DatabaseFiller {
    public static void main(String[] args) {
        int successful = 0;
        final int amount = 5;
        //RestApiClient client = new RestApiClient("23.254.201.235", 9090, new AuthenticationToken("CURUBHRjK7qJlNKB"), SupportedMediaType.JSON);
        for (int i = 0; i < amount; i++) {
            String un = "test_user_" + i;
            User toAdd = new User(un);
            String urlstring = "http://142.11.243.210/backend.php?op=0&un=" + un + "&pw=1234&da=" + User.userToJson(toAdd) + "&pic=" + "";
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
                    System.out.println(response);
                    if (response.toString().equals("DONE")) {
                        System.out.println("JSON INJECTION SUCCESSFUL.");
                        //Response r = client.createUser(new UserEntity(toAdd.username.toLowerCase(), toAdd.username.toLowerCase(), toAdd.username.toLowerCase() + "@example.com", "1234"));
                        successful++;
                    }
                } else {
                    System.out.print("\nHTTP CONN ERROR\n");
                }
            } catch (Exception e) {
                System.out.print("\nError\n" + e.getMessage() + "\n");
            }
        }
        System.out.format("\nRAN %d SUCCESSFUL QUERIES OUT OF %d TOTAL QUERIES\n", successful, amount);
    }
}