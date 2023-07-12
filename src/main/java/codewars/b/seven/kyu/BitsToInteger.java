package codewars.b.seven.kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * Reverse the bits in an integer (7kyu)
 *
 * Write a function that reverses the bits in an integer.
 *
 * For example, the number 417 is 110100001 in binary.
 * Reversing the binary is 100001011 which is 267.
 *
 * You can assume that the number is not negative.
 */

public class BitsToInteger {
    public int reverseBitsToInteger(int number) {
        List<Integer> list = new ArrayList<>();
        int reverseNumber = 0;
        while (number != 0) {
            list.add(number % 2);
            number = number / 2;
        }
        for (int i = 0; i < list.size(); i++) {
            reverseNumber = reverseNumber + (int) Math.pow(2.0, i) * list.get(list.size() - 1 - i);
        }
        return reverseNumber;
    }
}
