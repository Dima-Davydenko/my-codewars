package codewars.a.eight.kyu;

/**
 * <a href="https://www.codewars.com/kata/59fca81a5712f9fa4700159a">
 *     Convert to Binary (8kyu)</a>
 * <p>
 * Given a non-negative integer n.
 * <p>
 * Write a function to_binary/ToBinary which returns that number in a binary format.
 * <p>
 * to_binary(1) ->   should return 1
 * <p>
 * to_binary(5) ->   should return 101
 * <p>
 * to_binary(11) ->  should return 1011
 */

public class BinaryCode {
    public int toBinary(int num) {
        int multiplier = 1;
        int value = 0;
        do {
            value += (num % 2) * multiplier;
            num /= 2;
            multiplier *= 10;
        } while (num > 0);
        return value;
    }
}
