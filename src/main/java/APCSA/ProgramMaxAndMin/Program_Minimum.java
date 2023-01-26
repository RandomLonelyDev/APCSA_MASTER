package APCSA;

import java.util.*;
public class Program_Minimum {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter an integer: ");
                int val1 = scanline.nextInt();
                System.out.print("Enter another integer: ");
                int val2 = scanline.nextInt();
                System.out.format("The minimum of %d and %d is %d\n\n", val1, val2, Math.min(val1, val2));
            } catch (InputMismatchException e) {
                System.out.print("\n Error! Please enter a valid integer.  Press 'Enter' to continue");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}

/*
For idiots:
public class APCSA.Program_Minimum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int minimum;
        System.out.print("Enter an integer number: ");
        int value1 = scanline.nextInt();
        System.out.print("Enter another integer number: ");
        int value2 = scanline.nextInt();
        if(value1 < value2){
            minimum = value1;
        } else {
            minimum = value2;
        }
        System.out.println("The minimum of " + value1 + "and" + value2 + "is" + minimum);
    }
}
 */

