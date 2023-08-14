package codewars.d.five.kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/55c6126177c9441a570000cc">
 *     Weight for weight</a>
 * <p>
 * My friend John and I are members of the "Fat to Fit Club (FFC)".
 * John is worried because each month a list with the weights of members
 * is published and each month he is the last on the list which means he is the heaviest.
 * <p>
 * I am the one who establishes the list so I told him: "Don't worry any more,
 * I will modify the order of the list". It was decided to attribute a "weight" to numbers.
 * The weight of a number will be from now on the sum of its digits.
 * <p>
 * For example 99 will have "weight" 18, 100 will have "weight" 1
 * so in the list 100 will come before 99.
 * <p>
 * Given a string with the weights of FFC members in normal order
 * can you give this string ordered by "weights" of these numbers?
 * <p>
 * Example: <p>
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
 * <p>
 * "100 180 90 56 65 74 68 86 99"
 * <p>
 * When two numbers have the same "weight", let us class them
 * as if they were strings (alphabetical ordering) and not numbers:
 * <p>
 * 180 is before 90 since, having the same "weight" (9), it comes before as a string.
 * <p>
 * All numbers in the list are positive numbers and the list can be empty.
 * <p>
 * Notes
 * <p>
 * it may happen that the input string have leading, trailing whitespaces
 * and more than a unique whitespace between two consecutive numbers
 * <p>
 * For C: The result is freed.
 */

public class WeightSort {
    public static String orderWeights(String weights) {
        String[] numbers = weights.trim().split("\\s+");

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String number1, String number2) {
                int comparedNumbers = Integer.compare(findWight(number1), findWight(number2));
                if (comparedNumbers != 0) {
                    return comparedNumbers;
                }
                return number1.compareTo(number2);
            }
        };

        List<String> list = new ArrayList<>();
        Collections.addAll(list, numbers);
        list.sort(stringComparator);
        return String.join(" ", list);
    }

    private static int findWight(String number) {
        String[] digits = number.split("");
        return Arrays.stream(digits).mapToInt(Integer::parseInt).sum();
    }
}
