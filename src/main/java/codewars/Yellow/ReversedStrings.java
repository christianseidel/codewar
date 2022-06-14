package codewars.Yellow;

public class ReversedStrings {
/*    Complete the solution so that it reverses the string passed into it.
            'world'  =>  'dlrow'
            'word'   =>  'drow'
*/

    public static String solution(String str) {

        String solution = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            solution += str.charAt(i);
        }
        return solution;
    }

}
