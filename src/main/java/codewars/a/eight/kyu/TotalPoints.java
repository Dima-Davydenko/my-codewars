package codewars.a.eight.kyu;

/**
 * Total amount of points (8kyu
 * Our football team has finished the championship.
 * Our team's match results are recorded in a collection of strings.
 * Each match is represented by a string in the format "x:y",
 * where x is our team's score and y is our opponents score.
 *
 * For example: ["3:1", "2:2", "0:1", ...]
 *
 * Points are awarded for each match as follows:
 * if x > y: 3 points (win)
 * if x < y: 0 points (loss)
 * if x = y: 1 point (tie)
 * Write a function that takes this collection and returns the number of points our team (x)
 * got in the championship by the rules given above.
 *
 * Notes:
 * our team always plays 10 matches in the championship
 * 0 <= x <= 4
 * 0 <= y <= 4
 */

public class TotalPoints {
    public int points(String[] games) {
        int pointsSum = 0;
        for (String game : games) {
            int points = (int) game.charAt(0) > (int) game.charAt(2) ? 3
                    : (int) game.charAt(0) < (int) game.charAt(2) ? 0 : 1;
            pointsSum = pointsSum + points;
        }
        return pointsSum;
    }
}
