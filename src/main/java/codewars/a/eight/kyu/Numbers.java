package codewars.a.eight.kyu;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Formatting decimal places #0 (8kyu)
 *
 * Each number should be formatted that it is rounded to two decimal places.
 * You don't need to check whether the input is a valid number
 * because only valid numbers are used in the tests.
 *
 * Example:
 * 5.5589 is rounded 5.56
 * 3.3424 is rounded 3.34
 */

public class Numbers {
    public double twoDecimalPlaces(double number) {
        BigDecimal bd = BigDecimal.valueOf(number);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
