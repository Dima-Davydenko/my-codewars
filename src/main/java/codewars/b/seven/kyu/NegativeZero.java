package codewars.b.seven.kyu;

import java.util.Objects;

/**
 * <a href="https://www.codewars.com/kata/5c5086287bc6600001c7589a">
 *     Is It Negative Zero (-0)? (7kyu)</a>
 * <p>
 * There exist two zeroes: +0 (or just 0) and -0.
 * <p>
 * Write a function that returns true if the input number is -0 and false otherwise
 * (True and False for Python).
 * <p>
 * In JavaScript / TypeScript / Coffeescript the input will be a number.
 * <p>
 * In Python / Java / C / NASM / Haskell / the input will be a float.
 */

public class NegativeZero {
    public static boolean isNegativeZero(float n) {
        return Objects.equals(n, -0.0);
    }
}
