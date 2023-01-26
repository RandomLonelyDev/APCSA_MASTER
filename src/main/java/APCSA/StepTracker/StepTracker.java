package APCSA.StepTracker;

import java.util.*;

public class StepTracker {
    private final int minSteps;
    private int numDays = 0;
    private int activeDays = 0;
    private ArrayList<Integer> days = new ArrayList<>();

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
    }

    public void addDailySteps(int steps) {
        days.add(steps);
        numDays++;
        if(steps >= minSteps) activeDays++;
    }

    public int activeDays() {
        return activeDays;
    }

    public int averageSteps() {
        int sum = 0;
        for(Integer day : days) {
            sum += day;
        }
        return sum/days.size();
    }
}
