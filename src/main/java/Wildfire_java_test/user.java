package Wildfire_java_test;

import Wildfire_java_test.enums.*;
import Wildfire_java_test.libs.*;
import java.util.*;

public class user {
    private String name;
    private String accoutdescrpition = "AllUsernamesAreUnique";
    private Gender gender;
    private Gender ltm = Gender.ALL;
    private Gender attraction = Gender.ALL;
    private Level lvl;
    private int pfp = 0;
    private ArrayList<String> friends = new ArrayList<>(Arrays.asList("Person 1","Person 2"));
    private int age;
    private Location loc = Location.ITL;

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
    } //
    public void setDescription(String description){
        this.accoutdescrpition = description;
    } //
    public void setGender(Gender gender){
        this.gender = gender;
    } //
    public void setLtm(Gender ltm){
        this.ltm = ltm;
    } //
    public void setAttraction(Gender attraction){
        this.attraction = attraction;
    } //
    public void setLvl(Level lvl){
        this.lvl = lvl;
    } //
    public void setPfp(int pfp){
        this.pfp = pfp;
    } //
    public void setFriends(ArrayList<String> friends){
        this.friends = friends;
    }
    public void setAge(int age){
        this.age = age;
    } //
    public void setLoc(Location loc){this.loc = loc;} //

    public user(String name, Gender gender, Level lvl, int age){
        this.name = name;
        this.gender = gender;
        this.lvl = lvl;
        this.age = age;
    }

    public static user testUser(){
        user out = new user("INTERNALTESTS",Gender.MALE,Level.FRIENDS,16);
        out.setLoc(Location.MW);
        out.setLtm(Gender.FEMALE);
        out.setAttraction(Gender.FEMALE);
        return out;
    }

    public static List<user> getList(int howMany){
        List out = new ArrayList<user>();
        for (int i = 0; i < howMany; i++) {
            user toAdd = new user("Test User " + (i+1),Gender.values()[MathExtended.randomInt(0,3)],Level.values()[MathExtended.randomInt(0,3)],MathExtended.randomInt(13,20));
            toAdd.setLoc(Location.values()[MathExtended.randomInt(0,5)]);
            out.add(toAdd);
        }
        return out;
    }
    public static String userToJson(user in){
        return String.format("{\"username\":\"%s\",\"accountdescription\":\"%s\",\"gender\":\"%s\",\"age\":%s,\"location\":\"%s\",\"ltm\":\"%s\",\"attractedTo\":\"%s\",\"rLvl\":\"%s\",\"pfpCode\":%s}",in.name,in.accoutdescrpition,in.gender,in.age,in.loc,in.ltm,in.attraction,in.lvl,in.pfp);
    }
    public static user jsonToUser(String json){
        String[] params = json.substring(1,json.length()-1).split(",");
        Map<String,String> collatedParams = new LinkedHashMap<>();
        for(String element : params){
            System.out.println(element);
            collatedParams.put(element.substring(1,element.indexOf(":")-1),element.substring(element.indexOf(":")+1).contains("\"")?element.substring(element.indexOf(":")+1).replace("\"",""):element.substring(element.indexOf(":")+1));
        }
        user out = new user(collatedParams.get("username"),Gender.valueOf(collatedParams.get("gender")),Level.valueOf(collatedParams.get("rLvl")), Integer.parseInt(collatedParams.get("age")));
        out.setLoc(Location.valueOf(collatedParams.get("location")));
        out.setLtm(Gender.valueOf(collatedParams.get("ltm")));
        out.setAttraction(Gender.valueOf(collatedParams.get("attractedTo")));
        out.setDescription(collatedParams.get("accountdescription"));
        out.setPfp(Integer.parseInt(collatedParams.get("pfpCode")));
        return out;
    }
}
