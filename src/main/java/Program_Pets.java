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
    public static void removeName2(ArrayList<String> in, String name){in.removeIf(c -> c.equals(name));}
    public static void addName(ArrayList<String> in, String name){
        ArrayList<Integer> pPos = new ArrayList<>();
        in.forEach(c -> {if(c.trim().toLowerCase().endsWith("p"))pPos.add(in.indexOf(c));});
        pPos.forEach(c -> in.add(c+1,name));
    }
    public static void setName(ArrayList<String> in){for(int i = 0; i < 3; i++)if(in.get(i).equals("Coop"))in.set(i,"Boscoe");}
}