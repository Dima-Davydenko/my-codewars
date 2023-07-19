package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/593c9175933500f33400003e">
 *     Return the first M multiples of N (7kyu)</a>
 * <p>
 * Implement a function, multiples(m, n),
 * which returns an array of the first m multiples of the real number n.
 * Assume that m is a positive integer.
 * <p>
 * Ex.<p>
 * multiples(3, 5.0)<p>
 * should return<p>
 * [5.0, 10.0, 15.0]<p>
 */

public class MultiplesOfNumber {
    public int[] getMultiples(int m, int n) {
        int[] numbers = new int[m];
        for (int i = 0; i < m; i++) {
            numbers[i] = n * (i + 1);
        }
        return numbers;
    }
}
