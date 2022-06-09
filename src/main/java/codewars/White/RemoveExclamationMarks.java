package codewars.White;

public class RemoveExclamationMarks {

    /*  Write function RemoveExclamationMarks which removes
        all exclamation marks from a given string.  */

    static String removeExclamationMarksA(String stringIn) {
        String stringOut = "";
        for (int i = 0; i < stringIn.length(); i++) {
            if (stringIn.charAt(i) != '!') {
                stringOut = stringOut + stringIn.charAt(i);}
            }
        return stringOut;
    }

    // Simpler Solution

    static String removeExclamationMarksB(String stringIn) {
        return stringIn.replace("!", "");
    }
}
