package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/5356ad2cbb858025d800111d/solutions/java">
 *     Name Array Capping (7kyu)</a>
 * <p>
 * Create a method that accepts an array of names,
 * and returns an array of each name with its first letter capitalized.
 * <p>
 * example
 * <p>
 * Kata.capMe(new String[] {"jo", "nelson", "jurie"})
 * // returns new String[] {"Jo", "Nelson", "Jurie"}
 * <p>
 * Kata.capMe(new String[] {"KARLY", "DANIEL", "KELSEY"})
 * // returns new String[] {"Karly", "Daniel", "Kelsey"}
 */

public class CapitalizeNames {
    public String[] capitalizeNames(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(0,1).toUpperCase()
                    + strings[i].substring(1).toLowerCase();
        }
        return strings;
    }
}
