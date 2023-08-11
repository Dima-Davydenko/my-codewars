package codewars.c.six.kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/55031bba8cba40ada90011c4">
 *     Hidden "Cubic" numbers (6kyu)</a>
 * <p>
 * We search non-negative integer numbers, with at most 3 digits,
 * such as the sum of the cubes of their digits is the number itself;
 * we will call them "cubic" numbers.
 * <p>
 * 153 is such a "cubic" number : 1^3 + 5^3 + 3^3 = 153
 * These "cubic" numbers of at most 3 digits are easy to find, even by hand,
 * so they are "hidden" with other numbers and characters in a string.
 * <p>
 * The task is to find, or not, the "cubic" numbers in the string
 * and then to make the sum of these "cubic" numbers found in the string,
 * if any, and to return a string such as:
 * <p>
 * "number1 number2 (and so on if necessary) sumOfCubicNumbers Lucky"
 * if "cubic" numbers number1, number2, ... were found.
 * <p>
 * The numbers in the output are to be in the order
 * in which they are encountered in the input string.
 * <p>
 * If no cubic numbers are found return the string: `"Unlucky"``.
 * <p>
 * Examples:
 * <p>
 *  - s = "aqdf&0#1xyz!22[153(777.777"<p>
 *    the groups of at most 3 digits are 0 and 1 (one digit),
 *    22 (two digits), 153, 777, 777 (3 digits)<p>
 *    Only 0, 1, 153 are cubic and their sum is 154<p>
 *    Return: "0 1 153 154 Lucky"
 * <p>
 * - s = "QK29a45[&erui9026315"<p>
 *   the groups are 29, 45, 902, 631, 5. None is cubic.<p>
 *   Return: "Unlucky"<p>
 * Notes<p>
 * In the string "001234" where 3 digits or more follow each other
 * the first group to examine is "001" and the following is "234".
 * If a packet of at most three digits has been taken, whether or not "cubic",
 * it's over for that packet.
 * <p>
 * When a continuous string of digits exceeds 3,
 * the string is split into groups of 3 from the left.
 * The last grouping could have 3, 2 or 1 digits.
 * <p>
 * e.g "24172410" becomes 3 strings comprising "241", "724" and "10"
 * <p>
 * e.g "0785" becomes 2 strings comprising "078" and "5".
 */

public class CubicNumbers {
    public String findCubicNumbers(String string) {
        int sumCub = 0;
        String[] digits = string.split("\\D");
        List<String> allDigits = new ArrayList<>();
        List<String> cubicDigits = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i].length() < 4 && digits[i].length() > 0) {
                allDigits.add(digits[i]);
            } else if (digits[i].length() > 3) {
                allDigits.addAll(divideInThree(digits[i], 3));
            }
        }
        for (int i = 0; i < allDigits.size(); i++) {
            if (isCubic(allDigits.get(i))) {
                sumCub = sumCub + Integer.parseInt(allDigits.get(i));
                cubicDigits.add(allDigits.get(i));
            }
        }
        return !cubicDigits.isEmpty()
                ? String.join(" ", cubicDigits) + " " + sumCub + " Lucky"
                : "Unlucky";
    }

    public List<String> divideInThree(String s, int chunkSize) {
        List<String> chunks = new ArrayList<>();
        for (int i = 0; i < s.length(); i += chunkSize) {
            chunks.add(s.substring(i, Math.min(s.length(), i + chunkSize)));
        }
        return chunks;
    }

    public boolean isCubic(String number) {
        int sum = 0;
        if (!number.isBlank()) {
            for (int i = 0; i < number.length(); i++) {
                int digit = number.charAt(i) - '0';
                sum = sum + digit * digit * digit;
            }
        }
        return sum == Integer.parseInt(number);
    }
}
