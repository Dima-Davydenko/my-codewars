package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/reverse-words/java">Reverse words (7kyu)</a>
 * <p>
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 * <p>
 * Examples
 * <p>
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * <p>
 * "double  spaces"      ==> "elbuod  secaps"
 */

public class ReverseWords {
    public String reverseWords(final String string) {
        StringBuilder wordBuilder = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = string.toCharArray();
        for (char symbol : chars) {
            if (symbol == ' ') {
                stringBuilder.append(wordBuilder.reverse());
                stringBuilder.append(symbol);
                wordBuilder = new StringBuilder();
            } else {
                wordBuilder.append(symbol);
            }
        }
        return stringBuilder.append(wordBuilder.reverse()).toString();
    }
}
