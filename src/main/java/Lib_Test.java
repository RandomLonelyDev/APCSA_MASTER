import libs.MathExtended;
import libs.ArraysExtended;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lib_Test {
    public static void main(String[] args){
        String[] in2 = {"a","b","c","d","e","f"};
        Integer[] in1 = {1,2,3,4,5,6,7,8};
        byte[] in3 = {1,2,3,4,5,6,7,8};
        boolean[] in4 = {true, true, true, true};
        char[] in5 = {'a','b','c'};
        String[] out = ArraysExtended.inflate(in2,3);
        for(String element : out){
            System.out.println(element);
        }
    }
}

