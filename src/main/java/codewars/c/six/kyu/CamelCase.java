package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/5208f99aee097e6552000148">Break camelCase (6kyu)</a>
 * <p>
 * Complete the solution so that the function will break up camel casing,
 * using a space between words.
 * <p>
 * Example<p>
 * "camelCasing"  =>  "camel Casing"<p>
 * "identifier"   =>  "identifier"<p>
 * ""             =>  ""
 */

public class CamelCase {
    public String breakCamelCase(String input) {
        char[] chars = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char letter : chars) {
            if (Character.isUpperCase(letter)) {
                builder.append(" ");
            }
            builder.append(letter);
        }
        return builder.toString();
    }
}
