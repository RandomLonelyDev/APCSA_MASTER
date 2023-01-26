package APCSA.GameSpinner;

import java.util.*;

public class GameSpinner <T> {
    private int seed = 0, streak = 0;
    private Integer previous = null;
    protected Random rand = new Random(seed);
    protected int sections;
    protected List<T> values;
    public GameSpinner(int sections, List<T> values) throws SpinnerException {
        if(sections <= 0 || values == null || sections != values.size()) throw new SpinnerException("Invalid Argument");
        this.sections = sections;
        this.values = values;
    }

    public GameSpinner(int seed, int sections, List<T> values) throws SpinnerException {
        if(sections <= 0 || values == null || sections != values.size()) throw new SpinnerException("Invalid Argument");
        this.sections = sections;
        this.values = values;
        this.seed = seed;
    }

    public T spin() {
        int numToPick = rand.nextInt(0,sections);
        if(previous != null && numToPick == previous) streak++; else streak = 1;
        previous = numToPick;
        return values.get(numToPick);
    }

    public int currentRun() {return streak;}
}