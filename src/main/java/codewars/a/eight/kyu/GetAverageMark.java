package codewars.a.eight.kyu;

import java.util.stream.IntStream;

/**
 * Get the mean of an array (8kyu)
 *
 * It's the academic year's end, fateful moment of your school report.
 * The averages must be calculated.
 * All the students come to you and entreat you to calculate their average for them.
 * You just need to write a script.
 *
 * Return the average of the given array rounded down to its nearest integer.
 *
 * The array will never be empty.
 */

public class GetAverageMark {
    public int getAverageMark(int[] marks) {
        return IntStream.of(marks).sum() / marks.length;
    }
}
