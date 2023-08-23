package codewars.d.five.kyu;

/**
 * <a href="https://www.codewars.com/kata/5259510fc76e59579e0009d4">
 *     Did you mean ...? (5 kyu)</a>
 * <p>
 * I'm sure, you know Google's "Did you mean ...?",
 * when you entered a search term and mistyped a word.
 * In this kata we want to implement something similar.
 * <p>
 * You'll get an entered term (lowercase string)
 * and an array of known words (also lowercase strings).
 * Your task is to find out, which word from the dictionary is most similar to the entered one.
 * The similarity is described by the minimum number of letters you have to add,
 * remove or replace in order to get from the entered word to one of the dictionary.
 * The lower the number of required changes, the higher the similarity between each two words.
 * <p>
 * Same words are obviously the most similar ones.
 * A word that needs one letter to be changed is more similar to another word
 * that needs 2 (or more) letters to be changed. E.g. the mistyped term berr
 * is more similar to beer (1 letter to be replaced)
 * than to barrel (3 letters to be changed in total).
 * <p>
 * Extend the dictionary in a way, that it is able to return you
 * the most similar word from the list of known words.
 * <p>
 * Code Examples:
 * <p>
 * Dictionary fruits =
 * new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
 * <p>
 * fruits.findMostSimilar("strawbery"); // must return "strawberry"
 * <p>
 * fruits.findMostSimilar("berry"); // must return "cherry"
 * <p>
 * Dictionary things = new Dictionary(new String[]{"stars", "mars", "wars", "codec", "codewars"});
 * things.findMostSimilar("coddwars"); // must return "codewars"
 * <p>
 * Dictionary languages = new Dictionary(new String[]
 * {"javascript", "java", "ruby", "php", "python", "coffeescript"});
 * <p>
 * languages.findMostSimilar("heaven"); // must return "java"
 */

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String term) {
        int distance = findDistance(term, words[0]);
        int currentWordDistance;
        String mostSimilarWord = words[0];
        for (int i = 0; i < words.length; i++) {
            currentWordDistance = findDistance(term, words[i]);
            if (currentWordDistance < distance) {
                mostSimilarWord = words[i];
                distance = currentWordDistance;
            }
        }
        return mostSimilarWord;
    }

    private int findDistance(String term, String word) {
        int[][] matrix = new int[term.length() + 1][word.length() + 1];
        for (int i = 0; i <= term.length(); i++) {
            matrix[i][0] = i;
        }
        for (int j = 0; j <= word.length(); j++) {
            matrix[0][j] = j;
        }
        int insertion;
        int deletion;
        int replacement;
        for (int i = 1; i <= term.length(); i++) {
            for (int j = 1; j <= word.length(); j++) {
                if (term.charAt(i - 1) == (word.charAt(j - 1))) {
                    matrix[i][j] = matrix[i - 1][j - 1];
                } else {
                    insertion = matrix[i][j - 1];
                    deletion = matrix[i - 1][j];
                    replacement = matrix[i - 1][j - 1];
                    matrix[i][j] = 1 + findMin(insertion, deletion, replacement);
                }
            }
        }
        return matrix[term.length()][word.length()];
    }

    private int findMin(int x, int y, int z) {
        if (x <= y && x <= z) {
            return x;
        }
        if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }
}
