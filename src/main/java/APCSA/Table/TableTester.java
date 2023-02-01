package APCSA.Table;

public class TableTester {
    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 60F, 74F);
        SingleTable t2 = new SingleTable(8, 70F, 74F);
        SingleTable t3 = new SingleTable(12, 75F, 76F);
        CombinedTable c1 = new CombinedTable(t1, t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());
        CombinedTable c2 = new CombinedTable(t2, t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());
        t2.setViewQuality(80F);
        System.out.println(c2.getDesirability());
    }
}
