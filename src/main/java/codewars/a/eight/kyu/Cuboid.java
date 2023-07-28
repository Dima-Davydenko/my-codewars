package codewars.a.eight.kyu;

/**
 * <a href="https://www.codewars.com/kata/58261acb22be6e2ed800003a">
 *     Volume of a Cuboid (8kyu)</a>
 * <p>
 * Bob needs a fast way to calculate the volume of a cuboid with three values:
 * <p>
 * the length, width and height of the cuboid. Write a function to help Bob with this calculation.
 */

public class Cuboid {
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
