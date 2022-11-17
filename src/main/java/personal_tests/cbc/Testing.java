package personal_tests.cbc;

public class Testing {
    public static void main(String[] args) {
        int max = 6;
        for(int xRow = 0, col = 0, zRow = 0; col < max; xRow++) {
            System.out.format("[X:%d Y:%d Z:%d]\n",xRow,col,zRow);
            if (xRow == max-1) {
                xRow = -1;
                zRow++;
            }
            if (zRow == max) {
                xRow = -1;
                zRow = 0;
                col++;
            }
        }
    }
}
