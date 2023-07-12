package codewars.c.six.kyu;

/**
 * Convert string to camel case (6kyu)
 *
 * Complete the method so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was capitalized
 * (known as Upper Camel Case, also often referred to as Pascal case).
 * The next words should be always capitalized.
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 *
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 *
 * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

public class CamelCase {
    public String convertToCamelCase(String string) {
        String[] words = string.split("[-_]");
        StringBuilder builder = new StringBuilder();
        builder.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (j == 0) {
                    builder.append(Character.toUpperCase(chars[j]));
                    continue;
                }
                builder.append(chars[j]);
            }
        }
        return builder.toString();
    }
}
