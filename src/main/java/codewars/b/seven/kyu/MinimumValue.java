package codewars.b.seven.kyu;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codewars.com/kata/form-the-minimum/java">Form The Minimum (7kyu)</a>
 * <p>
 * Given a list of digits, return the smallest number that could be formed from these digits,
 * using the digits only once (ignore duplicates).
 * <p>
 * Notes:<p>
 * Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
 * <p>
 * Input >> Output Examples<p>
 * minValue ({1, 3, 1})  ==> return (13)<p>
 * Explanation:<p>
 * (13) is the minimum number could be formed from {1, 3, 1},
 * Without duplications
 *<p>
 * minValue({5, 7, 5, 9, 7})  ==> return (579)<p>
 * Explanation:<p>
 * (579) is the minimum number could be formed from {5, 7, 5, 9, 7},
 * Without duplications
 *<p>
 * minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
 * <p>
 * Explanation:<p>
 * (134679) is the minimum number could be formed from {1, 9, 3, 1, 7, 4, 6, 6, 7},
 * <p>Without duplications
 */

public class MinimumValue {
    public int getMinValue(int[] nums) {
        Set<Integer> numbers = new TreeSet<>();
        for (int num : nums) {
            numbers.add(num);
        }
        String number = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return Integer.parseInt(number);
    }
}
