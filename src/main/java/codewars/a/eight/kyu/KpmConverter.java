package codewars.a.eight.kyu;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Miles per gallon to kilometers per liter (8kyu)
 *
 * I want to quickly be able to convert miles per gallon (mpg) into kilometers per liter (kpl).
 * Create an application that will display the number of kilometers per liter (output) based on
 * the number of miles per imperial gallon (input).
 * Make sure to round off the result to two decimal points.
 * Some useful associations relevant to this kata:
 * 1 Imperial Gallon = 4.54609188 litres
 * 1 Mile = 1.609344 kilometres
 */

public class KpmConverter {
    private static final float LITRES_IN_GALLON = 4.54609188f;
    private static final float KM_IN_MILE = 1.609344f;

    public float mpgToKpM(final float mpg) {
        BigDecimal bd = new BigDecimal(Float.toString(mpg * KM_IN_MILE / LITRES_IN_GALLON));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
