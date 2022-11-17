package personal_tests.wildfire;

import personal_tests.libs.ArraysExtended;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;

public class Wildfire_Test {
    /*public static void main(String[] args) {
        String php = "http://192.168.56.102/requestuserdata.php";
        int type = 50;
        String urlstring = String.format("%s?pos=%s", php, type);
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
                String[] usersdata = response.toString().split("<br>");
                ArraysExtended.printArray(usersdata);

            } else {
                System.out.print("\nHTTTP CONN ERROR\n");
            }
        } catch (IOException e) {
            System.out.print("\nIOError\n");
        }
    }*/

    public static void main(String[] args) {
        int[] values = {17,34,56,2,19,100};
        for (int value: values) {
            value = 10;
        }
        ArraysExtended.printArray(values);
    }
}