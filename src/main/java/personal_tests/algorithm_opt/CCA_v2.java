package personal_tests.algorithm_opt;

import personal_tests.wildfire.User;
import personal_tests.wildfire.enums.*;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 * Ways to improve accuracy:
 *  More factors: astrology, ...
 *  Better logic: (TODOS) ✓, ✓, ✓, ?
 *  ...
 **/
public class CCA_v2 {
    public static void main(String[] args) {
        final int users = 100;

        //us
        User us = new User("Tester", 16, Gender.MALE, Gender.FEMALE, Location.MIDWEST, Level.LONGTERM);

        //init data
        ArrayList<User> data = new ArrayList<>();
        for(int i = 0; i < users; i++) data.add(new User(String.format("User %d", i)));

        //start timer;
        long now = Date.from(Instant.now()).getTime();

        //init maps
        LinkedHashMap<User, Double[]> userRatings = new LinkedHashMap<>();
        LinkedHashMap<User, Double> userAverages = new LinkedHashMap<>();
        data.forEach(c -> userRatings.put(c, new Double[4]));

        //sort data
        for(Map.Entry<User, Double[]> userData : userRatings.entrySet()) {
            User user = userData.getKey();
            Double[] vals = userData.getValue();

            //gender (puts those you would be attracted to first) TODO: ¯\_(ツ)_/¯
            if(user.gender == us.attraction && us.gender == user.attraction) vals[0] = 10D;
            else if(user.gender == us.attraction) vals[0] = 8.5D;
            else vals[0] = 0D;

            //age (puts those closer to your age higher)  TODO: ¯\_(ツ)_/¯
            if(user.age == us.age) vals[1] = 10D;
            else if(user.age < us.age) vals[1] = 10D - map(13, us.age, 0, 10, user.age);
            else vals[1] = 10D - map(us.age, 19, 0, 10, user.age); //greater than

            //interest (puts those with a similar interest level, then those within one level, then eveyone else) TODO: ¯\_(ツ)_/¯
            if(user.interest == us.interest) vals[2] = 10D;
            else if(Math.abs(us.interest.ordinal() - user.interest.ordinal()) == 1) vals[2] = 5D;
            else vals[2] = 0D;

            //location (arbitrarily pulls value based on region config) TODO: Potentialy adjust values
            vals[3] = Region.getRegion(us.location).getValue(user.location);



            //translate data to new map with avg pos denoted
            userAverages.put(user, avgOf(vals));
        }

        //sort data based on averages
        List<Map.Entry<User, Double>> sortableList = new LinkedList<>(userAverages.entrySet());
        sortableList.sort((v1, v2) -> v2.getValue().compareTo(v1.getValue()));

        //end timer
        now = Date.from(Instant.now()).getTime() - now;

        //output
        System.out.println(us);
        System.out.println("\n");
        for(int i = 0; i < sortableList.size(); i++) {
            System.out.println(String.format("%d) %s | Val: %.3f\n", i+1, sortableList.get(i).getKey(), sortableList.get(i).getValue()));
        }
        System.out.println("\nFinished in " + now + "mSec");
    }

    private static double avgOf(Number[] nums) {
        double total = 0;
        for (Number num : nums) total += num.doubleValue();
        return total/nums.length;
    }

    private static double map(double startMin, double startMax, double endMin, double endMax, double val) {
        return (val - startMin) * (endMax - endMin) / (startMax - startMin) + endMin;
    }
}
