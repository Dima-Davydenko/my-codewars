package codewars.a.eight.kyu;

/**
 * Remove First and Last Character (8kyu)
 *
 * It's pretty straightforward.
 * Create a function that removes the first and last characters of a string.
 * You're given one parameter, the original string.
 * You don't have to worry with strings with less than two characters.
 */

public class RemoveChars {
    public String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
