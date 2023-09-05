package codewars.b.seven.kyu;

/**
 * You will be given a string that may have mixed uppercase and lowercase letters
 * and your task is to convert that string
 * to either lowercase only or uppercase only based on:
 * <p>
 * if the string contains equal number of uppercase and lowercase letters,
 * convert the string to lowercase.
 * <p>
 * For example:
 * <p>
 * solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
 * <p>
 * solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
 * <p>
 * solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
 */

public class CaseConverter {
    public static String convertString(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (char symbol : chars) {
            if (Character.isLowerCase(symbol)) {
                count++;
            }
        }
        return count >= string.replace(" ", "").length() - count
                ? string.toLowerCase()
                : string.toUpperCase();
    }
}
