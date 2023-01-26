package APCSA.ProgramChange;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Program_Change {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        long input,quarters,dimes,nickles;
        try {
            System.out.print("Enter the change in cents: ");
            input = scanline.nextLong();
            quarters = input / 25;
            dimes = (input % 25)/10;
            nickles = ((input % 25) % 10)/5;
            System.out.print("The minimum number of coins is:");
            System.out.format("\nQuarters: %d", quarters);
            System.out.format("\nDimes: %d", dimes);
            System.out.format("\nNickles: %d", nickles);
            System.out.format("\nPennies: %d", ((input % 25) % 10) % 5);
        } catch (InputMismatchException e) {
            System.out.print("\nError!  Please enter an integer.");
        }
    }
}