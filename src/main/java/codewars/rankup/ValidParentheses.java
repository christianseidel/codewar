package codewars.rankup;

public class ValidParentheses {
    /* Write a function that takes a string of parentheses,
    and determines if the order of the parentheses is valid.
    The function should return true if the string is valid,
    and false if it's invalid.

    Examples:
        "()"    => true
        ")(()))"  => false
        "("     => false
        "(())((()())())"  => true
     */
    public static boolean validParentheses(String parens) {

        int counter = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                counter++;
            } else if (parens.charAt(i) == ')') {
                counter--;
            }
            if (counter < 0) {
                return false;
            }
        }
        if (counter != 0) {
            return false;
        }
        return true;
    }
}
