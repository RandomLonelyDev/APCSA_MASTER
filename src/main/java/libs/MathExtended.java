package libs;

import java.util.*;
public class MathExtended {
    public static double pythagHypotenuse(double s1, double s2) {
        return Math.sqrt(Math.pow(Math.abs(s1), 2) + Math.pow(Math.abs(s2), 2));
    }
    public static double pythagSide(double side, double hypot) {
        return Math.sqrt(Math.pow(Math.abs(hypot), 2) - Math.pow(Math.abs(side), 2));
    }
    public static String linearEquationFromPoints(double x1, double y1, double x2, double y2) {
        return String.format("y = %.1fx + %.1f", ((y2 - y1) / (x2 - x1)), (y1 - (((y2 - y1) / (x2 - x1)) * x1)));
    }
    public static List quadraticFormula(double a, double b, double c) {
        double radicand = (b * b) - (4 * a * c);
        List out = new ArrayList<>();
        if (radicand < 0) {
            out.add(0, String.format("%.1f+%.1fi", -b / (2 * a), Math.abs(radicand) / (2 * a)));
            out.add(1, String.format("%.1f-%.1fi", -b / (2 * a), Math.abs(radicand) / (2 * a)));
        } else {
            out.add(0, (-b + Math.sqrt(radicand)) / (2 * a));
            out.add(0, (-b - Math.sqrt(radicand)) / (2 * a));
        }
        return out;
    }
    public static double decimalFromString(String fraction) {
        double out = 0;
        if (fraction.contains("/")) {
            double pt1 = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
            double pt2 = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1));
            out = pt1 / pt2;
        } else {
            try {
                out = Double.parseDouble(fraction);
            } catch (NumberFormatException e) {
                throw new InputMismatchException("");
            }
        }
        return out;
    }
    public static String fractionFromDecimal(double decimal) {
        String sDecimal = Double.toString(decimal);
        double multiplier = Math.pow(10, sDecimal.substring(sDecimal.indexOf('.') + 1).length());
        double numerator = Math.round(decimal * multiplier);
        do {
            if (Math.round(numerator % 5) == 0) {
                numerator /= 5;
                multiplier /= 5;
            } else if (Math.round(numerator % 2) == 0) {
                numerator /= 2;
                multiplier /= 2;
            }
        } while (Math.round(numerator % 5) == 0 || Math.round(numerator % 2) == 0);
        return String.format("%d/%d", Math.round(numerator), Math.round(multiplier));
    }
    public static int randomInt(int bottomBoundInclusive, int topBoundExclusive){
        Random random = new Random();
        return random.ints(bottomBoundInclusive,topBoundExclusive).findFirst().getAsInt();
    }
    public static boolean randomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }
    public static double randomDouble(double bottomBoundInclusive, double topBoundExclusive){
        Random random = new Random();
        return random.doubles(bottomBoundInclusive,topBoundExclusive).findFirst().getAsDouble();
    }
    public static char randomChar(){
        Random random = new Random();
        return (char)random.ints(33,125).findFirst().getAsInt();
    }
}