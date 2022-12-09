package personal_tests.wildfire;

import personal_tests.libs.ArraysExtended;
import personal_tests.libs.MathExtended;
import personal_tests.wildfire.enums.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.*;

public class Wildfire_Test {
    public static List<user> getList(List<user> serverdata, user relativeto){
        Map<user,Integer[]> preSort = new LinkedHashMap<>();
        Map<user,Double> posCoefficients = new HashMap<>();

        for (user element: serverdata) {
            preSort.put(element,new Integer[4]);
        }

        //The Algorithm v2.0
        for (user serverdatum : preSort.keySet()) { //sort by location.  prioritizes those in same region.
            if (serverdatum.getLoc() == relativeto.getLoc()) preSort.get(serverdatum)[0] = 0;
        }
        for (user serverdatum : preSort.keySet()) { //second if us, add those in close regions if ITL do nothing
            if (relativeto.getLoc() != Location.ITL && (Math.abs(relativeto.getLoc().ordinal()-serverdatum.getLoc().ordinal()) == 1) && serverdatum.getLoc() != Location.ITL) {
                preSort.get(serverdatum)[0] = 1;
            }
        }
        for (user serverdatum : preSort.keySet()) { //third if in the us, add those in further regions if ITL do nothing
            if(relativeto.getLoc() != Location.ITL && (Math.abs(relativeto.getLoc().ordinal()-serverdatum.getLoc().ordinal()) > 1) && serverdatum.getLoc() != Location.ITL){
                preSort.get(serverdatum)[0] = 2;
            }
        }
        for(user serverdatum : preSort.keySet()){ //fourth if us, add international people
            if(relativeto.getLoc() != Location.ITL && serverdatum.getLoc() == Location.ITL){
                preSort.get(serverdatum)[0] = 3;
            }
        }
        for(user serverdatum : preSort.keySet()){ //finally, if ITL, add those in us
            if(relativeto.getLoc() == Location.ITL && serverdatum.getLoc() != Location.ITL){
                preSort.get(serverdatum)[0] = 1;
            }
        }


        for (user serverdatum : preSort.keySet()) { //sort by age.  prioritizes ppl in 2 yrs relation to a user
            if(serverdatum.getAge() == relativeto.getAge()){
                preSort.get(serverdatum)[1] = 0;
            }
        }
        for (user serverdatum : preSort.keySet()) { //second add those within 1 yr
            if (Math.abs(relativeto.getAge()-serverdatum.getAge()) <= 2 ) {
                preSort.get(serverdatum)[1] = 1;
            }
        }
        for (user serverdatum : preSort.keySet()) { //third add all others
            if (Math.abs(relativeto.getAge()-serverdatum.getAge()) > 2) {
                preSort.get(serverdatum)[1] = 2;
            }
        }


        for (user serverdatum : preSort.keySet()) { //sort by gender.  prioritizes those that match a user's preference or attraction
            if ((serverdatum.getGender() == relativeto.getAttraction()) || (serverdatum.getGender() == relativeto.getLtm())) {
                preSort.get(serverdatum)[2] = 0;
            }
        }
        for (user serverdatum : preSort.keySet()) { //second add all others
            if ((serverdatum.getGender() != relativeto.getAttraction()) && (serverdatum.getGender() != relativeto.getLtm())) {
                preSort.get(serverdatum)[2] = 1;
            }
        }


        for (user serverdatum : preSort.keySet()) { //sort by relationship lvl.  prioritizes those with the same interest lvl
            if(serverdatum.getLvl() == relativeto.getLvl()){
                preSort.get(serverdatum)[3] = 0;
            }
        }
        for (user serverdatum : preSort.keySet()) { //second add those with the next lower relationship lvl (lvl 2 and 3 only)
            if((serverdatum.getLvl().ordinal()+1 == relativeto.getLvl().ordinal()) && relativeto.getLvl() != Level.FRIENDS){
                preSort.get(serverdatum)[3] = 1;
            }
        }
        for (user serverdatum : preSort.keySet()) { //finally add all others
            if((serverdatum.getLvl() != relativeto.getLvl()) && (serverdatum.getLvl().ordinal()+1 != relativeto.getLvl().ordinal() && relativeto.getLvl() != Level.FRIENDS)){
                preSort.get(serverdatum)[3] = 2;
            } else if(serverdatum.getLvl() != relativeto.getLvl() && relativeto.getLvl() == Level.FRIENDS){
                preSort.get(serverdatum)[3] = 1;
            }
        }


        //For mults of index: n > 1 = higher pref | 0 < n < 1 = lower pref | n < 0 = inverted pref | n == 0 = ignored pref
        for (user serverdatum : preSort.keySet()) {
            posCoefficients.put(serverdatum,avgOf(preSort.get(serverdatum)));
        }
        System.out.println("\n\n\n");
        List<Map.Entry<user,Double>> sortedUsers = new LinkedList<>(posCoefficients.entrySet());
        sortedUsers.sort(Map.Entry.comparingByValue());
        HashMap<user,Double> sortedPosCoefficients = new LinkedHashMap<>();
        for(Map.Entry<user,Double> element : sortedUsers){
            sortedPosCoefficients.put(element.getKey(), element.getValue());
        }
        List<user> out = new ArrayList<>();
        for(Map.Entry<user,Double> element : sortedPosCoefficients.entrySet()){
            System.out.println(element.getKey().getName() + " " + element.getValue() + " " + arrayToString(preSort.get(element.getKey())));
            out.add(element.getKey());
        }
        return out;
    }

    private static double avgOf(Integer[] arr){
        double out = 0;
        for(Integer num : arr) out += num;
        return out/arr.length;
    }

    private static String arrayToString(Integer[] arr){
        StringBuilder bob = new StringBuilder("vals: [");
        for(Integer element : arr) bob.append(String.format("%s, ",element));
        return bob.substring(0, bob.length()-2) + "]";
    }

    public static void main(String[] args) {
        ArrayList<user> input = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            user toAdd = new user("TEST USER " + i, Gender.values()[MathExtended.randomInt(0,3)], Level.values()[MathExtended.randomInt(0,3)],MathExtended.randomInt(13,20));
            toAdd.setLoc(Location.values()[MathExtended.randomInt(0,5)]);
            input.add(toAdd);
        }
        user me = new user("ADMIN", Gender.MALE, Level.LONG_TERM, 16);
        getList(input,me);
    }
}