package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/special-number-special-numbers-series-number-5/java">
 *     Special Number (7kyu)</a>
 * <p>
 * number is a Special Number if it’s digits only consist 0, 1, 2, 3, 4 or 5
 * <p>
 * Given a number determine if it special number or not .
 */

public class SpecialNumber {
    public String isSpecialNumber(int number) {
        String num = String.valueOf(number);
        for (int i = 0; i < 6; i++) {
            num = num.replaceAll(String.valueOf(i), "");
        }
        return num.isEmpty() ? "Special!!" : "NOT!!";
    }
}
