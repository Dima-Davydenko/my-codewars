package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/559536379512a64472000053">
 *     Playing with passphrases (6 kyu)</a>
 * <p>
 * Given a text in capital letters including or not digits and non alphabetic characters,
 * <p>
 * shift each letter by a given number but the transformed letter must be a letter (circular shift),
 * replace each digit by its complement to 9,
 * keep such as non alphabetic and non digit characters,
 * downcase each letter in odd position, upcase each letter in even position
 * (the first character is in position 0),
 * reverse the whole result.
 * <p>
 * Example:
 * <p>
 * your text: "BORN IN 2015!", shift 1
 * <p>
 * 1 + 2 + 3 -> "CPSO JO 7984!"
 * <p>
 * 4 "CpSo jO 7984!"
 * <p>
 * 5 "!4897 Oj oSpC"
 */

public class Passphrase {
    public static String createPassphrase(String phrase, int shift) {
        char[] chars = phrase.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char symbol;
            if (Character.isAlphabetic(chars[i])) {
                symbol = shiftLetter(chars[i], shift);
                if (i % 2 == 1) {
                    symbol = Character.toLowerCase(symbol);
                }
                builder.append(symbol);
                continue;
            }
            if (Character.isDigit(chars[i])) {
                builder.append('9' - chars[i]);
                continue;
            }
            builder.append(chars[i]);
        }
        return builder.reverse().toString();
    }

    private static char shiftLetter(char letter, int shift) {
        if (letter + shift > 'Z') {
            return (char) ('A' - 1 + letter + shift - 'Z');
        }
        return (char) (letter + shift);
    }
}
