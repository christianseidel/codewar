package codewars.difficult;

import java.awt.desktop.AboutEvent;

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
        int sum = 0;
        int[][] sortedIntervals = sortIntervals(intervals);
        int[][] ledger = establishLedger(sortedIntervals);

        boolean done = false;
        int m = 0;
        while (!done) {

            // difference between start of next and end of current interval
            int difference = ledger[m + 1][0] - ledger[m][1];
            // check if m+1 starts within range of m (overlap on one end)
            if (difference < 0) {
                // check if m+1 ends beyond the range of m+1 (overlap on both ends)
                if (ledger[m][1] > ledger[m + 1][1]) {
                    // if there is overlap on both ends, m+1 will be disregarded altogether
                    ledger[m + 1][2] = ledger[m + 1][3] = 0;
                    // if m+1 is the last item, m needs to be set to "done", too
                    if (m + 2 == ledger.length) {
                        ledger[m][3] = 0;
                        m--;
                    }
                    m++;
                } else {
                    // if there is overlap on one end only, m+1 gets shortened
                    ledger[m + 1][0] = ledger[m][1];
                    ledger[m + 1][2] = ledger[m + 1][2] + difference;
                }
            } else {
                ledger[m][3] = 0;
                // if m+1 will be the last item, it now needs to be set to "done"
                if (m + 2 == ledger.length) {
                    ledger[m + 1][3] = 0;
                }
            }
        }




    return sum;
    }

    private static int[][] sortIntervals (int[][] intervals) {
        // Intervalls will be sorted according to their first (lower) value.
        for (int i = 0; i < intervals.length; i++) {
            int j = i;
            while (((j + 1) < intervals.length) && (intervals[j][0] > intervals[j + 1][0])) {
                int zero = intervals[j][0];
                int one = intervals[j][1];
                intervals[j][0] = intervals[j + 1][0];
                intervals[j][1] = intervals[j + 1][1];
                intervals[j + 1][0] = zero;
                intervals[j + 1][1] = one;
                if (j == 0) {
                    break;
                } else {
                    j--;
                }
            }
        }
        return intervals;
    }

    private static int[][] establishLedger (int[][] intervals) {
        int[][] ledger = new int[intervals.length][4];
        for (int k = 0; k < intervals.length; k++) {
            ledger[k][0] = intervals[k][0];
            ledger[k][1] = intervals[k][1];
            // Index 2 Keeps track of the length of interval.
            ledger[k][2] = intervals[k][1] - intervals[k][0];
            // Index 3 will serve as a Boolean where 0 = "done" and 1 = "not yet done".
            ledger[k][3] = 1;
        }
        return ledger;
    }

    private static int countRemainingIntervals(int[][] ledger) {
        int checkSum = 0;
        for (int p = 0; p < ledger.length; p++) {
            checkSum = checkSum + ledger[p][3];
        }
        return checkSum;
    }
}
