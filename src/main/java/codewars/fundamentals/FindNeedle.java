package codewars.fundamentals;

import java.util.Arrays;

public class FindNeedle {
     /* Can you find the needle in the haystack?
     Write a function findNeedle() that takes an array full of junk
     but containing one "needle". After your function finds the
     needle it should return a message (as a string) that says:
     "found the needle at position " plus the index it found the needle.
     Thus: findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk",
     "needle", "randomJunk"}) should return "found the needle at position 5"  */

    public static String findNeedle(Object[] haystack) {

        int position = 0;

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                position = i;
                break;
            }
        }

        return "found the needle at position " + position;
    }
}
