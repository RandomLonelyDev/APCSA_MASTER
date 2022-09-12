import java.util.Scanner;
import java.util.InputMismatchException;

public class Program_Change {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        int input,quarters,dimes,nickles;
        try {
            System.out.print("Enter the change in cents: ");
            input = (int)scanline.nextInt();
            quarters = (int)(input / 25);
            dimes = (int)((input % 25)/10);
            nickles = (int)(((input % 25) % 10)/5);
            System.out.print("The minimum number of coins is:");
            System.out.format("\nQuarters: %d", quarters);
            System.out.format("\nDimes: %d", dimes);
            System.out.format("\nNickles: %d", nickles);
            System.out.format("\nPennies: %d", (int)(((input % 25) % 10) % 5));
        } catch (InputMismatchException e) {
            System.out.print("\nError!  Please enter an integer.");
        }
    }
}