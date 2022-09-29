import java.util.*;
public class Flip_Or_Roll {
    public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        Random rand = new Random();
        while(true) {
            try {
                System.out.print("Do you want to:\n(1) flip a coin\n(2) roll a die\n(3) roll two dice\n");
                int choice = scanline.nextInt();
                choice = choice <= 3 && choice > 0?choice:4;
                switch (choice) {
                    case 1 -> System.out.print(((int) (Math.random() * 2)) == 0 ? "HEADS!\n\n" : "TAILS!\n\n");
                    case 2 -> System.out.format("You rolled a %d\n\n", rand.ints(1,7).findFirst().getAsInt());
                    case 3 -> System.out.format("You rolled a %d and a %d\n\n", rand.ints(1,7).findFirst().getAsInt(),rand.ints(1,7).findFirst().getAsInt());
                    case 4 -> throw new InputMismatchException("");
                }
            } catch (InputMismatchException e) {
                System.out.print("\n Error!  Please enter 1, 2, or 3.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}