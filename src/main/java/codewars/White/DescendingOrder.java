package codewars.White;

import java.util.ArrayList;
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

    public static int sortDesc(final int num) {

        List<Integer> result = new ArrayList<>();
        result.set(0, 0);
        int i = 0;

        while (num < 1) {
            int x =  num % 10;
            int j = i;
            while (x >= result.get(j)) {
                    j++;
                }
            // result.set
            result.set(i, num % 10);
            }
        // -> need to implement a linked list here...


        return 987654321;
    }
}
