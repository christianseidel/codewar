package codewars.Blue;

import java.util.*;

public class MostFrequentWords {
    /*  Most frequently used words in a text
        Write a function that, given a string of text (possibly with punctuation and line-breaks),
        returns an array of the top-3 most occurring words, in descending order of the number of
        occurrences.

        Assumptions:
        A word is a string of letters (A to Z) optionally containing one or more apostrophes (')
        in ASCII. Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc',
        ab'c are all valid). Any other characters (e.g. #, \, / , . ...) are not part of a word #
        and should be treated as whitespace. Matches should be case-insensitive, and the words in
        the result should be lowercased. Ties may be broken arbitrarily. If a text contains fewer
        than three unique words, then either the top-2 or top-1 words should be returned, or an
        empty array if a text contains no words.

        Examples:
        top_3_words("In a village of La Mancha, the name of which I have no desire to call to
        mind, there lived not long since one of those gentlemen that keep a lance in the
        lance-rack, an old buckler, a lean hack, and a greyhound for coursing. An olla of rather
        more beef than mutton, a salad on most nights, scraps on Saturdays, lentils on Fridays,
        and a pigeon or so extra on Sundays, made away with three-quarters of his income.")
        # => ["a", "of", "on"]

        top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
        # => ["e", "ddd", "aa"]

        top_3_words("  //wont won't won't")
        # => ["won't", "wont"]

        For java users, the calls will actually be in the form: TopWords.top3(String s),
        expecting you to return a List<String>.

        Bonus points (not really, but just for fun):
        Avoid creating an array whose memory footprint is roughly as big as the input text.
        Avoid sorting the entire array of unique words.
     */

    public List<String> topThreeKata(String s) {

        if (s == null || s.isEmpty()) {
            return List.of();
        }

        while (s.contains("\'\'")) {
            s = s.replace("\'\'", "\'");
        }
        List<String> ignoreList = List.of(",", ";", ".", "!", "?", ":", "&", "\"", "+", ">", "<", "#", "- ", " -", "[", "]", "\r", "\n", "/", " \' ");
        s = reduceByIgnoreList(s, ignoreList).toLowerCase();

        TopPlaces topOne = new TopPlaces("", 0);
        TopPlaces topTwo = new TopPlaces("", 0);
        TopPlaces topThree = new TopPlaces("", 0);

        TopPlaces[] ranking = {topOne, topTwo, topThree};

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
        if (topOne.counter > 0) {
            topThreeList.add(topOne.getWord());
            if (topTwo.counter > 0) {
                topThreeList.add(topTwo.getWord());
                if (topThree.counter > 0) {
                    topThreeList.add(topThree.getWord());
                }
            }
        }
        return topThreeList;
    }

    public class TopPlaces {
        private int counter;
        private String word;

         public TopPlaces(String word, int counter) {
            this.word = word;
            this.counter = counter;
        }

         public int getCounter() {
            return counter;
        }

        public void setCounter(int counter) {
            this.counter = counter;
        }

         public String getWord() {
            return word;
        }

         public void setWord(String word) {
            this.word = word;
        }
    }

    private String reduceByIgnoreList(String s, List<String> ignoreList) {

        for (int i = 0; i < ignoreList.size(); i++) {
            s = s.replace(ignoreList.get(i), " ");
        }
        s = cleanString(s);
        return s;
    }

    private String findNextWord(String s) {

        if (s.contains(" ")) {
            int nextCut = s.indexOf(' ');
            String word = s.substring(0, nextCut);
            return word;
        }
        return s;
    }

    private String reduceBySingleElement(String s, String word) {
        int start = s.indexOf(" " + word + " ") + 1;
        if (start > 0) {
            s = s.substring(0, start) + s.substring(start+word.length());
        }
        return s;
    }

    private Boolean checkIfSearchWordIsLastWord(String s, String word) {
        if (word.length() > s.length()) {
            return false;
        } else {
            String dif = s.substring((s.length() - word.length()));
            return word.equals(dif);
        }
    }

    private String deleteLastWord(String s, String word) {
        s = s.substring(0, (s.length()-word.length()-1));
        return s;
    }

    private String cleanString(String s) {

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

    private TopPlaces[] setRanking(TopPlaces[] ranking, String word, int counter) {
        if (counter > ranking[0].counter) {
            ranking[2].setCounter(ranking[1].getCounter());
            ranking[2].setWord(ranking[1].getWord());
            ranking[1].setCounter(ranking[0].getCounter());
            ranking[1].setWord(ranking[0].getWord());
            ranking[0].setCounter(counter);
            ranking[0].setWord(word);
        } else if (counter > ranking[1].counter) {
            ranking[2].setCounter(ranking[1].getCounter());
            ranking[2].setWord(ranking[1].getWord());
            ranking[1].setCounter(counter);
            ranking[1].setWord(word);
        } else if (counter > ranking[2].counter) {
            ranking[2].setCounter(counter);
            ranking[2].setWord(word);
        }
        return ranking;
    }
}
