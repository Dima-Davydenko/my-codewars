package codewars.c.six.kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codewars.com/kata/5ce399e0047a45001c853c2b">
 *     Sums of Parts (6kyu)</a>
 * <p>
 * Let us consider this example (array written in general format):
 * <p>
 * ls = [0, 1, 3, 6, 10]
 * <p>
 * Its following parts:
 * <p>
 * ls = [0, 1, 3, 6, 10]<p>
 * ls = [1, 3, 6, 10]<p>
 * ls = [3, 6, 10]<p>
 * ls = [6, 10]<p>
 * ls = [10]<p>
 * ls = []<p>
 * The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
 * <p>
 * The function parts_sums (or its variants in other languages)
 * <p>
 * will take as parameter a list ls and return a list of the sums of its parts as defined above.
 */

public class SumOfParts {
    public static int[] getSumOfParts(int[] nums) {
        List<Integer> sums = new ArrayList<>();
        List<Integer> numsList = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        while (numsList.size() != 0) {
            sums.add(numsList.stream().mapToInt(i -> (int) i).sum());
            numsList.remove(0);
        }
        sums.add(0);
        return sums.stream().mapToInt(i -> (int) i).toArray();
    }
}
