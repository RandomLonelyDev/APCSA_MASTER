package personal_tests.wildfire;

import personal_tests.wildfire.enums.Gender;
import personal_tests.wildfire.enums.Level;
import personal_tests.wildfire.enums.Location;
import personal_tests.libs.MathExtended;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DatabaseFiller {
    public static void main(String[] args) {
        int successful = 0;
        String php = "http://192.168.56.102/filldb.php";
        for (int i = 0; i < 100; i++) {
            user toAdd = new user("NETWORKED USER " + i, Gender.values()[MathExtended.randomInt(0,3)], Level.values()[MathExtended.randomInt(0,3)],MathExtended.randomInt(13,20));
            toAdd.setLoc(Location.values()[MathExtended.randomInt(0,5)]);
            String urlstring = String.format("%s?json=%s&username=%s&password=1234", php, user.userToJson(toAdd),"NETWORKEDUSER" + i);
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
                        System.out.println("JSON INJECTION SUCCESSFUL.");
                        successful++;
                    }
                } else {
                    System.out.print("\nHTTTP CONN ERROR\n");
                }
            } catch (IOException e) {
                System.out.print("\nIOError\n");
            }
        }
        System.out.format("\nRAN %d SUCCESSFUL QUERIES OUT OF %d TOTAL QUERIES\n",successful,100);
    }
}