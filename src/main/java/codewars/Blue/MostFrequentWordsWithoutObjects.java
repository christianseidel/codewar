package codewars.Blue;

import java.util.ArrayList;
import java.util.List;

public class MostFrequentWordsWithoutObjects {
    /*  At codewars.com this kata would not let me use objects.
        I therefore created a second solution without any object.
    */

    public static List<String> topThreeKata(String s) {

        if (s == null || s.isEmpty()) {
            return List.of();
        }

        while (s.contains("\'\'")) {
            s = s.replace("\'\'", "\'");
        }
        List<String> ignoreList = List.of(",", ";", ".", "_", "-", "!", "?", ":", "&", "\"", "+", ">", "<", "#", "- ", " -", "[", "]", "\r", "\n", "/", " \' ");
        s = reduceByIgnoreList(s, ignoreList).toLowerCase();

        Object[] rankOne = {0, ""};
        Object[] rankTwo = {0, ""};
        Object[] rankThree = {0, ""};
        Object[][] ranking = {rankOne, rankTwo, rankThree};

        int counter = 1;
        String nextWord = "";

        while (s.length() > 0) {

            nextWord = findNextWord(s);
            if (s.length() == nextWord.length() || s.equals(nextWord + " " + nextWord)) {
                counter++;
                setRanking(ranking, nextWord, counter);
                break;
            }

            // remove first instance:
            s = s.substring(nextWord.length());

            while (s.contains(" " + nextWord + " ")) {
                counter++;
                s = reduceBySingleElement(s, nextWord);
            }

            if (checkIfSearchWordIsLastWord(s, nextWord)) {
                counter++;
                s = deleteLastWord(s, nextWord);
                if (s.length() == 0) {
                    break;
                }
            }
            s = cleanString(s);

            setRanking(ranking, nextWord, counter);
            
            counter = 1;
        }

        List<String> topThreeList = new ArrayList<>();
        if ((int)ranking[0][0] > 0) {
            topThreeList.add(ranking[0][1].toString());
            if ((int)ranking[1][0] > 0) {
                topThreeList.add(ranking[1][1].toString());
                if ((int)ranking[2][0] > 0) {
                    topThreeList.add(ranking[2][1].toString());
                }
            }
        }
        return topThreeList;
    }

    private static String reduceByIgnoreList(String s, List<String> ignoreList) {

        for (int i = 0; i < ignoreList.size(); i++) {
            s = s.replace(ignoreList.get(i), " ");
        }
        s = cleanString(s);
        return s;
    }

    private static String findNextWord(String s) {

        if (s.contains(" ")) {
            int nextCut = s.indexOf(' ');
            String word = s.substring(0, nextCut);
            return word;
        }
        return s;
    }

    private static String reduceBySingleElement(String s, String word) {
        int start = s.indexOf(" " + word + " ") + 1;
        if (start > 0) {
            s = s.substring(0, start) + s.substring(start+word.length());
        }
        return s;
    }

    private static Boolean checkIfSearchWordIsLastWord(String s, String word) {
        if (word.length() > s.length()) {
            return false;
        } else {
            String dif = s.substring((s.length() - word.length()));
            return word.equals(dif);
        }
    }

    private static String deleteLastWord(String s, String word) {
        s = s.substring(0, (s.length()-word.length()-1));
        return s;
    }

    private static String cleanString(String s) {

        // delete two empty spaces in a row
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        // delete empty space at start
        if (s.charAt(0) == ' ') {
            s = s.substring(1);
        }

        // delete empty space at end
        if (s.length() > 0 && s.charAt(s.length()-1) == ' ') {
            s = s.substring(0, s.length()-1);
        }

        return s;
    }

    private static Object[][] setRanking(Object[][] ranking, String word, int counter) {

        if (counter > (int)ranking[0][0]) {
            ranking[2][0] = ranking[1][0];
            ranking[2][1] = ranking[1][1];
            ranking[1][0] = ranking[0][0];
            ranking[1][1] = ranking[0][1];
            ranking[0][0] = counter;
            ranking[0][1] = word;
        } else if (counter > (int)ranking[1][0]) {
            ranking[2][0] = ranking[1][0];
            ranking[2][1] = ranking[1][1];
            ranking[1][0] = counter;
            ranking[1][1] = word;
        } else if (counter > (int)ranking[2][0]) {
            ranking[2][0] = counter;
            ranking[2][1] = word;
        }
        return ranking;
    }
}
