package APCSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;
public class Program_Stars {
    /*public static void main(String[] args) {
        int[] in = {1,2,3,4,5,6,7,8,9,10};
        for (int element : in) {
            AtomicReference<String> out = new AtomicReference<>("");
            IntStream.range(0,element).forEach(i -> out.updateAndGet(v -> v + '*'));
            System.out.println(out.get());
        }
    }*/
    /*public static void main(String[] args) {
        int[] in = {10,9,8,7,6,5,4,3,2,1};
        for (int element : in) {
            AtomicReference<String> out = new AtomicReference<>("");
            IntStream.range(0,element).forEach(i -> out.updateAndGet(v -> v + '*'));
            System.out.println(out.get());
        }
    }*/
    /*public static void main(String[] args) {
        int[] in = {9,8,7,6,5,4,3,2,1,0};
        for(int element : in){
            AtomicReference<String> out = new AtomicReference<>("");
            IntStream.range(0, element).forEach(i -> out.updateAndGet(v -> v + ' '));
            IntStream.range(0,in.length-element).forEach(i -> out.updateAndGet(v -> v + '*'));
            System.out.println(out.get());
        }
    }*/
    /*public static void main(String[] args) {
        int[] in = {0,1,2,3,4,5,6,7,8,9};
        for(int element : in){
            AtomicReference<String> out = new AtomicReference<>("");
            IntStream.range(0, element).forEach(i -> out.updateAndGet(v -> v + ' '));
            IntStream.range(0,in.length-element).forEach(i -> out.updateAndGet(v -> v + '*'));
            System.out.println(out.get());
        }
    }*/
    public static void main(String[] args) {
        int[] in = {1,3,5,7,9,9,7,5,3,1};
        for(int element : in){
            AtomicReference<String> out = new AtomicReference<>("");
            IntStream.range(0, (in.length/2)-(int)Math.round(element/2.0)).forEach(i -> out.updateAndGet(v -> v + ' '));
            IntStream.range(0, element).forEach(i -> out.updateAndGet(v -> v + '*'));
            System.out.println(out.get());
        }
    }
}
