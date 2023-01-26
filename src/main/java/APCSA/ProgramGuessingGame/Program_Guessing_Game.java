package APCSA.ProgramGuessingGame;

import java.util.*;
public class Program_Guessing_Game {
    public static void main(String[] args){
        int max,ntg,guess;
        Scanner scanline = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter the maximum number: ");
                max = scanline.nextInt();
                ntg = (int)(max*Math.random())+1;
                System.out.format("Enter a number between 1 and %d: ",max);
                guess = scanline.nextInt();
                if(guess == ntg){
                    System.out.print("You won!\n\n");
                } else if(guess > max){
                    System.out.format("Your guess is bigger than %d.\n\n",max);
                } else if(guess > ntg){
                    System.out.format("Too High! The number was %d.\n\n",ntg);
                } else {
                    System.out.format("Too Low! The number was %d.\n\n",ntg);
                }
            } catch (InputMismatchException e) {
                System.out.print("\nError! Pleas enter an integer greater than 1.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}
