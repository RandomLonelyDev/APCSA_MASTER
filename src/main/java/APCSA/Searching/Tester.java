package APCSA.Searching;

import personal_tests.libs.ArraysExtended;
import org.jetbrains.annotations.*;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        shelveSort(new Integer[]{7, 1, 6, 3, 4, 2});
    }
    @Contract(pure = true)
    public static <T> int linearSearch(@NotNull T @NotNull [] array, @NotNull T key) {
        for(int i = 0; i < array.length; i++) if(array[i].equals(key)) return i;
        return -1;
    }

    @Contract(pure = true)
    public static <T extends Comparable> int binarySearch(@NotNull T @NotNull [] array, @NotNull T key) {
        int low = 0; int high = array.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            T element = array[mid];
            if (element.compareTo(key) == 0) return mid;
            else if (element.compareTo(key) < 0) low = mid + 1;
            else high = mid - 1;
        } return -1;
    }

    @Contract(pure = true)
    public static <T extends Comparable> void insertionSort(@NotNull T @NotNull [] array) {
        for(int i = 0; i < array.length; i++) {
            T current = array[i]; int cIndex = i - 1;
            while(cIndex >= 0 && array[cIndex].compareTo(array) > 0) {
                array[cIndex+1] = array[cIndex];
                cIndex--;
            }
            array[cIndex + 1] = current;
        }
    }
    @Contract(pure = true)
    public static <T extends Comparable> void selectionSort(@NotNull T @NotNull [] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.println(Arrays.toString(array));
            int minIndex = i;
            for(int j = minIndex + 1; j < array.length; j++) if(array[j].compareTo(array[minIndex]) < 0){ minIndex = j; }
            T temp = array[i]; array[i] = array[minIndex]; array[minIndex] = temp;
        }
    }

    public static <T extends Comparable> void mergeSort(@NotNull T @NotNull [] array) {
        if (array.length < 2) return;
        int mid = array.length / 2;
        T[] left = Arrays.copyOfRange(array, 0, mid); T[] right = Arrays.copyOfRange(array, mid, array.length);
        mergeSort(left); mergeSort(right);
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) if (left[i].compareTo(right[j]) <= 0) array[k++] = left[i++]; else array[k++] = right[j++];
        while (i < left.length) array[k++] = left[i++]; while (j < right.length) array[k++] = right[j++];
    }

    public static <T extends Comparable> void shelveSort(@NotNull T @NotNull [] array) {
    }
}
