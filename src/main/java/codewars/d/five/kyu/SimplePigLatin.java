package codewars.d.five.kyu;

/**
 * <a href="https://www.codewars.com/kata/520b9d2ad5c005041100000f/solutions/java">
 *     Simple Pig Latin (5kyu)</a>
 * <p>
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 * <p>
 * Examples
 * <p>
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * <p>
 * pigIt('Hello world !');     // elloHay orldway !
 */

public class SimplePigLatin {
    public String toSimplePigLatin(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("\\p{Alpha}+")) {
                words[i] = wordToPigLatin(words[i]);
            }
        }
        return String.join(" ", words);
    }

    private String wordToPigLatin(String word) {
        StringBuilder builder = new StringBuilder();
        return builder.append(word.substring(1))
                .append(word.charAt(0))
                .append("ay")
                .toString();
    }
}
