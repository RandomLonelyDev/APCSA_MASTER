package APCSA.ProgramGrades;

import java.util.*;
public class Program_Grades {
    public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        while(true) {
            try {
                int eSum = 0, mSum = 0;
                System.out.println("How many grades would you like to enter?");
                int max = scanline.nextInt();
                for (int i = 0; i < max; i++) {
                    System.out.format("\nEnter grade %d\n", i + 1);
                    eSum += scanline.nextInt();
                    System.out.println("How many points was it worth?");
                    mSum += scanline.nextInt();
                }
                double avg = (eSum*100.0)/mSum;
                System.out.format("Your points - %d\nTotal points - %d\n\nYour average was %.2f\nYou earned a %s\n\n\n", eSum, mSum, avg, avg >= 90?"A":avg < 90 && avg >= 80?"B":avg < 80 && avg >= 70?"C":avg < 70 && avg >= 60?"D":"F");
            } catch (InputMismatchException e) {
                System.out.print("\nError!  Please enter a valid integer.  Press 'Enter' to continue.\n");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}