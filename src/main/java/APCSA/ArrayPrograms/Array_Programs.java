package APCSA.ArrayPrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Programs {
    /*public static void main(String[] args) { //Pgrm 1
        int[] intArray = randomArray(10,11);
        double sum = 0;
        for (int j : intArray) {
            sum += j;
        }
        printArray(intArray);
        System.out.format("Sum: %d, Average: %.1f", (int)sum, sum/intArray.length);
    }*/
    /*public static void main(String[] args) { //Pgrm 2
        int[] intArray = randomArray(10,11);
        int max = intArray[0];
        for (int j : intArray) {
            max = Math.max(j, max);
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
        for(int inte : intArray){
            oddSum += inte%2 == 1 ? inte : 0;
            evenSum += inte%2 == 0 ? inte : 0;
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
    /*public static void main(String[] args) { //the palindrom one
        Scanner scanline = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String preWord = scanline.nextLine().toLowerCase();
        String[] preWordSegments = preWord.split(" ");
        String word = "";
        for (String element: preWordSegments) {
            word += element;
        }
        StringBuilder invertedSecondHalf = new StringBuilder();
        int modifer = word.length()%2 == 0?0:1;
        String substring = word.substring(word.length() / 2 + modifer);
        for(int i = substring.length()-1; i >= 0; i--){
            invertedSecondHalf.append(substring.charAt(i));
        }
        System.out.format("\nThe word '%s' %s a palindrome.",preWord, word.substring(0,word.length()/2).equals(invertedSecondHalf.toString()) ?"is":"isn't");
    }*/

    public static void main(String[] args) { //Reverse array no loops
        int[] val = {0,1,2,3};
        System.out.format("Original Array: %s, %s, %s, %s",val[0],val[1],val[2],val[3]);
        int temp = val[0];
        val[0] = val[3];
        val[3] = temp;
        temp = val[2];
        val[2] = val[1];
        val[1] = temp;
        System.out.format("\nReversed Array: %s, %s, %s, %s",val[0],val[1],val[2],val[3]);
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

