package APCSA.Abstractpets;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Garfield");
        System.out.println(cat1.getName() + " says " + cat1.speak());

        Dog dog1 = new Dog("Rocky");
        System.out.println(dog1.getName() + " says " + dog1.speak());

        LoudDog ldog1 = new LoudDog("Spike");
        System.out.println(ldog1.getName() + " says " + ldog1.speak());

        Kennel<Pet> petList = new Kennel<>(new ArrayList<>(Arrays.asList(cat1, dog1, ldog1)));

        System.out.println();

        petList.allSpeak();
    }
}
