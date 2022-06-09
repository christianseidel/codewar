package codewars.White;

public class DeleteFirstAndLastCharacter {
/*  It's pretty straightforward. Your goal is to create a function that removes
    the first and last characters of a string. You're given one parameter, the
    original string. You don't have to worry with strings with less than two characters.
 */

    public static String remove(String str) {
        StringBuilder myString = new StringBuilder(str);
        myString.deleteCharAt(0).deleteCharAt((str.length()-2));
        return myString.toString();
    }
}
