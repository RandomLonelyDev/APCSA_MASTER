package NonRunnableClasses;

public class Prisim extends Trapezoid{
    protected double length;

    public Prisim(double top, double bottom, double height, double length) throws TrapezoidStateException {
        super(top,bottom,height);
        if(length <= 0) throw new TrapezoidStateException("Dimension is zero or negative");
        this.length = length;
    }

    public Prisim(Trapezoid parent, double length) throws TrapezoidStateException {
        super(parent.top,parent.bottom,parent.height);
        if(length <= 0) throw new TrapezoidStateException("Dimension is zero or negative");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double volume(){
        return area() * length;
    }
    public double surfaceArea(){
        double slant,tbDiff = Math.abs(top-bottom);
        slant = Math.sqrt(Math.pow(tbDiff,2) + Math.pow(height,2));
        return ((top*(height + length)) + (bottom * (height + length)) + (slant*length) + (slant * length));
    }

    @Override
    public String toString() {
        return String.format("Prisim dimensions: top side: %s, bottom side: %s, height: %s, length: %s", top, bottom, height, length);
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj) && ((Prisim) obj).length == this.length;
    }

    public static void displayVolumeFormula(){
        System.out.println("Trapezoid area formula: (top + bottom)\n                        --------------  x height * length\n                               2");
    }
}
