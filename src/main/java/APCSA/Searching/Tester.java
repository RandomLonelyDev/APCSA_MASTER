package APCSA.Searching;

import personal_tests.libs.ArraysExtended;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Integer[] test = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(binarySearch(test, 6));
    }

    public static <T> int linearSearch(T[] array, T key) {
        for(int i = 0; i < array.length; i++) if(array[i].equals(key)) return i;
        return -1;
    }

    public static <T extends Comparable> int binarySearch(T[] array, T key) {
        int low = 0; int high = array.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            T element = array[mid];
            if (element.compareTo(key) == 0) return mid;
            else if (element.compareTo(key) < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static <T extends Comparable> T[] insertionSort(T[] array) {
        for(int i = 0; i < array.length; i++) {
            T current = array[i]; int cIndex = i - 1;
            while(cIndex >= 0 && array[cIndex].compareTo(current) > 0) {
                array[cIndex+1] = array[cIndex];
                cIndex--;
            }
            array[cIndex + 1] = current;
        }
        return array;
    }

    public static <T extends Comparable> T[] selectionSort(T[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.println(Arrays.toString(array));
            int minIndex = i;
            for(int j = minIndex + 1; j < array.length; j++)if(array[j].compareTo(array[minIndex]) < 0){ minIndex = j; }
            T temp = array[i]; array[i] = array[minIndex]; array[minIndex] = temp;
        }
        return array;
    }
}
