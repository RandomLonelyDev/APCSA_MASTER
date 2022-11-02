import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Programs {
    /*public static void main(String[] args) { //Pgrm 1
        int[] intArray = randomArray(10,11);
        double sum = 0;
        for(int i = 0; i < intArray.length; i++){
            sum += intArray[i];
        }
        printArray(intArray);
        System.out.format("Sum: %d, Average: %.1f", (int)sum, sum/intArray.length);
    }*/
    /*public static void main(String[] args) { //Pgrm 2
        int[] intArray = randomArray(10,11);
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            max = intArray[i] > max ? intArray[i] : max;
        }
        printArray(intArray);
        System.out.format("Max: %d",max);
    }*/
    /*public static void main(String[] args) { //Pgrm 3
        int[] intArray = randomArray(10,11);
        int min = intArray[0];
        for (int val: intArray) {
            min = val < min ? val : min;
        }
        printArray(intArray);
        System.out.format("Min: %d",min);
    }*/
    /*public static void main(String[] args) { //Pgrm 4
        int[] intArray = randomArray(10,11);
        int oddSum = 0, evenSum = 0;
        for(int i = 0; i < intArray.length; i++){
            oddSum += intArray[i]%2 == 1 ? intArray[i] : 0;
            evenSum += intArray[i]%2 == 0 ? intArray[i] : 0;
        }
        printArray(intArray);
        System.out.format("Even Sum: %d, Odd Sum: %d",evenSum,oddSum);
    }*/
    /*public static void main(String[] args) { //Pgrm 5
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
    /*public static void main(String[] args) { //Pgrm 6
        int[] scores = {80,92,91,68,88};
        int index = 0, target = 91;
        while(scores[index] != target){
            index++;
        }
        System.out.print(index);
    }*/
    /*public static void main(String[] args) { //Pgrm 7
        int[] intArray = randomArray(10,21);
        boolean isDuplicate = false;
        for(int i = 0; i < intArray.length; i++) {
            int element = intArray[i];
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[j] == element && j != i) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                break;
            }
        }
        printArray(intArray);
        System.out.print(isDuplicate?"Array has duplicates":"Array does not have duplicates");
    }*/
    /*public static void main(String[] args) { //Pgrm 8
        int[] intArray = randomArray(10,11);
        int zeroPos = intArray[intArray.length-1];
        printArray(intArray);
        for (int i = intArray.length-2; i >= 0 ; i--) {
            intArray[i+1] = intArray[i];
        }
        intArray[0] = zeroPos;
        printArray(intArray);
    }*/
    /*public static void main(String[] args) { //Pgrm 9
        int[] intArray = randomArray(10,11);
        printArray(intArray);
        for (int i = 0; i < intArray.length/2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length-(1+i)];
            intArray[intArray.length-(1+i)] = temp;
        }
        printArray(intArray);
    }*/
    /*public static void main(String[] args) { //Pgrm 10
        int[] data = randomArray(10,11);
        int[] result = new int[data.length];
        for (int i = 0; i < result.length ; i++) {
            result[i] = data[data.length-(1+i)];
        }
        System.out.print("FROM:  ");
        printArray(data);
        System.out.print("TO:    ");
        printArray(result);
    }*/
    /*public static void main(String[] args) { //median() and findMultipleOfThree()
        int[] intArray = randomArray(10,11);
        printArray(intArray);
        System.out.print(median(intArray));
        //System.out.print(findMultipleOfThree(intArray));
    }*/
    public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String word = scanline.nextLine();
        System.out.format("Word: %s.  Is odd? %s.  Half not including center: %s.  Center: %s",word, word.length()%2 == 1,word.substring(0,word.length()/2));
        /*if(word.length()%2 == 0){
            System.out.format("\nThe word %s %s a palindrome.",word,  ?"is":"isn't");
        } else {
            System.out.format("\nThe word %s %s a palindrome.",word, ?"is":"isn't");
        }*/
    }
    public static int[] randomArray(int length, int maxExclusive){ //"givin" array
        int[] out = new int[length];
        for(int i = 0; i < length; i++){
            out[i] = new Random().ints(0,maxExclusive).findFirst().getAsInt();
        }
        return out;
    }

    public static void printArray(int[] in){ //gen. purpose display function
        StringBuilder bobTheBuilder = new StringBuilder();
        for(int num : in){
            bobTheBuilder.append(String.format("%d, ", num));
        }
        System.out.format("[%s]\n", bobTheBuilder.substring(0,bobTheBuilder.length()-2));
    }

    public static double median(double[] in){
        return in.length%2 == 0? (in[in.length/2]+in[(in.length/2)-1])/2.0:in[in.length/2];
    }
    public static double median(int[] in){
        return in.length%2 == 0? (in[in.length/2]+in[(in.length/2)-1])/2.0:in[in.length/2];
    }

    public static int findMultipleOfThree(int[] in){
        int index = -1;
        for (int i = 0; i < in.length; i++) {
            index = in[i]%3 == 0? i:index;
        }
        return index;
    }
}
