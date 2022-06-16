package codewars.White;

public class FakeBinary {
    /*  Given a string of digits, you should replace
    any digit below 5 with '0' and any digit 5 and above
    with '1'. Return the resulting string.

    Note: input will never be an empty string.  */

    public static String fakeBin(String numberString) {

        char[] chars = numberString.toCharArray();
        String result = "";
        for (char number : chars) {
            int bin = (Character.getNumericValue(number) < 5) ? 0 : 1;
            result = result + bin;
        }
        return result;
    }
}
