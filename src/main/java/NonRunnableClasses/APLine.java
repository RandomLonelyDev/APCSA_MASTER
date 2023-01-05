package NonRunnableClasses;

public class APLine {
    private int a,b,c;
    private double slope;
    public APLine(int a, int b, int c) throws SlopeException {
        if(a == 0 || b == 0 || c == 0) throw new SlopeException("Parameter set to zero");
        this.a = a;
        this.b = b;
        this.c = c;
        slope = (-1.0*a)/b;
    }

    public double getSlope() {
        return slope;
    }

    public boolean isOnLine(int x, int y) {
        return ((a*x) + (b*y) + c) == 0;
    }
}
