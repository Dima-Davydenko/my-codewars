package codewars.b.seven.kyu;

import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/525e5a1cb735154b320002c8">
 *     Triangular Treasure (7kyu)</a>
 * <p>
 * Triangular numbers are so called because of the equilateral triangular shape
 * that they occupy when laid out as dots. i.e.
 * <p>
 * 1st (1)   2nd (3)    3rd (6)
 * *          **        ***
 *            *         **
 *                      *
 * You need to return the nth triangular number. You should return 0 for out of range values:
 * <p>
 * For example: (Input --> Output)
 * <p>
 * 0 --> 0<p>
 * 2 --> 3<p>
 * 3 --> 6<p>
 * -10 --> 0<p>
 */

public class Triangular {
    public static int getTriangular(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }
}
