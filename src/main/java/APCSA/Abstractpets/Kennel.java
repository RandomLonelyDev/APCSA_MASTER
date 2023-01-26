package APCSA.Abstractpets;

import java.util.ArrayList;

public class Kennel<P extends Pet> {
    private ArrayList<P> pets;
    public Kennel(ArrayList<P> pets) {
        this.pets = pets;
    }

    public void addPet(P pet) {
        pets.add(pet);
    }

    public void removePet(P pet) {
        pets.remove(pet);
    }

    public void allSpeak() {
        pets.forEach(e -> System.out.println(e.getName() + " " + e.speak()));
    }
}
