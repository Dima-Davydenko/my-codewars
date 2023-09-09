package codewars.b.seven.kyu;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/51f41b98e8f176e70d0002a8/train/java">
 *     Sort arrays (7kyu)</a>
 * Just a simple sorting usage.
 * Create a function that returns the elements of the input-array
 * / list sorted in lexicographical order.
 */

public class SortArrays {
    public static <T> T[] sortArrays(T[] names) {
        Arrays.sort(names);
        return names;
    }

    public static int[] sortArrays(int[] names) {
        Arrays.sort(names);
        return names;
    }

    public static double[] sortArrays(double[] names) {
        Arrays.sort(names);
        return names;
    }

    public static long[] sortArrays(long[] names) {
        Arrays.sort(names);
        return names;
    }

    public static float[] sortArrays(float[] names) {
        Arrays.sort(names);
        return names;
    }
}
