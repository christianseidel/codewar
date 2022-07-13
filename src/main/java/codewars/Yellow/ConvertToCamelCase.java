package codewars.Yellow;

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

        char[] stringArray = s.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == '_' || s.charAt(i) == '-') {
                stringArray[i+1] = Character.toUpperCase(stringArray[i+1]);
            }
        }
        String stringIntermediate = new String(stringArray);
        return stringIntermediate.replace("_", "").replace("-", "");
    }
}
