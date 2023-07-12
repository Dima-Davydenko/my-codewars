package codewars.a.eight.kyu;

/**
 * Sentence Smash (8kyu)
 *
 * Write a function that takes an array of words
 * and smashes them together into a sentence and returns the sentence.
 *
 * You can ignore any need to sanitize words or add punctuation,
 * but you should add spaces between each word.
 * Be careful, there shouldn't be a space at the beginning or the end of the sentence!
 *
 * Example
 * ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
 */

public class SmashWords {
    public String smash(String[] words) {
        StringBuilder builder = new StringBuilder();
        if (words.length == 0) {
            return "";
        }
        for (int i = 0; i < words.length - 1; i++) {
            builder.append(words[i]).append(" ");
        }
        builder.append(words[words.length - 1]);
        return builder.toString();
    }
}
