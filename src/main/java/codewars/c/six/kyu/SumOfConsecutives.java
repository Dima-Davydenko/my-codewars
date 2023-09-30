package codewars.c.six.kyu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/55eeddff3f64c954c2000059/solutions/java">
 *     Sum consecutives</a>
 * <p>
 * You are given a list/array which contains only integers (positive and negative).
 * Your job is to sum only the numbers that are the same and consecutive.
 * The result should be one list.
 * <p>
 * Extra credit if you solve it in one line.
 * You can assume there is never an empty list/array and there will always be an integer.
 * <p>
 * Same meaning: 1 == 1
 * <p>
 * 1 != -1
 * <p>
 * #Examples:
 * <p>
 * [1,4,4,4,0,4,3,3,1] # should return [1,12,0,4,6,1]
 * <p>
 * So as you can see sum of consecutives 1 is 1
 * <p>
 * sum of 3 consecutives 4 is 12
 * <p>
 * sum of 0... and sum of 2
 * <p>
 * consecutives 3 is 6 ...
 * <p>
 * [1,1,7,7,3] # should return [2,14,3]
 * <p>
 * [-5,-5,7,7,12,0] # should return [-10,14,12,0]
 */

public class SumOfConsecutives {
    public static List<Integer> getSumConsecutives(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        List<Integer> newList = new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();
        int next;
        int prev = list.get(0);
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            next = list.get(i);
            if (prev == next) {
                count++;
            }
            if (prev != next) {
                newList.add(prev * count);
                prev = next;
                count = 1;
            }
            if (i == list.size() - 1 && count > 1) {
                newList.add(prev * count);
            }
            if (i == list.size() - 1 && count == 1) {
                newList.add(next);
            }
        }
        return newList;
    }
}
