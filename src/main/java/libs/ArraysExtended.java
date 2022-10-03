package libs;
import java.lang.reflect.Array;
import java.util.*;

public class ArraysExtended {
    public static <T> String printArray(T[] input) {
        StringBuilder out = new StringBuilder("{");
        for (T element : input) {
            out.append(String.format("%s, ", element));
        }
        return out.substring(0, out.length() - 2) + "}";
    }

    public static <T> Object[] removeElement(T[] input, int index) {
        ArrayList<T> asAList = new ArrayList<>(Arrays.asList(input));
        asAList.remove(index);
        return asAList.toArray();
    }

    public static <T> Object[] append(T[] input, T data) {
        ArrayList<T> asAList = new ArrayList<>(Arrays.asList(input));
        asAList.add(input.length, data);
        return asAList.toArray();
    }

    public static <T> Object[] inflate(T[] input, int places) {
        ArrayList<T> asAList = new ArrayList<>(Arrays.asList(input));
        for (int i = 0; i < places; i++) {
            asAList.add(input.length + i, null);
        }
        return asAList.toArray();
    }

    public static <T> Object[] subArray(T[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        Object[] out = new Object[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static <T> Object[] join(T[] arr1, T[] arr2) {
        Object[] out = new Object[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static boolean contains(boolean[] input, boolean criteria) {
        for (boolean element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] input, char criteria) {
        for (char element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] input, String criteria) {
        for (String element : input) {
            if (Objects.equals(element, criteria)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(Object[] input, Class criteria) {
        for (Object element : input) {
            if (criteria.isInstance(element)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(byte[] input, byte criteria) {
        for (byte element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(short[] input, short criteria) {
        for (short element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(int[] input, int criteria) {
        for (int element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(long[] input, long criteria) {
        for (long element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(float[] input, float criteria) {
        for (float element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] input, double criteria) {
        for (double element : input) {
            if (element == criteria) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(boolean[] input, boolean criteria) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == criteria) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(char[] input, char criteria) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == criteria) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String[] input, String criteria) {
        for (int i = 0; i < input.length; i++) {
            if (Objects.equals(input[i], criteria)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(Object[] input, Class criteria) {
        for (int i = 0; i < input.length; i++) {
            if (criteria.isInstance(input[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(float[] input, float criteria) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == criteria) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(double[] input, double criteria) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == criteria) {
                return i;
            }
        }
        return -1;
    }
    public static int indexOf(byte[] input, byte criteria){
        for(int i = 0; i < input.length; i++){
            if(input[i] == criteria){
                return i;
            }
        }
        return -1;
    }
    public static int indexOf(short[] input, short criteria){
        for(int i = 0; i < input.length; i++){
            if(input[i] == criteria){
                return i;
            }
        }
        return -1;
    }
    public static int indexOf(int[] input, int criteria){
        for(int i = 0; i < input.length; i++){
            if(input[i] == criteria){
                return i;
            }
        }
        return -1;
    }
    public static int indexOf(long[] input, long criteria){
        for(int i = 0; i < input.length; i++){
            if(input[i] == criteria){
                return i;
            }
        }
        return -1;
    }
}