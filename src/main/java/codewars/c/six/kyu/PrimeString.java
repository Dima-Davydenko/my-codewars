package codewars.c.six.kyu;

/**
 * <a href="https://www.codewars.com/kata/589d36bbb6c071f7c20000f7/train/java">Prime String (6kyu)</a>
 */

public class PrimeString {
    public static boolean isPrime(String string) {
        for (int i = 1; i < string.length() / 2 + 1; i++) {
            if (string.matches("(" + string.substring(0, i) + ")+")) {
                return false;
            }
        }
        return true;
    }
}
