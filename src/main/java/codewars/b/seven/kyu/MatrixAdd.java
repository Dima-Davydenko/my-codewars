package codewars.b.seven.kyu;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata/58bc8304b238c8e29b0000f6/solutions/java">
 *     Matrix Addition of Elements (7kyu)</a>
 * <p>
 * As the name suggests you just have to add all the elements of the matrix
 * and output a single Integer.
 * <p>
 * Matrix can be of any size, not necessarily a square matrix.
 * <p>
 * Matrix can have negative elements as well.
 * <p>
 * Method should take an input 2-Dimentional Array.
 * <p>
 * Constraints
 * <p>
 * 1 <= rows, columns < 20
 * <p>
 * -100 <= elements <= 100
 * <p>
 * Example
 * <p>
 * SumOfElements({{1,0},{0,1}}) should return 2.
 * <p>
 * SumOfElements({{7,9},{3,6}}) should return 25.
 */

public class MatrixAdd {
    public int getSumOfElements(int[][] matrix) {
        int i = 0;
        for (int[] ints : matrix) {
            i = Arrays.stream(ints).sum() + i;
        }
        return i;
    }
}
