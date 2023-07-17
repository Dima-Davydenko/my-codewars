package codewars.b.seven.kyu;

/**
 * Return the first M multiples of N (7kyu)
 * Implement a function, multiples(m, n),
 * which returns an array of the first m multiples of the real number n.
 * Assume that m is a positive integer.
 * Ex.
 * multiples(3, 5.0)
 * should return
 * [5.0, 10.0, 15.0]
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
