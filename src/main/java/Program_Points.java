import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
public class Program_Points {
    public static void main(String[] args) {
        double xdiff,ydiff,fx,fy,sx,sy,gy,gx,slope;
        Scanner scanline = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("First point.\nEnter x coordinate.");
                fx = MathExtended.fractionFromString(scanline.nextLine());
                System.out.print("Enter y coordinate.");
                fy = MathExtended.fractionFromString(scanline.nextLine());
                System.out.print("\nSecond point.\nEnter x coordinate.");
                sx = MathExtended.fractionFromString(scanline.nextLine());
                System.out.print("Enter y coordinate.");
                sy = MathExtended.fractionFromString(scanline.nextLine());
                xdiff = sx - fx;
                ydiff = sy - fy;
                slope = ydiff / xdiff;
                gx = Math.max(fx, sx);
                gy = Math.max(fy, sy);
                System.out.format("\nSlope is: %.1f", slope);
                System.out.format("\nMidpoint is (%.1f,%.1f)", (gx - (Math.abs(xdiff) / 2)), (gy - (Math.abs(ydiff) / 2)));
                System.out.format("\nDistance is: %.2f", Math.sqrt((Math.pow(xdiff, 2.0) + Math.pow(ydiff, 2.0))));
                System.out.format("\nEquation is y = %.1fx + %.1f\n\n", slope, (fy - (slope * fx)));
            } catch (InputMismatchException e) {
                System.out.print("Error: Please input a valid number!  Press 'Enter' to continue.");
                scanline.nextLine();
                scanline.nextLine();
            }
        }
    }
}