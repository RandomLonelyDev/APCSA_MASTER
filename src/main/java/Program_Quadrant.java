import java.util.*;
public class Program_Quadrant {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter the x-coordinate: ");
                double x = scanline.nextDouble();
                System.out.print("Enter the y-coordinate: ");
                double y = scanline.nextDouble();
                String quadrant = x==0 && y==0?"At the origin":y==0?"On the x-axis":x==0?"On the y-axis":x>0 && y>0?"Quadrant I":x<0 && y<0?"Quadrant III":x<0 && y>0?"Quadrant II":"Quadrant IV";
                System.out.format("%s\n\n",quadrant);
            }catch (InputMismatchException e){
                System.out.print("Error! Please enter a real number.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}