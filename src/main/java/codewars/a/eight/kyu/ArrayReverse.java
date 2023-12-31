package codewars.a.eight.kyu;

/**
 * <a href="https://www.codewars.com/kata/5583090cbe83f4fd8c000051">
 *     Convert number to reversed array of digits (8kyu)</a>
 * <p>
 * Given a random non-negative number,
 * you have to return the digits of this number within an array in reverse order.
 * <p>
 * Example(Input => Output):<p>
 * 35231 => [1,3,2,5,3]<p>
 * 0 => [0]
 */

public class ArrayReverse {
    public static int[] toReversedArray(long number) {
        char[] numbers = String.valueOf(number).toCharArray();
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = Character.getNumericValue(numbers[numbers.length - i - 1]);
        }
        return reversedNumbers;
    }
}
