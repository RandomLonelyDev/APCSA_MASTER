import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Algebra_Lib_v1 {
    public static double pythagHypotenuse(double s1, double s2){
        return Math.sqrt(Math.pow(Math.abs(s1),2)+Math.pow(Math.abs(s2),2));
    }
    public static double pythagSides(double side, double hypot){
        return Math.sqrt(Math.pow(Math.abs(hypot),2)-Math.pow(Math.abs(side),2));
    }
    public static String equationFromPoints(double x1, double y1, double x2, double y2){
        return String.format("Equation is y = %.1fx + %.1f",((y2-y1)/(x2-x1)),(y1-(((y2-y1)/(x2-x1))*x1)));
    }
    public static List quadraticFormula(double a, double b, double c){
        double radicand = (b*b)-(4*a*c);
        List out = new ArrayList<>();
        if(radicand < 0){
            out.add(0,String.format("%.1f+%.1f",-b/(2*a),Math.abs(radicand)/(2*a)));
            out.add(1,String.format("%.1f-%.1f",-b/(2*a),Math.abs(radicand)/(2*a)));
        } else {
            out.add(0,(-b + Math.sqrt(radicand))/(2*a));
            out.add(0,(-b - Math.sqrt(radicand))/(2*a));
        }
        return out;
    }
    public static double angleFromSides(double s1, double s2, String sct){
        return switch (sct) {
            case "sin" -> Double.valueOf(String.format("%.2f", Math.toDegrees(Math.asin(s1 / s2))));
            case "cos" -> Double.valueOf(String.format("%.2f", Math.toDegrees(Math.acos(s1 / s2))));
            case "tan" -> Double.valueOf(String.format("%.2f", Math.toDegrees(Math.atan(s1 / s2))));
            default -> -1;
        };
    }
    public static double sideFromAngle(double s1, double a1, String sct){
        return switch (sct){
            case "sin" -> Double.valueOf(String.format("%.2f"));
            case "cos" -> Double.valueOf(String.format("%.2f"));
            case "tan" -> Double.valueOf(String.format("%.2f"));
            default -> -1;
        };
    }
}