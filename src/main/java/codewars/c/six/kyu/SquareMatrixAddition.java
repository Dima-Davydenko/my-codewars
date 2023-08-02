package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/matrix-addition/java">
 *     Matrix Addition (6kyu)</a>
 * <p>
 * Write a function that accepts two square matrices (N x N two dimensional arrays),
 * and return the sum of the two. Both matrices being passed into the function
 * will be of size N x N (square), containing only integers.
 */
public class SquareMatrixAddition {
    public int[][] addSquareMatrices(int[][] a, int[][] b) {
        StringBuilder builder = new StringBuilder();
        int length = a.length;
        int[][] c = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
