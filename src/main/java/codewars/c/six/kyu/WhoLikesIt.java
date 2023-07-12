package codewars.c.six.kyu;

/**
 * Who likes it? (6kyu)
 *
 * You probably know the "like" system from Facebook and other pages.
 * People can "like" blog posts, pictures or other items.
 * We want to create the text that should be displayed next to such an item.
 *
 * Implement the function which takes an array containing the names of people that like an item.
 * It must return the display text as shown in the examples:
 *
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 * Note: For 4 or more names, the number in "and 2 others" simply increases.
 */

class WhoLikesIt {
    public String whoLikesIt(String[] names) {
        StringBuilder message = new StringBuilder();
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return message.append(names[0]).append(" likes this").toString();
            case 2:
                return message.append(names[0]).append(" and ")
                        .append(names[1]).append(" like this")
                        .toString();
            case 3:
                return message.append(names[0]).append(", ")
                        .append(names[1]).append(" and ")
                        .append(names[2]).append(" like this")
                        .toString();
            default:
                return message.append(names[0]).append(", ")
                        .append(names[1]).append(" and ")
                        .append(names.length - 2).append(" others like this")
                        .toString();
        }
    }
}
