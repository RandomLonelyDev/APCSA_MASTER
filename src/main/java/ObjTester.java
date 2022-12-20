import NonRunnableClasses.Prisim;
import NonRunnableClasses.Trapezoid;
import NonRunnableClasses.TrapezoidStateException;


public class ObjTester {
    public static void main(String[] args) throws TrapezoidStateException {
        Trapezoid trap1 = new Trapezoid(4,10,5);
        System.out.println("Trapezoid area: " + trap1.area());
        Trapezoid.displayAreaFormula();
        System.out.println(trap1);
        Trapezoid trap2 = new Trapezoid(2,6,4);
        System.out.println(trap1.equals(trap2)?"Trapezoids are equal.":"Trapezoids are not equal");
        Prisim pris1 = new Prisim(4,10,5,8);
        System.out.println("Prisim volume: " + pris1.volume());
        System.out.println(pris1);
    }
}
