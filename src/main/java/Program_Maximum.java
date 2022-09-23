import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_Maximum {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter an integer: ");
                int val1 = scanline.nextInt();
                System.out.print("Enter another integer: ");
                int val2 = scanline.nextInt();
                System.out.format("The maximum of %d and %d is %d\n\n", val1, val2, Math.max(val1, val2));
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
public class Program_Maximum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int maximum;
        System.out.print("Enter an integer number: ");
        int value1 = scanline.nextInt();
        System.out.print("Enter another integer number: ");
        int value2 = scanline.nextInt();
        if(value1 > value2){
            maximum = value1;
        } else {
            maximum = value2;
        }
        System.out.println("The minimum of " + value1 + "and" + value2 + "is" + maximum);
    }
}
 */

