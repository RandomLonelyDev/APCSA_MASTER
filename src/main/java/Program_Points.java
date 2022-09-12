import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
public class Program_Points {
    public static void main(String[] args) {
        double xdiff,ydiff,fx,fy,sx,sy,gy,gx,slope;
        Scanner scanline = new Scanner(System.in);
        try {
            System.out.print("First point.\nEnter x coordinate.");
            fx = scanline.nextDouble();
            System.out.print("Enter y coordinate.");
            fy = scanline.nextDouble();
            System.out.print("\nSecond point.\nEnter x coordinate.");
            sx = scanline.nextDouble();
            System.out.print("Enter y coordinate.");
            sy = scanline.nextDouble();
            xdiff = sx - fx;
            ydiff = sy - fy;
            slope = ydiff/xdiff;
            gx = Math.max(fx,sx);
            gy = Math.max(fy,sy);
            System.out.format("\nSlope is: %.1f",slope);
            System.out.format("\nMidpoint is (%.1f,%.1f)",(gx-(Math.abs(xdiff)/2)),(gy-(Math.abs(ydiff)/2)));
            System.out.format("\nDistance is: %.2f",Math.sqrt((Math.pow(Math.abs(xdiff),2.0)+Math.pow(Math.abs(ydiff),2.0))));
            System.out.format("\nEquation is y = %.1fx + %.1f",slope,(fy-(slope*fx)));
        } catch (InputMismatchException e) {
            System.out.print("Error: Please input a valid number!");
        }
    }
}