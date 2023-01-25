package personal_tests.wildfire;

import org.jetbrains.annotations.NotNull;
import personal_tests.wildfire.enums.Gender;
import personal_tests.wildfire.enums.Level;
import personal_tests.wildfire.enums.Location;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringDecoder {
    public static void main(String[] args) {
        String sUrl = "http://userstorage/backend.php?op=8&lm=0";
        try {
            URL url = new URL(sUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            if(connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while((line = in.readLine()) != null) {
                    response.append(line);
                }
                in.close();
                String[] data = response.toString().trim().split("<br>");
                ArrayList<User> output = new ArrayList<>();
                for(String i : data) {
                    output.add(decode(i));
                    System.out.println("\n");
                }
            }
        } catch (MalformedURLException e) {
            System.out.println("URL is wrong");
        } catch (IOException e) {
            System.out.println("HTTP error");
        } catch(Exception e) {
            System.out.println("ERROR IS " + e.getCause());
        }
    }

    private static User decode(String in) {
        //removes { and }
        String noBraces = in.substring(1, in.length()-1);

        //list of json pairs
        String[] json = noBraces.split(",");

        //removes double quotes
        for(int i = 0; i < json.length; i++) json[i] = json[i].replace("\"", "");

        //translate json to map
        LinkedHashMap<String, String> user = new LinkedHashMap<>();
        for(String k : json) user.put(k.substring(0, k.indexOf(":")), k.substring(k.indexOf(":") + 1));

        //print KV pairs
        for(Map.Entry<String, String> entry : user.entrySet()) System.out.format("KEY: %s | VALUE: %s\n", entry.getKey(), entry.getValue());

        //explicit get of values for <K, V> pairs
        try {
            @NotNull String username = user.get("username");
            @NotNull Gender gender = Gender.valueOf(user.get("gender"));
            @NotNull Gender attraction = Gender.valueOf(user.get("attractedTo"));
            @NotNull Location location = Location.valueOf(user.get("location"));
            @NotNull Level interest = Level.valueOf(user.get("interest"));
            @NotNull Integer age = Integer.parseInt(user.get("age"));

            //return the new user
            return new User(username, age, gender, attraction, location, interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid parameter in map");
        }
        return null;
    }
}
