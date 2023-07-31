package codewars.b.seven.kyu;

import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/disarium-number-special-numbers-series-number-3/java">
 *     Disarium Number (7kyu)</a>
 * Disarium number is the number that The sum of its digits powered with their respective positions
 * is equal to the number itself.
 * <p>
 * Task<p>
 * Given a number, Find if it is Disarium or not.
 * <p>
 * Notes<p>
 * Number passed is always Positive.<p>
 * Return the result as String<p>
 * Input >> Output Examples<p>
 * disariumNumber(89) ==> true<p>
 * Explanation:<p>
 * Since , 81 + 92 = 89 , thus output is true<p>
 * disariumNumber(564) ==> return false<p>
 * Explanation:<p>
 * Since , 51 + 62 + 43 = 105 != 564 , thus output is false
 */
public class Disarium {
    public String isDisarium(int number) {
        char[] digits = String.valueOf(number).toCharArray();
        return IntStream.range(0, digits.length)
                .map(i -> (int) Math.pow(digits[i] - 48, i + 1))
                .sum() == number ? "Disarium !!" : "Not !!";
    }
}
