package APCSA.LoopsChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loops_Challenge {
    /*public static void main(String[] args) {
        int i = 4;
        while(i > 0){
            System.out.format("%d Eagles\n",i--);
        }
    }*/
    /*public static void main(String[] args) {
        int i = 1;
        while(i < 6){
            System.out.format("%d x ",i++);
        }
    }*/
    /*public static void main(String[] args) {
        int i = -4;
        while(i < 6){
            System.out.format("%d\n",i+=2);
        }
    }*/
    /*public static void main(String[] args) {
        int i = 0;
        int a = 2;
        while(i < 15 && a > -8){
            System.out.format("%d %d\n",i+=3,a-=2);
        }
    }*/
    /*public static void main(String[] args) {
        int i = 0;
        do {
            System.out.format("%d %d\n",i+=3,i%4);
        } while (i < 18);
    }*/
    /*public static void main(String[] args) {
        for (int i = 0, a = 0, b = 0; i < 6; i++, a += 2, b += a) {
            System.out.format("%d %d %d\n",i,a,b);
        }
    }*/
    /*public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            try {
                System.out.print("Enter a number greater than 10: ");
                int in = scanline.nextInt();
                if(in <= 10){
                    throw new InputMismatchException();
                }
                for(int i = in; i > 7; i--){
                    System.out.format("%d\n",i);
                }
                exit = true;
            } catch(InputMismatchException e) {
                System.out.println("\n Error ! Please enter a number greater than 10.  Press 'Enter' to continue");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }*/
    /*public static void main(String[] args) {
        for (int i = 2; i < 5; i++) {
            System.out.format("i is %d\n",i);
            for (int j = 3; j < 7; j++) {
                System.out.format("\tj is %d\n",j);
            }
        }
    }*/
    /*public static void main(String[] args) {
        for (int i = 7; i > 3; i--) {
            System.out.format("i is %d\n",i);
            for (int j = 5; j > 2; j--) {
                System.out.format("\tj is %d\n",j);
            }
        }
    }*/
    /*public static void main(String[] args) {
        boolean exit = false;
        Scanner scanline = new Scanner(System.in);
        while (!exit) {
            try {
                do{
                    System.out.print("Enter a number greater than or equal to 10: ");
                } while (scanline.nextInt() < 10);
                exit = true;
            } catch (InputMismatchException e) {
                System.out.println("\nError.  Please enter a valid number.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }*/
}
