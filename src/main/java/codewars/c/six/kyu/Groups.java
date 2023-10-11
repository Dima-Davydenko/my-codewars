package codewars.c.six.kyu;

import java.util.Stack;

/**
 * <a href="https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java">Valid Braces (6kyu)</a>
 */

public class Groups {
    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ']') {
                if (stack.empty() || !stack.peek().equals('[')) {
                    return false;
                }
                stack.pop();
            } else if (string.charAt(i) == ')') {
                if (stack.empty() || !stack.peek().equals('(')) {
                    return false;
                }
                stack.pop();
            } else if (string.charAt(i) == '}') {
                if (stack.empty() || !stack.peek().equals('{')) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(string.charAt(i));
            }
        }
        return stack.empty();
    }
}
