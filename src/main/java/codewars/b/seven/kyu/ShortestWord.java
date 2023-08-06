package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/solutions/java">
 *     Shortest Word (7kyu)</a>
 * <p>
 * Simple, given a string of words, return the length of the shortest word(s).
 * <p>
 * String will never be empty and you do not need to account for different data types.
 */

public class ShortestWord {
    public int findShortest(String string) {
        int length = string.length();
        String[] words = string.split(" ");
        for (String word : words) {
            if (word.length() < length) {
                length = word.length();
            }
        }
        return length;
    }
}
