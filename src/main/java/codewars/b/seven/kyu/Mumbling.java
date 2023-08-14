package codewars.b.seven.kyu;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://www.codewars.com/kata/5667e8f4e3f572a8f2000039">
 *     Mumbling (7kyu)</a>
 * <p>
 *This time no story, no theory. The examples below show you how to write function accum:
 * <p>
 * Examples:<p>
 * accum("abcd") -> "A-Bb-Ccc-Dddd"<p>
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"<p>
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"<p>
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Mumbling {
    public static String mumble(String string) {
        String lowString = string.toLowerCase();
        List<String> list = IntStream.range(0, string.length())
                .mapToObj(i -> String.valueOf(lowString.charAt(i)).repeat(i + 1))
                .map(s -> s.replaceFirst("\\D", String.valueOf(Character.toUpperCase(s.charAt(0)))))
                .collect(Collectors.toList());
        return String.join("-", list);
    }
}
