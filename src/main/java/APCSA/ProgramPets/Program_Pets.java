package APCSA;

import java.util.*;
public class Program_Pets {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Rocky","Flame","Coop","Jetta","Mocha"));
        System.out.println(names);
        removeName1(names);
        System.out.println(names);
        removeName2(names,"jetta");
        names.forEach(System.out::println);
        addName(names,"Spike");
        names.forEach(c -> System.out.format("%s ",c));
        setName(names);
        System.out.print("\n" + names);
    }
    public static void removeName1(ArrayList<String> in){in.removeIf(c -> c.trim().toLowerCase().startsWith("r"));}
    public static void removeName2(ArrayList<String> in, String name){in.removeIf(c -> c.trim().equalsIgnoreCase(name.trim()));}
    public static void addName(ArrayList<String> in, String name){for(int i = 0; i < in.size(); i++)if(in.get(i).trim().toLowerCase().endsWith("p"))in.add(i+1,name);}
    public static void setName(ArrayList<String> in){for(int i = 0; i < 3; i++)if(in.get(i).equals("Coop"))in.set(i,"Boscoe");}
}