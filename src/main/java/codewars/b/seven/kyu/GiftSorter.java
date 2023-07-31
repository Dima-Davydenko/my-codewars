package codewars.b.seven.kyu;

import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/sort-the-gift-code/java">
 *     Sort the Gift Code (7kyu)</a>
 * <p>
 * Write a function called sortGiftCode
 * that accepts a string containing up to 26 unique alphabetical characters,
 * and returns a string containing the same characters in alphabetical order.
 * <p>
 * Examples (Input -- => Output):
 * <p>
 * "abcdef"                      -- => "abcdef"
 * <p>
 * "pqksuvy"                     -- => "kpqsuvy"
 * <p>
 * "zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"
 */

public class GiftSorter {
    public String sortGiftCode(String code) {
        String[] letters = IntStream.range(0, code.length())
                .mapToObj(i -> String.valueOf(code.charAt(i)))
                .sorted()
                .toArray(String[]::new);
        return String.join("", letters);
    }
}
