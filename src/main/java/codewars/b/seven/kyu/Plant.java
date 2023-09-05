package codewars.b.seven.kyu;

/**
 * <a href="https://www.codewars.com/kata/58941fec8afa3618c9000184/solutions/java">
 *     Growing Plant (7kyu)</a>
 * <p>
 * Each day a plant is growing by upSpeed meters.
 * Each night that plant's height decreases by downSpeed meters due to the lack of sun heat.
 * Initially, plant is 0 meters tall. We plant the seed at the beginning of a day.
 * We want to know when the height of the plant will reach a certain level.
 * <p>
 * Example
 * <p>
 * For upSpeed = 100, downSpeed = 10 and desiredHeight = 910, the output should be 10.
 */

public class Plant {
    public static int growPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int days = 0;
        int height = 0;
        while (height <= desiredHeight) {
            height = height + upSpeed;
            days++;
            if (height >= desiredHeight) {
                return days;
            }
            height = height - downSpeed;
        }
        return days;
    }
}
