package APCSA;

import java.util.*;
public class Program_Sort {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        int[] ints = new int[3];
        while(true){
            try{
                System.out.print("Enter the first integer: ");
                ints[0] = scanline.nextInt();
                System.out.print("Enter the second integer: ");
                ints[1] = scanline.nextInt();
                System.out.print("Enter the third integer: ");
                ints[2] = scanline.nextInt();
                Arrays.sort(ints);
                System.out.format("The numbers from least to greatest are: %s %s %s \n\n",ints[0],ints[1],ints[2]);
            }catch(InputMismatchException e){
                System.out.print("\nError! Please enter a valid integer.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}