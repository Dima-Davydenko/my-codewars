package codewars.retired;

import java.util.Arrays;

/**
 * Реалізуй метод findMajor(), який приймає масив цілих чисел nums
 * з довжиною n і повертає його мажоритарний елемент - це елемент,
 * який зустрічається в масиві більш ніж [n / 2⌋ раз.
 * <p>
 * Можеш не хвилюватися, мажоритарний елемент завжди існує в масиві!
 * <p>
 * Приклади:
 * <p>
 * findMajor([7, 6, 7]) ==> 7
 * findMajor([2, 2, 1, 1, 2, 1, 2]) ==> 2
 */

public class MajorityElement {
    public static int findMajor(int[] nums) {
        int[] digits = Arrays.stream(nums).distinct().toArray();
        int count = 0;
        for (int digit : digits) {
            for (int num : nums) {
                if (digit == num) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return digit;
            }
            count = 0;
        }
        return -1;
    }
}
