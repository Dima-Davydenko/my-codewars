package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/5b728f801db5cec7320000c7/solutions/java">
 *     Simple letter removal (7kyu)</a>
 * <p>
 * You will be given a lower case string and your task will be to remove n characters
 * from that string using the following rule:
 * <p>
 * - first remove all letter 'a', followed by letter 'b', then 'c', etc...
 * <p>
 * - remove the leftmost character first.
 * <p>
 * For example:
 * <p>
 * solve('abracadabra', 1) = 'bracadabra' # remove the leftmost 'a'.
 * <p>
 * solve('abracadabra', 2) = 'brcadabra'  # remove 2 'a' from the left.
 * <p>
 * solve('abracadabra', 6) = 'rcdbr'      # remove 5 'a', remove 1 'b'
 * <p>
 * solve('abracadabra', 8) = 'rdr'
 * <p>
 * solve('abracadabra',50) = ''
 */

public class LetterRemoval {
    public static String removeLetter(String string, int n) {
        String letter = "a";
        while (n != 0 && !string.isEmpty()) {
            if (string.contains(letter)) {
                string = string.replaceFirst(letter, "");
                n--;
            } else {
                letter = Character.toString(letter.charAt(0) + 1);
            }
        }
        return string;
    }
}
