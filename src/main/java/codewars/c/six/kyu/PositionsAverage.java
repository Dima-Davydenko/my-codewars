package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/59f4a0acbee84576800000af/solutions/java">
 *     Positions Average (6kyu)</a>
 * <p>
 * Suppose you have 4 numbers: 0, 9, 6, 4 and 3 strings composed with them:
 * <p>
 * s1 = "6900690040"<p>
 * s2 = "4690606946"<p>
 * s3 = "9990494604"<p>
 * Compare s1 and s2 to see how many positions they have in common:
 * 0 at index 3, 6 at index 4, 4 at index 8 : 3 common positions out of ten.
 * <p>
 * Compare s1 and s3 to see how many positions they have in common:
 * 9 at index 1, 0 at index 3, 9 at index 5 : 3 common positions out of ten.
 * <p>
 * Compare s2 and s3. We find 2 common positions out of ten.
 * <p>
 * So for the 3 strings we have 8 common positions out of 30 ie 0.2666... or 26.666...%
 * <p>
 * Given n substrings (n >= 2) in a string s our function pos_average will calculate
 * the average percentage of positions that are the same between
 * the (n * (n-1)) / 2 sets of substrings taken amongst the given n substrings.
 * It can happen that some substrings are duplicate but since their ranks
 * are not the same in s they are considered as different substrings.
 * <p>
 * The function returns the percentage formatted as a float with 10 decimals
 * but the result is tested at 1e.-9 (see function assertFuzzy in the tests).
 * <p>
 * Example:<p>
 * Given string s = "444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490"
 * composing a set of n = 10 substrings (hence 45 combinations), pos_average returns 29.2592592593.
 */

public class PositionsAverage {
    public static double getAveragePercentage(String string) {
        String[] substrings = string.split("\\D++");
        int sum = 0;
        int combinations = substrings.length * (substrings.length - 1) / 2;
        for (int i = 0; i < substrings.length - 1; i++) {
            for (int j = i + 1; j < substrings.length; j++) {
                sum = sum + compareStrings(substrings[i], substrings[j]);
            }
        }
        return ((double) sum / (double) (combinations * substrings[0].length())) * 100;
    }

    private static int compareStrings(String string1, String string2) {
        int count = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
