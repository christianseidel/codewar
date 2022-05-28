package codewars.fundamentals;

public class SumMinusBiggestAndSmallestA {

    /* Sum all the numbers of a given array ( cq. list ), except
    the highest and the lowest element (by value, not by index).

    The highest or lowest element respectively is a single element
    at each edge, even if there are more than one with the same value.

    If an empty value (null, None, Nothing etc.) is given instead of
    an array, or the given array is an empty list or a list with
    only 1 element, return 0.   */

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;

        int largestNumber = numbers[0];
        int smallestNumber = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum = sum + n;
            if (largestNumber < n) largestNumber = n;
            if (smallestNumber > n) smallestNumber = n;
        }

        sum = sum - largestNumber - smallestNumber;
        return sum;
    }
}
