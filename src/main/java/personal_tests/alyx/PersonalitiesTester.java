package personal_tests.alyx;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import java.io.FileReader;

public class PersonalitiesTester {
    public static void main(String[] args) {
        String toTest = "hi there!! this is a test.";
        Personality personality = new HappyPersonality();
        personality.affect(toTest);
    }
}
