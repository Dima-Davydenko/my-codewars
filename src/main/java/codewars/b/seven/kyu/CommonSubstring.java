package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/5669a5113c8ebf16ed00004c/solutions/java">
 *     Common Substrings (7kyu)</a>
 * <p>
 * Given 2 strings, your job is to find out if there is a substring that appears in both strings.
 * You will return true if you find a substring that appears in both strings,
 * or false if you do not.
 * We only care about substrings that are longer than one letter long.
 * <p>
 * *Example 1*<p>
 * SubstringTest("Something","Fun"); //Returns false
 * <p>
 * *Example 2*<p>
 * SubstringTest("Something","Home"); //Returns true
 * <p>
 * In the above example, example 2 returns true
 * because both of the inputs contain the substring "me". (soMEthing and hoME)
 * In example 1, the method will return false
 * because something and fun contain no common substrings.
 * (We do not count the 'n' as a substring in this Kata because it is only 1 character long)
 * <p>
 * #Rules: Lowercase and uppercase letters are the same. So 'A' == 'a'.
 * We only count substrings that are > 1 in length.
 * <p>
 * #Input: Two strings with both lower and upper cases.
 * #Output: A boolean value determining if there is a common substring between the two inputs.
 */

public class CommonSubstring {
    public boolean isSubstring(String word1, String word2) {
        for (int i = 0; i < word2.length() - 1; i++) {
            String substring = word2.toLowerCase().substring(i, i + 2);
            if (word1.toLowerCase().contains(substring)) {
                return true;
            }
        }
        return false;
    }
}
