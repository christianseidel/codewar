package codewars.rankup;

import java.util.Arrays;

public class SumOfIntervals {
/*
    Write a function called sumIntervals that accepts an array of intervals, and returns
    the sum of all the interval lengths. Overlapping intervals should only be counted once.

    Intervals
    Intervals are represented by a pair of integers in the form of an array.
    The first value of the interval will always be less than the second value.
    Interval example: [1, 5] is an interval from 1 to 5. The length of this interval is 4.

    Overlapping Intervals
    List containing overlapping intervals:
            [
            [1,4],
            [7, 10],
            [3, 5]
            ]
    The sum of the lengths of these intervals is 7. Since [1, 4] and [3, 5] overlap,
    we can treat the interval as [1, 5], which has a length of 4.

    Examples:
    // null argument
            Interval.sumIntervals(null);  // => 0
    // empty intervals
            Interval.sumIntervals(new int[][]{});  // => 0
            Interval.sumIntervals(new int[][]{2,2}, {5,5});  // => 0
    // disjoint intervals
            Interval.sumIntervals(new int[][]{
                {1,2},{3,5}
                });  // => (2-1) + (5-3) = 3
    // overlapping intervals
             Interval.sumIntervals(new int[][]{
                {1,4},{3,6},{2,8}
                });  // [1,8] => 7
 */

    public static int sumIntervals(int[][] intervals) {

        if ((intervals == null) || (intervals.length == 0)) {
            return 0;
        }

        // Intervalls will first be sorted according to their first value.
        for (int i = 0; i < intervals.length; i++) {
            int j = i;
            while (((j + 1) < intervals.length) && (intervals[j][0] > intervals[j+1][0])) {
                int zero = intervals[j][0];
                int one = intervals[j][1];
                intervals[j][0] = intervals[j+1][0];
                intervals[j][1] = intervals[j+1][1];
                intervals[j+1][0] = zero;
                intervals[j+1][1] = one;
                if (j == 0) {
                    break;
                    } else {
                    j--;
                }
            }
        }

        // Single intervalls will then be calculated and retained.
        //// int[][] ledger = new int[intervals.length][3];
        int lengths = 0;
        for (int k = 0; k < intervals.length; k++) {
            lengths = lengths + (intervals[k][1] - intervals[k][0]);
            if (k == intervals.length - 1) {
                break;
            } else {
                if (intervals[k][1] > intervals[k+1][0]) {
                    intervals[k+1][0] = intervals[k][1];
                }
            }
        }
        return lengths;
    }

}
