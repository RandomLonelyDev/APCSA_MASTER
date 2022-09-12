import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Algebra_Lib_v1 {
    public static double pythag_hypot(double s1, double s2){
        return Math.sqrt(Math.pow(Math.abs(s1),2)+Math.pow(Math.abs(s2),2));
    }
    public static double pythag_sides(double side, double hypot){
        return Math.sqrt(Math.pow(Math.abs(hypot),2)-Math.pow(Math.abs(side),2));
    }
    public static String equation_from_points(double x1, double y1, double x2, double y2){
        return String.format("Equation is y = %.1fx + %.1f",((y2-y1)/(x2-x1)),(y1-(((y2-y1)/(x2-x1))*x1)));
    }
    public static List quadratic(double a, double b, double c){
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
}