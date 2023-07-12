package codewars.a.eight.kyu;

/**
 * Convert to Binary (8kyu)
 *
 * Given a non-negative integer n.
 * Write a function to_binary/ToBinary which returns that number in a binary format.
 *
 * to_binary(1) ->   should return 1
 * to_binary(5) ->   should return 101
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
