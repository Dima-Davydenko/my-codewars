package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/5bdcd20478d24e664d00002c/java">
 *     Separate The Wheat From The Chaff (6kyu)</a>
 */

public class WheatAndChaff {
    public static long[] separateWheatFromChaff(long[] nums) {

        long positive;
        long negative;
        int count;
        for (int i = 0; i < nums.length; i++) {
            positive = 0;
            negative = 0;
            count = 0;
            if (nums[i] > 0) {
                positive = nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] < 0) {
                        negative = nums[j];
                        count = j;
                    }
                }
                if (negative != 0) {
                    nums[i] = negative;
                    nums[count] = positive;
                } else {
                    nums[i] = positive;
                }
            }
        }
        return nums;
    }
}
