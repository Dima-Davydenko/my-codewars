package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/5bdc191306a8a678f6000187/java">
 *     Shift Left (7kyu)</a>
 * <p>
 * You are given two strings. In a single move,
 * you can choose any of them, and delete the first (i.e. leftmost) character.
 * <p>
 * For Example:
 * <p>
 * By applying a move to the string "where", the result is the string "here".
 * <p>
 * By applying a move to the string "a", the result is an empty string "".
 * <p>
 * Implement a function that calculates the minimum number of moves
 * that should be performed to make the given strings equal.
 * <p>
 * Notes
 * <p>
 * Both strings consist of lowercase latin letters.
 * <p>
 * If the string is already empty, you cannot perform any more delete operations.
 */

public class ShiftLeft {
    public int calculateMoves(String word1, String word2) {
        int count = 0;
        int length = Math.min(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            if (word1.charAt(word1.length() - 1 - i) != word2.charAt(word2.length() - 1 - i)) {
                break;
            }
            count++;
        }
        return word1.length() - count + word2.length() - count;
    }
}
