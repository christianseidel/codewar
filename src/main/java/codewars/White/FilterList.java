package codewars.White;

import java.util.ArrayList;
import java.util.List;

public class FilterList {
    /*  Create a function that takes a list of non-negative integers and strings
    and returns a new list with the strings filtered out.
    Examples:
        Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
        Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
        Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231)
    */

    public static List<Object> filterList(final List<Object> list) {

        List<Object> output = new ArrayList<>();

        for (Object item : list) {
            if (item.getClass().toString().equals("class java.lang.Integer")) {
                output.add(item);
            }
        }
        return output;
    }
}
