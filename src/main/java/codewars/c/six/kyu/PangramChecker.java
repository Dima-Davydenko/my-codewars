package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/545cedaa9943f7fe7b000048/solutions/java">
 *     Detect Pangram (6kyu)</a>
 * <p>
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * <p>
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 * <p>
 * Given a string, detect whether or not it is a pangram.
 * Return True if it is, False if not. Ignore numbers and punctuation.
 */

public class PangramChecker {
    public boolean isPangram(String sentence) {
        String string = sentence.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if (!string.contains(String.valueOf(alphabet.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
