import libs.MathExtended;
import libs.ArraysExtended;
import libs.StringArray;

public class Lib_Test {
    public static void main(String[] args){
        String[] in2 = {"a","b","c","d","e","f"};
        Integer[] in1 = {1,2,3,4,5,6,7,8};
        byte[] in3 = {1,2,3,4,5,6,7,8};
        boolean[] in4 = {true, true, true, true};
        char[] in5 = {'a','b','c'};
        StringArray array = new StringArray(in1);
        System.out.print(array.getValue());
    }
}

