package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/55908aad6620c066bc00002a/solutions/java">
 *     Exes and Ohs (7kyu)</a>
 * <p>
 * Check to see if a string has the same amount of 'x's and 'o's.
 * The method must return a boolean and be case insensitive. The string can contain any char.
 */

public class ExesAndOhs {
    public boolean isTheSameAmountOfXO(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            char letter = Character.toLowerCase(string.charAt(i));
            if (letter == 'x') {
                counter++;
            } else if (letter == 'o') {
                counter--;
            }
        }
        return counter == 0;
    }
}
