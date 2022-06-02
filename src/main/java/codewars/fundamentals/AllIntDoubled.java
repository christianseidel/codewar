package codewars.fundamentals;

import java.util.Arrays;

public class AllIntDoubled {
    /*  Given an array of integers, return a new array
    with each value doubled.
    Example: [1, 2, 3] --> [2, 4, 6]
    */
    public static int[] map(int[] arr) {
        int[] output = Arrays.stream(arr).map(x -> x * 2).toArray();
        return output;
    }
}
