package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/solutions/java">
 *     Message Validator (6kyu)</a>
 * <p>
 *In this kata, you have an input string and you should check whether it is a valid message.
 * To decide that, you need to split the string by the numbers,
 * and then compare the numbers with the number of characters in the following substring.
 * <p>
 * For example "3hey5hello2hi" should be split into 3, hey, 5, hello, 2,
 * hi and the function should return true, because "hey" is 3 characters,
 * "hello" is 5, and "hi" is 2; as the numbers and the character counts match,
 * the result is true.
 * <p>
 * Notes:
 * <p>
 * Messages are composed of only letters and digits
 * Numbers may have multiple digits: e.g. "4code13hellocodewars" is a valid message
 * Every number must match the number of character in the following substring,
 * otherwise the message is invalid: e.g. "hello5" and "2hi2" are invalid
 * If the message is an empty string, you should return true
 */

public class MessageValidator {
    public static boolean isValidMessage(String message) {
        String[] letters = message.split("\\d++");
        String[] digits = message.split("\\D++");
        if (message.length() == 0 || message.equals("0")) {
            return true;
        }
        if (digits.length >= letters.length || !message.matches("^\\d.++")) {
            return false;
        }
        for (int i = 0; i < digits.length; i++) {
            if (Integer.parseInt(digits[i]) != letters[i + 1].length()) {
                return false;
            }
        }
        return true;
    }
}
