package Wildfire_java_test;

import libs.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


class Wildfire_Test {
    public static void main(String[] args) throws IOException {
        int hRC = 0;
        String php = "http://192.168.56.102/jsonpost.php";
        String type = "5";
        String toadd = ""/*user.userToJson(user.testUser())*/;
        String urlstring = toadd.equals("") ? String.format("%s?id=%s",php,type) : String.format("%s?id=%s&json=%s", php, type, toadd);
        try {
            URL url = new URL(urlstring);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            hRC = connection.getResponseCode();
            if (hRC == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                in.close();
                String out = htmlNewLineParse(String.valueOf(response)).substring(htmlNewLineParse(String.valueOf(response)).indexOf("\n")+1);
                System.out.println(out);
                System.out.println("\n");
                user.jsonToUser(out);
            } else {
                System.out.format("Connection Error.  Http Code: %d\n", hRC);
            }
        } catch (IOException e) {
            System.out.format("Connection Error.  %s\nHttp Code : %d\n", e.getClass(), hRC);
        }
    }

    public static String htmlNewLineParse(String in) {
        return in.replace("<br>", "\n");
    }
}
