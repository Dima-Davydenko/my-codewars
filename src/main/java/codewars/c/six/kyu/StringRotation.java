package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/5596f6e9529e9ab6fb000014/java">
 *     Calculate String Rotation</a>
 * <p>
 * Write a function that receives two strings and returns n,
 * where n is equal to the number of characters
 * we should shift the first string forward to match the second.
 * The check should be case sensitive.
 * <p>
 * For instance, take the strings "fatigue" and "tiguefa".
 * In this case, the first string has been rotated 5 characters forward
 * to produce the second string, so 5 would be returned.
 * <p>
 * If the second string isn't a valid rotation of the first string, the method returns -1.
 * <p>
 * Examples:<p>
 * "coffee", "eecoff" => 2<p>
 * "eecoff", "coffee" => 4<p>
 * "moose", "Moose" => -1<p>
 * "isn't", "'tisn" => 2<p>
 * "Esham", "Esham" => 0<p>
 * "dog", "god" => -1<p>
 */

public class StringRotation {
    public static int calculateRotations(String string1, String string2) {
        if (string1.equals(string2)) {
            return 0;
        }
        int rotations = 0;
        for (int i = 0; i < string1.length(); i++) {
            string1 = string1.charAt(string1.length() - 1)
                    + string1.substring(0, string1.length() - 1);
            rotations++;
            if (string2.equals(string1)) {
                return rotations;
            }
        }
        return -1;
    }
}
