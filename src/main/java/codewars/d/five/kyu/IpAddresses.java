package codewars.d.five.kyu;

/**
 * <a href="https://www.codewars.com/kata/526989a41034285187000de4">Count IP Addresses (5kyu)</a>
 * <p>
 * Implement a function that receives two IPv4 addresses,
 * and returns the number of addresses between them
 * (including the first one, excluding the last one).
 * <p>
 * All inputs will be valid IPv4 addresses in the form of strings.
 * The last address will always be greater than the first one.
 * <p>
 * Examples
 * <p>
 * * With input "10.0.0.0", "10.0.0.50"  => return   50
 * <p>
 * * With input "10.0.0.0", "10.0.1.0"   => return  256
 * <p>
 * * With input "20.0.0.10", "20.0.1.0"  => return  246
 */

public class IpAddresses {
    private static final int NUMBER_OF_BITES = 256;

    public long countIpBetween(String start, String end) {
        String[] startNumbers = start.split("\\.");
        String[] endNumbers = end.split("\\.");
        long quantity = 0L;
        for (int i = 0; i < endNumbers.length; i++) {
            quantity = (long) Math.pow(NUMBER_OF_BITES, i)
                    * (Long.parseLong(endNumbers[endNumbers.length - i - 1])
                    - Long.parseLong(startNumbers[endNumbers.length - i - 1]))
                    + quantity;
        }
        return quantity;
    }
}
