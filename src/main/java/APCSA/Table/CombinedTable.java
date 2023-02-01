package APCSA.Table;

public class CombinedTable extends Table {
    SingleTable t1, t2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        seats = t1.getNumSeats() + t2.getNumSeats()-2;
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public float getDesirability() {
        return avgOf(t2.getDesirability(), t1.getDesirability()) - (t1.getHeight() == t2.getHeight() ?  0 : 10);
    }

    private float avgOf(float... values) {
        float total = 0;
        for(float val : values) total += val;
        return total/values.length;
    }
}
