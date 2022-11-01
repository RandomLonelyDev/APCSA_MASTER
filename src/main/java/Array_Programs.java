import java.util.Random;
import java.util.Scanner;

public class Array_Programs {
    static int[] intArray = randomArray(10,11);
    /*public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            sum += intArray[i];
        }
        printArray(intArray);
        System.out.format("Sum: %d, Average: %d", sum, sum/intArray.length);
    }*/
    /*public static void main(String[] args) {
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            max = intArray[i] > max ? intArray[i] : max;
        }
        printArray(intArray);
        System.out.format("Max: %d",max);
    }*/
    /*public static void main(String[] args) {
        int min = intArray[0];
        for (int val: intArray) {
            min = val < min ? val : min;
        }
        printArray(intArray);
        System.out.format("Min: %d",min);
    }*/
    /*public static void main(String[] args) {
        int oddSum = 0, evenSum = 0;
        for(int i = 0; i < intArray.length; i++){
            oddSum += intArray[i]%2 == 1 ? intArray[i] : 0;
            evenSum += intArray[i]%2 == 0 ? intArray[i] : 0;
        }
        printArray(intArray);
        System.out.format("Even Sum: %d, Odd Sum: %d",evenSum,oddSum);
    }*/
    /*public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        System.out.print("What length is the array? ");
        int[] ints = new int[scanline.nextInt()];
        for (int i = 0; i < ints.length; i++) {
            System.out.print("enter an integer: ");
            ints[i] = scanline.nextInt();
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.format("array[ %d ] = %d\n",i,ints[i]);
        }
    }*/

    public static int[] randomArray(int length, int maxExclusive){
        int[] out = new int[length];
        for(int i = 0; i < length; i++){
            out[i] = new Random().ints(0,maxExclusive).findFirst().getAsInt();
        }
        return out;
    }

    public static void printArray(int[] in){
        StringBuilder bobTheBuilder = new StringBuilder();
        for(int num : in){
            bobTheBuilder.append(String.format("%d, ", num));
        }
        System.out.format("[%s]\n", bobTheBuilder.substring(0,bobTheBuilder.length()-2));
    }
}
