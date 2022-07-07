package codewars.White;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class DescendingOrder {
/*
    Your task is to make a function that can take any non-negative integer as
    an argument and return it with its digits in descending order. Essentially,
    rearrange the digits to create the highest possible number.
    Examples:
        Input: 42145 Output: 54421
        Input: 145263 Output: 654321
        Input: 123456789 Output: 987654321
     */

    public static int sortDesc(int num) {

        if (num == 0) {
            return 0;
        }

        ArrayList<Integer> digits = new ArrayList<>();
        int i = 0;
        while (num > 0) {
            digits.add(i, num % 10);
            num = num / 10;
        }

        List<Integer> digitsSorted = digits.stream().sorted(Comparator.reverseOrder()).toList();

        String output = "";
        for (int n: digitsSorted) {
            output += n;
        };

        return Integer.parseInt(output);
    }
}
