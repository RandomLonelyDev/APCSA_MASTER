import java.util.*;
import Wildfire_java_test.libs.MathExtended;
public class randgen {
    public static void main(String[] args){
        ArrayList<String> sections = new ArrayList<>(Arrays.asList("Flutes", "Clarinets", "Saxophones", "Mellophones", "Trumpets", "Low Brass", "Low Reeds", "Percussion", "Guard"));
        Scanner scanline = new Scanner(System.in);
        while(sections.toArray().length > 0) {
            try {
                System.out.print("Press enter to generate a section");
                scanline.nextLine();
                int index = MathExtended.randomInt(0,sections.toArray().length);
                System.out.format("\nSection: %s\n\n",sections.get(index));
                sections.remove(index);
            } catch (InputMismatchException e) {

            }
        }
    }
}
