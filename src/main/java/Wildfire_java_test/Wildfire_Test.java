package Wildfire_java_test;

import libs.MathExtended;

class Wildfire_Test{
    public static void main(String[] args) {
        user relative = new user("Admin",Gender.MALE,Level.FRIENDS,16);
        relative.setLoc(Location.MW);
        relative.setAttraction(Gender.FEMALE);
        relative.setLtm(Gender.FEMALE);
        user[] data = new user[7];
        for (int i = 13; i < 20; i++) {
            data[i-13] = new user("Person " + (i-13),
                    Gender.values()[MathExtended.randomInt(0,3)],
                    Level.values()[MathExtended.randomInt(0,3)], i);
            data[i-13].setLoc(Location.values()[MathExtended.randomInt(0,5)]);
        }
        display_algorithm_v0_1.getList(data,relative);
    }
}