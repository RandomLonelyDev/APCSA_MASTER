package APCSA.ArrayListDemo;

import java.util.*;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("rocky","flame",null,"jetta"));
        names.forEach(System.out::println);
        System.out.println(names.size());
        names.addAll(List.of("bosco","mocha"));
        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println(names.set(2,"coop") + "\n");
        names.set(names.indexOf("bosco"),"spike");
        names.forEach(System.out::println);
        names.add(1, "snoopy");
        names.add(4, "harley");
        System.out.println(names);
        System.out.println();
        System.out.println(names.remove(3));
        System.out.println(names);
    }
}
