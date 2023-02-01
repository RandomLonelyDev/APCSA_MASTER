package APCSA.Table;

public abstract class Table {
    protected int seats;
    protected float quality, height;
    protected Table(){}
    protected Table(int seats, float quality, float height) {
        this.seats = seats > 0 ? seats : 1;
        this.quality = quality;
        this.height = height;
    }

    public int getNumSeats() {
        return seats;
    }
    public abstract float getDesirability();

    public boolean canSeat(int people) {
        return seats >= people;
    }
}
