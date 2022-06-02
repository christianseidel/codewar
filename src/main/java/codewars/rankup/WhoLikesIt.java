package codewars.rankup;

public class WhoLikesIt {
    /*  The idea to rebuild a "like" system similar the one from  Facebook
    and other pages. People can "like" blog posts, pictures or other items.
    We want to create the text that should be displayed next to such an item:
    Implement the function which takes an array containing the names of people
    who like an item. It must return the display text as shown in the examples:

    []                                -->  "no one likes this"
    ["Peter"]                         -->  "Peter likes this"
    ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
    ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
    ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

    Note: For 4 or more names, the number in "and 2 others" simply increases.   */

    public static String whoLikesIt(String... names) {

        String weLikeIt = "";

        int numberOfLikers = names.length;
        int i = Math.min(numberOfLikers, 4);

        switch (i) {
            case 1:
                weLikeIt = names[0] + " likes this";
                break;
            case 2:
                weLikeIt = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                weLikeIt = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                break;
            case 4:
                weLikeIt = names[0] + ", " + names[1] + " and " + (numberOfLikers - 2) + " others like this";
                break;
            default:
                weLikeIt = "no one likes this";
                break;
        }
                return weLikeIt;
    }
}
