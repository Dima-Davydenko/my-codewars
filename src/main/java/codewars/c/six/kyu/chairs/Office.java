package codewars.c.six.kyu.chairs;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://www.codewars.com/kata/57f6051c3ff02f3b7300008b">Find a Chair (6kyu)</a>
 * <p>
 * So you've found a meeting room - phew! You arrive there ready to present,
 * and find that someone has taken one or more of the chairs!! You need to find some quick....
 * check all the other meeting rooms to see if all of the chairs are in use.
 * <p>
 * Your meeting room can take up to 8 chairs. need will tell you how many have been taken.
 * You need to find that many.
 * <p>
 * Find the spare chairs from the array of meeting rooms.
 * Each meeting room tuple will have the number of occupants as a string.
 * Each occupant is represented by 'X'. The room tuple will also have an integer
 * telling you how many chairs there are in the room.
 * <p>
 * You should return an array of integers that shows how many chairs you take from each room
 * in order, up until you have the required amount.
 * <p>
 * example:
 * <p>
 * [['XXX', 3], ['XXXXX', 6], ['XXXXXX', 9], ['XXX',2]] when you need 4 chairs:
 * <p>
 * result -> [0, 1, 3] no chairs free in room 0, take 1 from room 1, take 3 from room 2.
 * no need to consider room 3 as you have your 4 chairs already.
 * <p>
 * If you need no chairs, return "Game On".
 * If there aren't enough spare chairs available, return "Not enough!".
 */

public class Office {
    public static Object findChairs(Room[] rooms, int need) {
        if (need == 0) {
            return "Game On";
        }
        List<Integer> chairsInRoom = new ArrayList<>();
        int available;
        for (Room room : rooms) {
            available = room.chairs - room.occupants.length();
            if (available <= 0) {
                chairsInRoom.add(0);
            } else if (need - available <= 0) {
                chairsInRoom.add(need);
                need = 0;
                break;
            } else {
                chairsInRoom.add(available);
                need = need - available;
            }
        }
        return need > 0 ? "Not enough!" : chairsInRoom.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
