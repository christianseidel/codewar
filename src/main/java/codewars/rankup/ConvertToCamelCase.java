package codewars.rankup;

public class ConvertToCamelCase {
    /*  Complete the method/function so that it converts
    dash/underscore delimited words into camel casing.
    The first word within the output should be capitalized
    only if the original word was capitalized (known as
    Upper Camel Case, also often referred to as Pascal case).

    Examples:
    "the-stealth-warrior" gets converted to "theStealthWarrior"
    "The_Stealth_Warrior" gets converted to "TheStealthWarrior"     */

    static String toCamelCase(String s) {

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '_' || s.charAt(i) == '-') {

            }
            /* char a = "a";
            a = a.toUpperCase();
            System.out.println(aa);
*/
        }

        return "";
    }
}
