import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class Program_AL_Farm {
    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<>(Arrays.asList("pig","cat","sheep","chicken","dog","horse","cow","goat","rat","duck"));
        System.out.println("Method 1: " + filterByLength(animalList,3));
        System.out.println("Method 2: " + filterbyStartingString(animalList,"c"));
        System.out.println("Method 3: " + hasConsecutiveVowels(animalList));
        System.out.println("Method 4: " + removeByMinLength(animalList,5));
        replaceByEnd(animalList,"at","mouse");
    }
    public static int filterByLength(ArrayList<String> list, int length){
        AtomicInteger count = new AtomicInteger();
        list.forEach(c -> {if(c.length() == length) count.getAndIncrement();});
        return count.get();
    }
    public static int filterbyStartingString(ArrayList<String> list, String start){
       AtomicInteger count = new AtomicInteger();
       list.forEach(c -> {if(c.startsWith(start))count.getAndIncrement();});
       return count.get();
    }
    public static int hasConsecutiveVowels(ArrayList<String> in){
        AtomicInteger count = new AtomicInteger();
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        in.forEach(c -> {for (int i = 0; i < c.length()-1; i++) if(vowels.contains(c.toLowerCase().charAt(i)) && vowels.contains(c.toLowerCase().charAt(i+1)))count.getAndIncrement();});
        return count.get();
    }
    public static int removeByMinLength(ArrayList<String> in, int length){
        AtomicInteger count = new AtomicInteger();
        in.forEach(c -> {if(c.trim().length() >= length){count.getAndIncrement();}});
        in.removeIf(f -> f.length() >= length);
        System.out.println("Method 4 New List: " + in);
        return count.get();
    }
    public static void replaceByEnd(ArrayList<String> in, String end, String replacement){
        for(int i = 0; i < in.size(); i++)if(in.get(i).endsWith(end))in.set(i,replacement);
        System.out.println("Method 5 New List: " + in);
    }
}