package APCSA.TwoDArrays;

import java.util.ArrayList;
import java.util.Comparator;
import static personal_tests.libs.MathExtended.*;
import static java.lang.Math.*;

public class TDArrayMethods {
    public static void main(String[] args) {
        Boolean[][] a = getArray(2,3);
        print(a);
        System.out.println(tfDiff(a));
        System.out.println(oddTrues(a));
        System.out.println(truesInCol(a, 1));
        System.out.println(greatestValDiff(a));
        print(randArray(4,4));
    }
    private static Boolean[][] getArray(int rows, int cols) {
        Boolean[][] out = new Boolean[rows][cols];
        for(int i = 0; i < rows; i++) for(int j = 0; j < out[i].length; j++) out[i][j] = randomBoolean();
        return out;
    }
    private static int tfDiff(Boolean[][] a) {
        int count = 0;
        for(Boolean[] arr : a) for(Boolean val : arr) count += val ? 1 : -1;
        return abs(count);
    }
    private static Boolean oddTrues(Boolean[][] a) {
        int count = 0;
        for(Boolean[] arr : a) for(Boolean val : arr) count += val ? 1 : 0;
        return (count % 2) == 1;
    }
    private static int truesInCol(Boolean[][] a, int col) {
        int count = 0;
        for(Boolean[] arr : a) count += arr[col] ? 1 : 0;
        return count;
    }
    private static int greatestValDiff(Boolean[][] a) {
        ArrayList<Integer> diffs = new ArrayList<>(); int count = 0;
        for(int i = 0; i < a[0].length; i++) {
            for(int j = 0; j < a.length; j++) count += a[j][i] ? 1 : -1;
            diffs.add(abs(count));  count = 0;
        }
        diffs.sort(Comparator.reverseOrder());
        return diffs.get(0);
    }
    private static Integer[][] randArray(int rows, int cols) {
        Integer[][] out = new Integer[rows][cols];
        for(int i = 0; i < out.length; i++) for(int j = 0; j < out[i].length; j++) out[i][j] = randomInt(1,5);
        return out;
    }
    private static <T> void print(T[][] array) {
        for(T[] row : array) {
            for(T val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}