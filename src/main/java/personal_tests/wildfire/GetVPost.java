package personal_tests.wildfire;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GetVPost {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://app.crushconnect.us/posttest.php");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        String params = "pv=balls";
        OutputStreamWriter request = new OutputStreamWriter(connection.getOutputStream());
        request.write(params);
        request.flush();
        request.close();
        StringBuilder resposeBuilder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while((line = reader.readLine()) != null) {
                resposeBuilder.append(line);
            }
        }
        System.out.println(resposeBuilder.toString().replace("<br>","\n"));
        connection.disconnect();
    }
}
