package personal_tests.wildfire;

import org.jetbrains.annotations.NotNull;
import personal_tests.wildfire.enums.*;
import personal_tests.libs.*;
import java.util.*;

public class User {
    public Gender gender, attraction;
    public int age;
    public Location location;
    public Level interest;
    public String username;
    public static String userToJson(User in) {
        return String.format("{\"username\":\"%s\",\"gender\":\"%s\",\"age\":\"%s\",\"location\":\"%s\",\"attractedTo\":\"%s\",\"interest\":\"%s\"}", in.username, in.gender, in.age, in.location, in.attraction, in.interest);
    }

    public User(@NotNull String username) {
        this.username = username;
        gender = Gender.values()[MathExtended.randomInt(0,3)];
        attraction = Gender.values()[MathExtended.randomInt(0,3)];
        age = MathExtended.randomInt(13,20);
        location = Location.values()[MathExtended.randomInt(0,5)];
        interest = Level.values()[MathExtended.randomInt(0,3)];
    }

    public User(@NotNull String username, @NotNull Integer age,  @NotNull Gender gender, @NotNull Gender attraction, @NotNull Location location, @NotNull Level interest) {
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.attraction = attraction;
        this.location = location;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return String.format("Username: %s | Age: %s\n" +
                "Gender: %s | Attraction: %s\n" +
                "Location: %s | Interest Level: %s", username, age, gender, attraction, location, interest);
    }
}
