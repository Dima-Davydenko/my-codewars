package codewars.retired;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/5c55ad8c9d76d41a62b4ede3/java">
 *     Find all pairs (retired)</a>
 * <p>
 * You are given array of integers, your task will be to count
 * all pairs in that array and return their count.
 * <p>
 * Notes:
 * <p>
 * Array can be empty or contain only one value; in this case return 0
 * If there are more pairs of a certain number, count each pair only once.
 * E.g.: for [0, 0, 0, 0] the return value is 2 (= 2 pairs of 0s)
 * Random tests: maximum array length is 1000, range of values in array is between 0 and 1000
 * <p>
 * Examples
 * <p>
 * [1, 2, 5, 6, 5, 2]  -->  2
 * <p>
 * ...because there are 2 pairs: 2 and 5
 * <p>
 * [1, 2, 2, 20, 6, 20, 2, 6, 2]  -->  4
 * <p>
 * ...because there are 4 pairs: 2, 20, 6 and 2 (again)
 */

public class Pairs {
    public static int findPairs(int[] nums) {
        int numberOfPairs = 0;
        int count;
        int[] uniqNums = Arrays.stream(nums).distinct().toArray();
        for (int uniqNum : uniqNums) {
            count = 0;
            for (int num : nums) {
                if (uniqNum == num) {
                    count++;
                }
            }
            numberOfPairs = numberOfPairs + count / 2;
        }
        return numberOfPairs;
    }
}
