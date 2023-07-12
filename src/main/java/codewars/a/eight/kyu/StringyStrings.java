package codewars.a.eight.kyu;

/**
 * Stringy Strings (8kyu)
 * write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.
 * the string should start with a 1.
 * a string with size 6 should return :'101010'.
 * with size 4 should return : '1010'.
 * with size 12 should return : '101010101010'.
 * The size will always be positive and will only use whole numbers.
 */

public class StringyStrings {
    public String stringy(int size) {
        StringBuilder builder = new StringBuilder(size);
        for (int i = 1; i < size + 1; i++) {
            builder.append(i & 1);
        }
        return builder.toString();
    }
}
