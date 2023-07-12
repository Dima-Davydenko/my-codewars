package codewars.c.six.kyu;

import java.util.stream.IntStream;

/**
 * Highest Scoring Word (6 kyu)
 *
 * Given a string of words, you need to find the highest scoring word.
 * Each letter of a word scores points according to its position in the alphabet:
 * a = 1, b = 2, c = 3 etc.
 * For example, the score of abad is 8 (1 + 2 + 1 + 4).
 * You need to return the highest scoring word as a string.
 * If two words score the same, return the word that appears earliest in the original string.
 * All letters will be lowercase and all inputs will be valid.
 */

public class Words {
    public String getWinnerWord(String words) {
        String[] seperatedWords = words.split(" ");
        int biggestSum = 0;
        String winnerWord = "";
        for (String word : seperatedWords) {
            char[] wordLetters = word.toCharArray();
            int sum = IntStream.range(0, wordLetters.length)
                    .map(i -> (int) wordLetters[i] - 96)
                    .sum();
            if (sum > biggestSum) {
                biggestSum = sum;
                winnerWord = word;
            }
        }
        return winnerWord;
    }
}
