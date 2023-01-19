package personal_tests.alyx;

import org.minidns.record.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class HappyPersonality extends Personality {
    public HappyPersonality() {
        hKeywords = new LinkedHashMap<>(){{
            put("hi",1D);
            put("hi there", 1.2D);
            put("good morning", 1.1D);
        }};
        sKeywords = new LinkedHashMap<>(){{
            put("bye", 1.1D);
            put("good bye", 1D);
            put("good night", 0.8);
        }};
        aKeywords = new LinkedHashMap<>(){{

        }};
    }
    @Override
    protected void makesHappy(String in) {

    }

    @Override
    protected void makesSad(String in) {

    }

    @Override
    protected void makesAngry(String in) {

    }

    @Override
    public void affect(String in) {
        super.affect(in);
        //do checks
    }
}
