package codewars.a.eight.kyu;

/**
 * If you can't sleep, just count sheep!! (8 kyu)
 *
 * Task:
 * Given a non-negative integer, 3 for example,
 * return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
 * Input will always be valid, i.e. no negative integers.
 */

public class CountSheep {
    public String countSheep(int num) {
        StringBuilder murmur = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            murmur.append(i).append(" sheep...");
        }
        return murmur.toString();
    }
}
