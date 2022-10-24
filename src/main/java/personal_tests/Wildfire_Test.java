package personal_tests;

import java.util.ArrayList;
import java.util.*;
import personal_tests.enums.*;


public class Wildfire_Test {
    public static void main(String[] args) {
        //Test Data
        List<user> serverdata = user.getList(20);
        user relativeto = user.testUser();

        ArrayList<user> sortByLoc = new ArrayList<>();
        ArrayList<user> sortByAge = new ArrayList<>();
        ArrayList<user> sortByGender = new ArrayList<>();
        ArrayList<user> sortByIntrest = new ArrayList<>();
        Map<user,Double> posCoefficients = new HashMap<>();

        //The Algorithm
        for (user serverdatum : serverdata) { //sort by location.  prioritizes those in same region.
            if (serverdatum.getLoc() == relativeto.getLoc()) {
                sortByLoc.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //second if us, add those in close regions if ITL do nothing
            if (relativeto.getLoc() != Location.ITL && (Math.abs(relativeto.getLoc().ordinal()-serverdatum.getLoc().ordinal()) == 1) && serverdatum.getLoc() != Location.ITL) {
                sortByLoc.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //third if us, add those in further regions if ITL do nothing
            if(relativeto.getLoc() != Location.ITL && (Math.abs(relativeto.getLoc().ordinal()-serverdatum.getLoc().ordinal()) > 1) && serverdatum.getLoc() != Location.ITL){
                sortByLoc.add(serverdatum);
            }
        }
        for(user serverdatum : serverdata){ //fourth if us, add international people
            if(relativeto.getLoc() != Location.ITL && serverdatum.getLoc() == Location.ITL){
                sortByLoc.add(serverdatum);
            }
        }
        for(user surverdatum : serverdata){ //finally, if ITL, add those in us
            if(relativeto.getLoc() == Location.ITL && surverdatum.getLoc() != Location.ITL){
                sortByLoc.add(surverdatum);
            }
        }


        for (user serverdatum : serverdata) { //sort by age.  prioritizes ppl in 2 yrs relation to a user
            if(serverdatum.getAge() == relativeto.getAge()){
                sortByAge.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //second add those within 1 yr
            if (Math.abs(relativeto.getAge()-serverdatum.getAge()) == 1 ) {
                sortByAge.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //third add all others
            if (Math.abs(relativeto.getAge()-serverdatum.getAge()) > 1) {
                sortByAge.add(serverdatum);
            }
        }


        for (user serverdatum : serverdata) { //sort by gender.  prioritizes those that match a user's preference or attraction
            if ((serverdatum.getGender() == relativeto.getAttraction()) || (serverdatum.getGender() == relativeto.getLtm())) {
                sortByGender.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //second add all others
            if ((serverdatum.getGender() != relativeto.getAttraction()) && (serverdatum.getGender() != relativeto.getLtm())) {
                sortByGender.add(serverdatum);
            }
        }


        for (user serverdatum : serverdata) { //sort by relationship lvl.  prioritizes those with the same intrest lvl
            if(serverdatum.getLvl() == relativeto.getLvl()){
                sortByIntrest.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //second add those with the next lower relationship lvl (lvl 2 and 3 only)
            if((serverdatum.getLvl().ordinal()+1 == relativeto.getLvl().ordinal()) && relativeto.getLvl() != Level.FRIENDS){
                sortByIntrest.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //finally add all others
            if((serverdatum.getLvl() != relativeto.getLvl()) && (serverdatum.getLvl().ordinal()+1 != relativeto.getLvl().ordinal() && relativeto.getLvl() != Level.FRIENDS)){
                sortByIntrest.add(serverdatum);
            } else if(serverdatum.getLvl() != relativeto.getLvl() && relativeto.getLvl() == Level.FRIENDS){
                sortByIntrest.add(serverdatum);
            }
        }
/*
^
ALL DIS SHIT GOOD.  IT WORKS
ERROR PROLLY HERE????
v
*/

        //For mults of index: n>1 = higher pref | 0<n<1 = lower pref | n<0 = inverted pref | n == 0 = ignored pref
        for (user serverdatum : serverdata) {
            double avg = 0;
            avg += sortByLoc.indexOf(serverdatum)*2;
            avg += sortByGender.indexOf(serverdatum)*2;
            avg += sortByAge.indexOf(serverdatum);
            avg += sortByIntrest.indexOf(serverdatum);
            avg /= 4;
            posCoefficients.put(serverdatum,avg);
        }
/*
DIS SHIT GOOD.  IT WORKS
v
*/

        System.out.println("\n");
        List<Map.Entry<user,Double>> sortedUsers = new LinkedList<>(posCoefficients.entrySet());
        sortedUsers.sort(Map.Entry.comparingByValue());
        HashMap<user,Double> sortedPosCoefficients = new LinkedHashMap<>();
        for(Map.Entry<user,Double> element : sortedUsers){
            sortedPosCoefficients.put(element.getKey(), element.getValue());
        }
        List<user> out = new ArrayList<>();
        for(Map.Entry<user,Double> element : sortedPosCoefficients.entrySet()){
            System.out.format("%s, Pos: %s, Age: %s, Loc: %s, Gender: %s, Level: %s\n", element.getKey().getName(),element.getValue(),element.getKey().getAge(),element.getKey().getLoc(),element.getKey().getGender(),element.getKey().getLvl());
            out.add(element.getKey());
        }
    }
}