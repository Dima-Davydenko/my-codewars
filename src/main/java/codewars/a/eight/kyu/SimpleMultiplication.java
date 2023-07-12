package codewars.a.eight.kyu;

/**
 * Simple multiplication (8kyu)
 *
 * This kata is about multiplying a given number by eight
 * if it is an even number and by nine otherwise.
 */

public class SimpleMultiplication {
    public int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }
}
