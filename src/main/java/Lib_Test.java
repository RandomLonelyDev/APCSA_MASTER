import Wildfire_java_test.libs.ArraysExtended;
import Wildfire_java_test.libs.StringArray;
public class Lib_Test {
    public static void main(String[] args){
        String[] in2 = {"a","b","c","d","e","f"};
        Integer[] in1 = {1,2,3,4,5,6,7,8,9};
        String in3 = "//{false,true,true}\\\\";
        StringArray arr = new StringArray(in1);
        ArraysExtended.printArray(StringArray.parseBoolean(in3));
    }
}

