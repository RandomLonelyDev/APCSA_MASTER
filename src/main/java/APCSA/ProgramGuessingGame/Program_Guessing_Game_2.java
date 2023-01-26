package APCSA.ProgramGuessingGame;

import java.util.*;
public class Program_Guessing_Game_2 {
    public static void main(String[] args){
        int tries = 0,attempt = 0;
        boolean won = false;
        Scanner scanline = new Scanner(System.in);
        while(!won) {
            try {
                final int num = new Random().ints(1, 6).findFirst().getAsInt();
                while (attempt != num) {
                    System.out.print("Enter a number between 1 and 100: ");
                    attempt = scanline.nextInt();
                    System.out.print(attempt > num ? "Too high.\n" : attempt < num ? "Too low.\n" : "You won!\n");
                    tries += 1;
                }
                System.out.format("It took you %d guesses!", tries);
                won = true;
            } catch (InputMismatchException e) {
                System.out.print("\nError! Please enter a valid integer between 1 and 100.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}
