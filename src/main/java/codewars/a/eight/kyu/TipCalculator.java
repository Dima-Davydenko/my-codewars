package codewars.a.eight.kyu;

/**
 * Tip Calculator (8kyu)
 *
 * Complete the function, which calculates how much you need to tip
 * based on the total amount of the bill and the service.
 *
 * You need to consider the following ratings:
 *
 * Terrible: tip 0%
 * Poor: tip 5%
 * Good: tip 10%
 * Great: tip 15%
 * Excellent: tip 20%
 * The rating is case insensitive (so "great" = "GREAT").
 * If an unrecognised rating is received, then you need to return:
 *
 * "Rating not recognised" in Javascript, Python and Ruby...
 * ...or null in Java
 * ...or -1 in C#
 * Because you're a nice person, you always round up the tip, regardless of the service.
 */

public class TipCalculator {
    public Integer calculateTip(double amount, String rating) {
        double tips;
        switch (rating.toLowerCase()) {
            case "terrible":
                tips = 0;
                break;
            case "poor":
                tips = amount * 0.05;
                break;
            case "good":
                tips = amount * 0.1;
                break;
            case "great":
                tips = amount * 0.15;
                break;
            case "excellent":
                tips = amount * 0.2;
                break;
            default:
                return null;
        }
        double result = Math.ceil(tips);
        return (int)result;
    }
}
