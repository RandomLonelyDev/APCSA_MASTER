import java.util.*;
public class Program_Perfect_Square {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Please input an integer: ");
                int in = scanline.nextInt();
                System.out.format("%s\n\n",Math.pow((int)Math.sqrt(in),2)==in);
            }catch(InputMismatchException e) {
                System.out.print("Error! Please enter an integer.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
                System.out.print("\n");
            }
        }
    }
}