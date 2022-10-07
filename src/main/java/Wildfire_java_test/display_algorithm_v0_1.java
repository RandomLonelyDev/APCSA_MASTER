package Wildfire_java_test;

import libs.*;
import java.util.ArrayList;

public class display_algorithm_v0_1 {
    public static void getList(Wildfire_java_test.user[] serverdata, user relativeto){
        ArrayList<user> sortByLoc = new ArrayList<user>();
        ArrayList<user> sortByAge = new ArrayList<user>();
        ArrayList<user> sortByGender = new ArrayList<user>();
        ArrayList<user> sortByIntrest = new ArrayList<user>();
        //user[] out = new user[serverdata.length+1];
        boolean isAdded = false;

        //The Algorithm
        for (user serverdatum : serverdata) { //sort by location.  prioritizes those in same region.
            if (serverdatum.getLoc() == relativeto.getLoc()) {
                sortByLoc.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //second add those in surrounding regions (US ONLY)
            if((serverdatum.getLoc() != Location.ITL && relativeto.getLoc() != Location.ITL) && ((serverdatum.getLoc().ordinal()-1 == relativeto.getLoc().ordinal()) || (serverdatum.getLoc().ordinal()+1 == relativeto.getLoc().ordinal()))){
                sortByLoc.add(serverdatum);
            }
        }
        for(user serverdatum : serverdata) { //finally IF not international, add international users.  IF international, add all us users //TODO:FIX  //STATUS: NON FUNCTIONAL
            if(relativeto.getLoc() != Location.ITL && serverdatum.getLoc() == Location.ITL){
                sortByLoc.add(serverdatum);
            } else if(relativeto.getLoc() == Location.ITL && serverdatum.getLoc() != Location.ITL){
                sortByAge.add(serverdatum);
            }
        }


        for (user serverdatum : serverdata) { //sort by age.  prioritizes ppl in 2 yrs or younger from a user //TODO:IMPROVE  //STATUS: FUNCTIONAL
            if ((relativeto.getAge() - serverdatum.getAge() <= 2) && (relativeto.getAge() - serverdatum.getAge() >= -2)) {
                sortByAge.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //second add all others
            if ((relativeto.getAge() - serverdatum.getAge() >= 2) || (relativeto.getAge() - serverdatum.getAge() <= -2)) {
                sortByAge.add(serverdatum);
            }
        }


        for (user serverdatum : serverdata) { //sort by gender.  prioritizes those that match a user's preference or attraction //TODO: NOTHING  //STATUS: FULLY FUNCTIONAL
            if ((serverdatum.getGender() == relativeto.getAttraction()) || (serverdatum.getGender() == relativeto.getLtm())) {
                sortByGender.add(serverdatum);
            }
        }
        for (user serverdatum : serverdata) { //second add all others
            if ((serverdatum.getGender() != relativeto.getAttraction()) && (serverdatum.getGender() != relativeto.getLtm())) {
                sortByGender.add(serverdatum);
            }
        }


        for (user serverdatum : serverdata) { //sort by relationship lvl.  prioritizes those with the same intrest lvl //TODO: NOTHING  //STATUS: FULLY FUNCTIONAL
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
        ArraysExtended.printArray(serverdata);
        System.out.println("\n");
        Level[] out = new Level[sortByIntrest.size()];
        for(int i = 0; i < sortByIntrest.size(); i++){
            out[i] = sortByIntrest.get(i).getLvl();
        }
        ArraysExtended.printArray(out);
    }
}
