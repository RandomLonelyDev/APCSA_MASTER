package APCSA;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_Sort_v2 {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter the max number of integers: ");
                int max = scanline.nextInt();
                int[] ints = new int[max];
                for(int i = 0; i < max; i++){
                    System.out.format("Enter integer number %d: ",i+1);
                    ints[i] = scanline.nextInt();
                }
                Arrays.sort(ints);
                System.out.print("The integers from least to greatest are: ");
                String output = "";
                for(int a = 0; a < max; a++){
                    output += (String.format("%d, ",ints[a]));
                }
                System.out.print(output.substring(0,output.length()-2) + ".\n\n");
            }catch(InputMismatchException e){
                System.out.print("\nError! Please enter a valid integer.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}