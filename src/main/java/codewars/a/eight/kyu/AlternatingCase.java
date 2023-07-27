package codewars.a.eight.kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/56efc695740d30f963000557">altERnaTIng cAsE <=> ALTerNAtiNG CaSe (8kyu)</a>
 * <p>
 * Define String.prototype.toAlternatingCase
 * (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase
 * in your selected language; see the initial solution for details)
 * such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.
 * <p>
 * For example:
 * <p>
 * AlternatingCase.toAlternativeString("hello world") == "HELLO WORLD"<p>
 * AlternatingCase.toAlternativeString("HELLO WORLD") == "hello world"<p>
 * AlternatingCase.toAlternativeString("hello WORLD") == "HELLO world"<p>
 * AlternatingCase.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"<p>
 * <p>
 * AlternatingCase.toAlternativeString("12345") == "12345"<p>
 * // Non-alphabetical characters are unaffected<p>
 *
 * AlternatingCase.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"<p>
 *
 * AlternatingCase.toAlternativeString("AlternatingCase.toAlternatingCase")
 * == "sTRINGuTILS.TOaLTERNATINGcASE"<p>
 *
 * As usual, your function/method should be pure, i.e. it should not mutate the original string.
 */

public class AlternatingCase {
    public String toAlternativeString(String string) {
        char[] chars = string.toCharArray();
        List<Character> charsList = new ArrayList();
        for (char letter : chars) {
            boolean b = Character.isUpperCase(letter) ? charsList.add(Character.toLowerCase(letter))
                    : charsList.add(Character.toUpperCase(letter));
        }
        StringBuilder builder = new StringBuilder();
        for (char symbol : charsList) {
            builder.append(symbol);
        }
        return builder.toString();
    }
}
