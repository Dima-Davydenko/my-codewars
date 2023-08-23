package codewars.b.seven.kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codewars.com/kata/5b39e3772ae7545f650000fc/solutions/java">
 *     Remove duplicate words (7kyu)</a>
 * <p>
 * Your task is to remove all duplicate words from a string,
 * leaving only single (first) words entries.
 * <p>
 * Example:
 * <p>
 * Input:
 * <p>
 * 'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'
 * <p>
 * Output:
 * <p>
 * 'alpha beta gamma delta'
 */

public class Words {
    public static String removeDuplicates(String text) {
        return Arrays.stream(text.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}
