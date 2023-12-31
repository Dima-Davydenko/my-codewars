package codewars.b.seven.kyu;

/**
 * Jumping Number (Special Numbers Series #4) (7kyu)
 *
 * Definition
 * Jumping number is the number that All adjacent digits in it differ by 1.
 *
 * Task
 * Given a number, Find if it is Jumping or not .
 *
 * Warm-up (Highly recommended)
 * Playing With Numbers Series
 * Notes
 * Number passed is always Positive .
 *
 * Return the result as String .
 *
 * The difference between ‘9’ and ‘0’ is not considered as 1 .
 *
 * All single digit numbers are considered as Jumping numbers.
 *
 * Input >> Output Examples
 * jumpingNumber(9) ==> return "Jumping!!"
 * Explanation:
 * It's single-digit number
 * jumpingNumber(79) ==> return "Not!!"
 * Explanation:
 * Adjacent digits don't differ by 1
 * jumpingNumber(23) ==> return "Jumping!!"
 * Explanation:
 * Adjacent digits differ by 1
 * jumpingNumber(556847) ==> return "Not!!"
 * Explanation:
 * Adjacent digits don't differ by 1
 * jumpingNumber(4343456) ==> return "Jumping!!"
 * Explanation:
 * Adjacent digits differ by 1
 * jumpingNumber(89098) ==> return "Not!!"
 * Explanation:
 * Adjacent digits don't differ by 1
 * jumpingNumber(32) ==> return "Jumping!!"
 * Explanation:
 * Adjacent digits differ by 1
 */

public class JumpingNumber {
    public String isJumping(int number) {
        int sum = 0;
        char[] numbers = String.valueOf(number).toCharArray();
        if (numbers.length == 1) {
            return "Jumping!!";
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                sum = sum + numbers[i] - numbers[i + 1];
            }
            if (numbers[i] < numbers[i + 1]) {
                sum = sum + numbers[i + 1] - numbers[i];
            }
        }
        return sum + 1 == numbers.length ? "Jumping!!" : "Not!!";
    }
}
