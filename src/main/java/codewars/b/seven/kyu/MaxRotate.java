package codewars.b.seven.kyu;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/56a4872cbb65f3a610000026">
 *     Rotate for a Max (7kyu)</a>
 * <p>
 * Let us begin with an example:
 * <p>
 * Take a number: 56789. Rotate left, you get 67895.
 * <p>
 * Keep the first digit in place and rotate left the other digits: 68957.
 * <p>
 * Keep the first two digits in place and rotate the other ones: 68579.
 * <p>
 * Keep the first three digits and rotate left the rest: 68597.
 * Now it is over since keeping the first four
 * it remains only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * <p>
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * <p>
 * and you must return the greatest: 68957.
 * <p>
 * Task
 * <p>
 * Write function max_rot(n) which given a positive integer n
 * returns the maximum number you got doing rotations similar to the above example.
 * <p>
 * So max_rot (or maxRot or ... depending on the language) is such as:
 * <p>
 * max_rot(56789) should return 68957
 * <p>
 * max_rot(38458215) should return 85821534
 */

public class MaxRotate {
    public static long getMaxRotations(long number) {
        long max = number;
        char[] chars = String.valueOf(number).toCharArray();
        List<String> list = IntStream.range(0, chars.length)
                .mapToObj(i -> Character.toString(chars[i]))
                .collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            list.add(list.remove(i));
            long rotatedNumber = Long.parseLong(String.join("", list));
            if (max < rotatedNumber) {
                max = rotatedNumber;
            }
        }
        return max;
    }
}
