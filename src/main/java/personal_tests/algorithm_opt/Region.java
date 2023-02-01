package personal_tests.algorithm_opt;

import personal_tests.wildfire.enums.Location;

public abstract class Region {
    private double wValue, mwValue, sValue, eValue, intValue;
    private Region(){}
    protected Region(double wValue, double mwValue, double sValue, double eValue, double intValue) {
        this.wValue = wValue;
        this.mwValue = mwValue;
        this.sValue = sValue;
        this.eValue = eValue;
        this.intValue = intValue;
    }

    public final double getValue(Location location) {
        return switch(location) {
            case WEST -> wValue;
            case MIDWEST -> mwValue;
            case EAST -> eValue;
            case SOUTH -> sValue;
            case INTERNATIONAL -> intValue;
        };
    }

    public final static Region getRegion(Location l) {
        return switch (l) {
            case WEST -> new WRegion();
            case MIDWEST -> new MWRegion();
            case EAST -> new ERegion();
            case SOUTH -> new SRegion();
            case INTERNATIONAL -> new INTRegion();
        };
    }
}
