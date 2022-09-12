import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_Quadratic {
    public static void main(String[] args){
        Scanner scanline = new Scanner(System.in);
        double a,b,c,ans1,ans2,sqrt;
        while(true){
            try{
                System.out.print("Enter the value for a: ");
                a = scanline.nextDouble();
                System.out.print("Enter the value for b: ");
                b = scanline.nextDouble();
                System.out.print("Enter the value for c: ");
                c = scanline.nextDouble();
                sqrt = (b*b)+(-4*a*c);
                ans1 = (-b + Math.sqrt(sqrt))/(2*a);
                ans2 = (-b - Math.sqrt(sqrt))/(2*a);
                if(ans1 == ans2){
                    System.out.println("One double root");
                    System.out.format("One double root\nThe double root is %.1f\n\n",ans1);
                } else if(Double.isNaN(ans1) && Double.isNaN(ans2)){
                    System.out.println("Imaginary roots");
                    //Uncomment below to allow for an output of complex roots =).
                    //System.out.format("%.1f+%.1fi,%.1f-%.1fi",(-b/(2*a)),(Math.sqrt(Math.abs(sqrt)))/(2*a),(-b/(2*a)),Math.sqrt(Math.abs(sqrt))/(2*a));
                } else {
                    System.out.format("Two roots\nThe roots are %.1f,%.1f\n",ans1,ans2);
                }
            } catch (InputMismatchException e){
                System.out.print("\nError! Please enter a valid number.  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}