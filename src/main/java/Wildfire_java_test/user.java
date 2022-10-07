package Wildfire_java_test;

import libs.MathExtended;

import java.util.*;

public class user {
    private String name = "Test";
    private String accoutdescrpition = "AllUsernamesAreUnique";
    private Gender gender;
    private Gender ltm = Gender.ALL;
    private Gender attraction = Gender.ALL;
    private Level lvl;
    private int pfp = 0;
    private ArrayList<String> friends = new ArrayList<>(Arrays.asList("Person 1","Person 2"));
    private int age;
    private Location loc;

    public String getName(){return name;}
    public String getDescrpition(){return accoutdescrpition;}
    public Gender getGender(){return gender;}
    public Gender getLtm(){return ltm;}
    public Gender getAttraction(){return attraction;}
    public Level getLvl(){return lvl;}
    public int getPfp(){return pfp;}
    public ArrayList<String> getFriends(){return friends;}
    public int getAge(){return age;}
    public Location getLoc(){return loc;}

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.accoutdescrpition = description;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void setLtm(Gender ltm){
        this.ltm = ltm;
    }
    public void setAttraction(Gender attraction){
        this.attraction = attraction;
    }
    public void setLvl(Level lvl){
        this.lvl = lvl;
    }
    public void setPfp(int pfp){
        this.pfp = pfp;
    }
    public void setFriends(ArrayList<String> friends){
        this.friends = friends;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setLoc(Location loc){this.loc = loc;}

    public user(String name, Gender gender, Level lvl, int age){
        this.name = name;
        this.gender = gender;
        this.lvl = lvl;
        this.age = age;
    }

    public static List<user> getList(int howMany){
        List out = new ArrayList<user>();
        for (int i = 0; i < howMany; i++) {
            out.add(new user(String.format("Test User %d",i+1),Gender.values()[MathExtended.randomInt(0,3)],Level.values()[MathExtended.randomInt(0,3)],MathExtended.randomInt(13,20)));
        }
        return out;
    }
}