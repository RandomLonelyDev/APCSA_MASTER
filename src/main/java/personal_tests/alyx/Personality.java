package personal_tests.alyx;

import java.util.LinkedHashMap;

public abstract class Personality {
    protected Personality(){}
    protected double happiness,anger,saddness;
    protected LinkedHashMap<String, Double> hKeywords,aKeywords,sKeywords;
    protected abstract void makesHappy(String in);
    protected abstract void makesSad(String in);
    protected abstract void makesAngry(String in);
    public void affect(String in) {
        String inn = in.toLowerCase();
        makesHappy(inn);
        makesSad(inn);
        makesAngry(inn);
    }
}
