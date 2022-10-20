package Wildfire_java_test.libs;
import java.util.*;

public class ArraysExtended {
    public static <T> void printArray(T[] input) {
        String out = "";
        for (T element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(boolean[] input) {
        String out = "";
        for (boolean element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(char[] input) {
        String out = "";
        for (char element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(String[] input) {
        String out = "";
        for (String element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(double[] input) {
        String out = "";
        for (double element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(float[] input) {
        String out = "";
        for (float element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(byte[] input) {
        String out = "";
        for (byte element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(short[] input) {
        String out = "";
        for (short element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(int[] input) {
        String out = "";
        for (int element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static void printArray(long[] input) {
        String out = "";
        for (long element : input) {
            out += String.format("%s, ", element);
        }
        System.out.format("\n{%s}\n",out.substring(0, out.length() - 2));
    }

    public static <T> Object[] removeElement(T[] input, int index) {
        ArrayList<T> asAList = new ArrayList<>(Arrays.asList(input));
        asAList.remove(index);
        return asAList.toArray();
    }

    public static boolean[] removeElement(boolean[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(boolean element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        boolean[] out = new boolean[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Boolean){
                out[i] = (boolean) subOutArray[i];
            }
        }
        return out;
    }

    public static char[] removeElement(char[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(char element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        char[] out = new char[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Character){
                out[i] = (char) subOutArray[i];
            }
        }
        return out;
    }

    public static String[] removeElement(String[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(String element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        String[] out = new String[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof String){
                out[i] = (String) subOutArray[i];
            }
        }
        return out;
    }

    public static float[] removeElement(float[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(float element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        float[] out = new float[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Float){
                out[i] = (float) subOutArray[i];
            }
        }
        return out;
    }

    public static double[] removeElement(double[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(double element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        double[] out = new double[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Double){
                out[i] = (double) subOutArray[i];
            }
        }
        return out;
    }

    public static byte[] removeElement(byte[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(byte element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        byte[] out = new byte[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Byte){
                out[i] = (byte) subOutArray[i];
            }
        }
        return out;
    }

    public static short[] removeElement(short[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(short element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        short[] out = new short[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Short){
                out[i] = (short) subOutArray[i];
            }
        }
        return out;
    }

    public static int[] removeElement(int[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(int element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        int[] out = new int[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Integer){
                out[i] = (int) subOutArray[i];
            }
        }
        return out;
    }

    public static long[] removeElement(long[] input, int index){
        ArrayList asAList = new ArrayList<>();
        for(long element : input){
            asAList.add(element);
        }
        asAList.remove(index);
        Object[] subOutArray = asAList.toArray();
        long[] out = new long[subOutArray.length];
        for(int i = 0; i < subOutArray.length; i++){
            if(subOutArray[i] instanceof Long){
                out[i] = (long) subOutArray[i];
            }
        }
        return out;
    }

    public static <T> Object[] append(T[] input, T data) {
        ArrayList<T> asAList = new ArrayList<>(Arrays.asList(input));
        asAList.add(input.length, data);
        return asAList.toArray();
    }

    public static boolean[] append(boolean[] input, boolean data) {
        ArrayList asAList = new ArrayList<>();
        for(boolean element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        boolean[] out = new boolean[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Boolean){
                out[i] = (boolean) subOutArr[i];
            }
        }
        return out;
    }

    public static char[] append(char[] input, char data) {
        ArrayList asAList = new ArrayList<>();
        for(char element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        char[] out = new char[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Character){
                out[i] = (char) subOutArr[i];
            }
        }
        return out;
    }

    public static String[] append(String[] input, String data) {
        ArrayList asAList = new ArrayList<>();
        asAList.addAll(Arrays.asList(input));
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        String[] out = new String[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof String){
                out[i] = (String) subOutArr[i];
            }
        }
        return out;
    }

    public static float[] append(float[] input, String data) {
        ArrayList asAList = new ArrayList<>();
        for(float element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        float[] out = new float[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Float){
                out[i] = (float) subOutArr[i];
            }
        }
        return out;
    }

    public static double[] append(double[] input, String data) {
        ArrayList asAList = new ArrayList<>();
        for(double element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        double[] out = new double[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Double){
                out[i] = (double) subOutArr[i];
            }
        }
        return out;
    }

    public static byte[] append(byte[] input, String data) {
        ArrayList asAList = new ArrayList<>();
        for(byte element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        byte[] out = new byte[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Byte){
                out[i] = (byte) subOutArr[i];
            }
        }
        return out;
    }

    public static short[] append(short[] input, String data) {
        ArrayList asAList = new ArrayList<>();
        for(short element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        short[] out = new short[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Short){
                out[i] = (short) subOutArr[i];
            }
        }
        return out;
    }

    public static int[] append(int[] input, String data) {
        ArrayList asAList = new ArrayList<>();
        for(int element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        int[] out = new int[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Integer){
                out[i] = (int) subOutArr[i];
            }
        }
        return out;
    }

    public static long[] append(long[] input, String data) {
        ArrayList asAList = new ArrayList<>();
        for(long element : input){
            asAList.add(element);
        }
        asAList.add(input.length, data);
        Object[] subOutArr = asAList.toArray();
        long[] out = new long[subOutArr.length];
        for(int i = 0; i < subOutArr.length; i++){
            if(subOutArr[i] instanceof Long){
                out[i] = (long) subOutArr[i];
            }
        }
        return out;
    }

    public static <T> Object[] inflate(T[] input, int places) {
        ArrayList<T> asAList = new ArrayList<>(Arrays.asList(input));
        for (int i = 0; i < places; i++) {
            asAList.add(input.length + i, null);
        }
        return asAList.toArray();
    }

    public static boolean[] inflate(boolean[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(boolean element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,false);
        }
        Object[] testOut = asAList.toArray();
        boolean[] out = new boolean[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Boolean){
                out[a] = (boolean) testOut[a];
            }
        }
        return out;
    }

    public static char[] inflate(char[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(char element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        char[] out = new char[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Character){
                out[a] = (char) testOut[a];
            }
        }
        return out;
    }

    public static String[] inflate(String[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        asAList.addAll(Arrays.asList(input));
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        String[] out = new String[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof String){
                out[a] = (String) testOut[a];
            }
        }
        return out;
    }

    public static float[] inflate(float[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(float element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        float[] out = new float[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Float){
                out[a] = (float) testOut[a];
            }
        }
        return out;
    }

    public static double[] inflate(double[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(double element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        double[] out = new double[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Double){
                out[a] = (double) testOut[a];
            }
        }
        return out;
    }

    public static byte[] inflate(byte[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(byte element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        byte[] out = new byte[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Byte){
                out[a] = (byte) testOut[a];
            }
        }
        return out;
    }

    public static short[] inflate(short[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(short element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        short[] out = new short[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Short){
                out[a] = (short) testOut[a];
            }
        }
        return out;
    }

    public static int[] inflate(int[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(int element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        int[] out = new int[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Integer){
                out[a] = (int) testOut[a];
            }
        }
        return out;
    }

    public static long[] inflate(long[] input, int places) {
        ArrayList asAList = new ArrayList<>();
        for(long element : input){
            asAList.add(element);
        }
        for(int i = 0; i < places; i++){
            asAList.add(input.length + i,null);
        }
        Object[] testOut = asAList.toArray();
        long[] out = new long[testOut.length];
        for(int a = 0; a < testOut.length; a++){
            if(testOut[a] instanceof Long){
                out[a] = (long) testOut[a];
            }
        }
        return out;
    }

    public static <T> Object[] subArray(T[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        Object[] out = new Object[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static boolean[] subArray(boolean[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        boolean[] out = new boolean[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static char[] subArray(char[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        char[] out = new char[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static String[] subArray(String[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        String[] out = new String[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static float[] subArray(float[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        float[] out = new float[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static double[] subArray(double[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        double[] out = new double[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static byte[] subArray(byte[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        byte[] out = new byte[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static short[] subArray(short[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        short[] out = new short[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static int[] subArray(int[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        int[] out = new int[upperIndexExclusive - lowerIndexInclusive];
        for (int i = lowerIndexInclusive, a = 0; i < upperIndexExclusive; i++) {
            out[a++] = input[i];
        }
        return out;
    }

    public static long[] subArray(long[] input, int lowerIndexInclusive, int upperIndexExclusive) {
        long[] out = new long[upperIndexExclusive - lowerIndexInclusive];
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

    public static boolean[] join(boolean[] arr1, boolean[] arr2) {
        boolean[] out = new boolean[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static char[] join(char[] arr1, char[] arr2) {
        char[] out = new char[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static String[] join(String[] arr1, String[] arr2) {
        String[] out = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static float[] join(float[] arr1, float[] arr2) {
        float[] out = new float[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static double[] join(double[] arr1, double[] arr2) {
        double[] out = new double[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static byte[] join(byte[] arr1, byte[] arr2) {
        byte[] out = new byte[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static short[] join(short[] arr1, short[] arr2) {
        short[] out = new short[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static int[] join(int[] arr1, int[] arr2) {
        int[] out = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, out, 0, arr1.length);
        System.arraycopy(arr2, 0, out, arr1.length, arr2.length);
        return out;
    }

    public static long[] join(long[] arr1, long[] arr2) {
        long[] out = new long[arr1.length + arr2.length];
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

    public static <T> boolean contains(T[] input, Class criteria) {
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

    public static <T> int indexOf(T[] input, Class criteria) {
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