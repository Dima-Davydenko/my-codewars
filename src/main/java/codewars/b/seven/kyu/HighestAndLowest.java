package codewars.b.seven.kyu;

import java.util.Arrays;

/**
 * <a href="https://www.codewars.com/kata
 * /554b4ac871d6813a03000035">Highest and Lowest (7kyu)</a><p>
 * In this little assignment you are given a string of space separated numbers,
 * and have to return the highest and lowest number.<p>
 * Examples <p>
 * highAndLow("1 2 3 4 5")  // return "5 1"<p>
 * highAndLow("1 2 -3 4 5") // return "5 -3"<p>
 * highAndLow("1 9 3 4 -5") // return "9 -5"<p>
 * Notes<p>
 * All numbers are valid Int32, no need to validate them.<p>
 * There will always be at least one number in the input string.<p>
 * Output string must be two numbers separated by a single space, and highest number is first.<p>
 */

public class HighestAndLowest {
    public String highAndLow(String numbers) {
        StringBuilder builder = new StringBuilder();
        String[] numbersArray = numbers.split(" ");
        Integer max = Arrays.stream(numbersArray)
                .map(Integer::valueOf)
                .max(Integer::compare)
                .get();
        Integer min = Arrays.stream(numbersArray)
                .map(Integer::valueOf)
                .min(Integer::compare)
                .get();
        return builder.append(max)
                .append(" ")
                .append(min)
                .toString();
    }
}
