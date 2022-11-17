import java.util.*;
public class Program_Pets {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Rocky","Flame","Coop","Jetta","Mocha"));
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
    public static void removeName1(ArrayList<String> in){in.removeIf(c -> c.trim().toLowerCase().charAt(0) == 'r');}
    public static void removeName2(ArrayList<String> in, String name){in.removeIf(c -> c.equals(name));}
    public static void addName(ArrayList<String> in, String name){
        ArrayList<Integer> pPos = new ArrayList<>();
        in.forEach(c -> {if(c.trim().toLowerCase().charAt(c.length()-1) == 'p')pPos.add(in.indexOf(c));});
        pPos.forEach(c -> in.add(c+1,name));
    }
    public static void setName(ArrayList<String> in){if(in.lastIndexOf("Coop") <= 2) in.set(in.lastIndexOf("Coop"),"Boscoe");}
}