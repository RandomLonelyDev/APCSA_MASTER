package personal_tests.alyx;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Word {
    protected Modifier[] modifiers;
    protected String word;
    protected int[] values = {0,0,0};
    public Word(String charRep, int[] vals, Modifier... mods) {
        word = charRep;
        if(vals.length == 3) values = vals; else throw new RuntimeException("incorrect length of value pairs for word " + charRep);
        modifiers = mods;
    }

    public int getHappiness() {
        return values[0];
    }
    public int getAnger() {
        return values[1];
    }
    public int getHorny() {
        return values[2];
    }
    @Override
    public String toString() {
        return word;
    }
}
