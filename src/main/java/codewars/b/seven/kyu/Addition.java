package codewars.b.seven.kyu;

import java.util.function.IntUnaryOperator;

/**
 * <a href="https://www.codewars.com/kata/538835ae443aae6e03000547/solutions/java">
 *     Functional Addition (7kyu)</a>
 * <p>
 * Create a function add(n)/Add(n) which returns a function that always adds n to any number
 * <p>
 * Note for Java: the return type and methods have not been provided
 * to make it a bit more challenging.
 * <p>
 * ...returnType addOne = Kata.add(1);<p>
 * addOne.method(3) => 4
 */

public class Addition {
    public IntUnaryOperator add(int n) {
        return num -> num + n;
    }
}
