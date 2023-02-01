package APCSA.Table;

public class SingleTable extends Table {
    public SingleTable(int seats, float quality, float height) {
        super(seats, quality, height);
    }

    @Override
    public float getDesirability() {
        return quality;
    }

    public void setViewQuality(float quality) {
        this.quality = quality;
    }

    public float getHeight() {
        return height;
    }


}