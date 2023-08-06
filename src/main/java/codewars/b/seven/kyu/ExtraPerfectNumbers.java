package codewars.b.seven.kyu;

import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/5a662a02e626c54e87000123/solutions/java">
 *     Extra Perfect Numbers (7kyu)</a>
 * <p>
 * Extra perfect number is the number that first and last bits are set bits.
 * <p>
 * Given a positive integer N , Return the extra perfect numbers in range from 1 to N .
 * <p>
 * Number passed is always Positive .
 * <p>
 * Returned array/list should contain the extra perfect numbers in ascending order
 * from lowest to highest
 */

public class ExtraPerfectNumbers {
    public int[] getExtraPerfectNumbers(int number) {
        return IntStream.rangeClosed(0, number)
                .filter(i -> i % 2 != 0)
                .toArray();
    }
}
