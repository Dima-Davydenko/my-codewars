package codewars.e.four.kyu;

import java.util.Arrays;

/**
 * Next bigger number with the same digits (4kyu)
 *
 * Create a function that takes a positive integer and returns the next bigger number
 * that can be formed by rearranging its digits.
 * For example:
 * 12 ==> 21
 * 513 ==> 531
 * 2017 ==> 2071
 * If the digits can't be rearranged to form a bigger number, return -1
 * (or nil in Swift, None in Rust):
 * 9 ==> -1
 * 111 ==> -1
 * 531 ==> -1
 */

public class NextBiggerNumber {
    public long getNextBiggerNumber(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        for (int i = digits.length - 2; i >= 0; i--) {
            for (int j = digits.length - 1; j > i; j--) {
                if (digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                    Arrays.sort(digits, i + 1, digits.length);
                    return Long.valueOf(String.valueOf(digits));
                }
            }
        }
        return -1L;
    }
}
