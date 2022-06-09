package codewars.White;

public class ShortestWord {
    /* Given a string of words, return the length of the shortest word(s).
    String will never be empty and you do not need to account for different data types.
    */

    public static int findShort(String s) {

        int answer = s.length();
        int j;
        for (int i = 0; i < s.length(); i++) {
            j = 0;
            while (s.charAt(i) != ' ') {
                j++;
                i++;
                if (i == s.length()) {
                    break;
                }
            }
            if (j < answer) {
                answer = j;
            }
        }
        return answer;
    }
}

