package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/525f47c79f2f25a4db000025/solutions/java">
 *     Valid Phone Number (6kyu)</a>
 * <p>
 * Write a function that accepts a string, and returns true if it is in the form of a phone number.
 * Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
 * <p>
 * Only worry about the following format:
 * (123) 456-7890 (don't forget the space after the close parentheses)
 * <p>
 * Examples:
 * <p>
 * "(123) 456-7890"  => true
 * <p>
 * "(1111)555 2345"  => false
 * <p>
 * "(098) 123 4567"  => false
 */

public class PhoneNumber {
    public static boolean isValid(String phoneNumber) {
        return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }
}
