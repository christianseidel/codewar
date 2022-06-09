package codewars.White;

import java.util.Locale;

public class ReverseWords {
    /* Complete the function that accepts a string parameter,
    and reverses each word in the string. All spaces in the
    string should be retained.
    Example: "This is an example!" ==> "sihT si na !elpmaxe"
    */


    public static String reverseWords(String original) {
        String solution = "";
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != ' ') {
                String nextWord = "";

                while (original.charAt(0) != ' ') {
                    nextWord = original.charAt(0) + nextWord;
                    original = original.substring(1);
                    if (original.length() == 0) {
                        break;
                    }
                }
                solution = solution + nextWord;
                i = -1;
            } else {
                solution = solution + ' ';
                original = original.substring(1);
                i = -1;
            }
        }

        return solution;
    }
}
