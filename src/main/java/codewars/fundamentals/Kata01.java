package codewars.fundamentals;

public class Kata01 {

    // YET UNFINISHED //

    /* Sum all the numbers of a given array ( cq. list ), except
    the highest and the lowest element (by value, not by index).

    The highest or lowest element respectively is a single element
    at each edge, even if there are more than one with the same value.

    If an empty value (null, None, Nothing etc.) is given instead of
    an array, or the given array is an empty list or a list with
    only 1 element, return 0.   */


    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return 0;
        }
        int swap;
        int i = 1;
        while (numbers[i - 1] > numbers[i]) {
            swap = numbers[i - 1];
            numbers[i - 1] = numbers[i];
            numbers[i] = swap;
            i++;
        }

        int sum = 0;
        for (int j = 1; j < (numbers.length - j); j++) {
            sum = sum + numbers[j];
        }

        return sum;
    }
}
