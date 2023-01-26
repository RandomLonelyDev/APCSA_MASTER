package APCSA.Trapezoid;

public class Trapezoid {
    protected double top, bottom, height;

    public Trapezoid(double top, double bottom, double height) throws TrapezoidStateException {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        if(top == bottom) throw new TrapezoidStateException("That's a rectangle");
        if(top <= 0 || bottom <= 0 || height <= 0) throw new TrapezoidStateException("Zero or negative side length");
    }

    public void setTop(double top) {
        this.top = top;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    public double getTop() {
        return top;
    }

    public double area(){
        return ((top+bottom)/2)*height;
    }

    public static void displayAreaFormula(){
        System.out.println("Trapezoid area formula: (top + bottom)\n                        --------------  x height\n                               2");
    }

    @Override
    public boolean equals(Object obj) {
        Trapezoid actual = (Trapezoid) obj;
        return (obj != null && actual.getBottom() == this.bottom && actual.getTop() == this.top && actual.getHeight() == this.height);
    }

    @Override
    public String toString() {
        return String.format("Trapazoid dimensions: top side: %s, bottom side: %s, height: %s",top,bottom,height);
    }
}
