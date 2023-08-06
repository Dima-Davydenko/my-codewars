package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/automorphic-number-special-numbers-series-number-6/java">
 *     Automorphic Number (7kyu)</a>
 * <p>
 * A number is called Automorphic number if
 * and only if its square ends in the same digits as the number itself.
 * <p>
 * Given a number determine if it Automorphic or not .
 * <p>
 * The number passed to the function is positive
 * <p>
 * autoMorphic (25) -->> return "Automorphic"
 * <p>
 * Explanation: <p>
 * 25 squared is 625 , Ends with the same number's digits which are 25 .
 * <p>
 * autoMorphic (13) -->> return "Not!!"
 * <p>
 * Explanation:<p>
 * 13 squared is 169 , Not ending with the same number's digits which are 69 .
 */

public class AutomorphicNumber {
    public String detectAutomorphic(int number) {
        String regNumber = String.valueOf(number);
        String powNumber = String.valueOf(number * number);
        return powNumber.endsWith(regNumber) ? "Automorphic" : "Not!!";
    }
}
