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

    public int sumIntervals(int[][] intervals) {

        if ((intervals == null) || (intervals.length == 0)) {
            return 0;
        }
        int sum = 0;
        int[][] sortedIntervals = sortIntervals (intervals);
        int[][] ledger = establishLedger (sortedIntervals);

        while (countRemainingIntervals(ledger) > 0) {
            System.out.println(Arrays.deepToString(ledger));
            ledger = eliminateOneLevelOfOverlap(ledger);
            System.out.println(Arrays.deepToString(ledger));
            int numberOfRemaining = countRemainingIntervals(ledger);
            int[][] nextLedger = new int[numberOfRemaining][4];
            int indexNextLedger = 0;
            // eliminate all entries with index 4 = 0;
            for (int p = 0; p < numberOfRemaining; p++) {
                if (ledger[p][4] == 0) {
                    sum = sum + ledger[p][3];
                } else {
                    nextLedger[indexNextLedger] = ledger[p];
                    indexNextLedger++;
                }
            }
            ledger = nextLedger;
        }
        return sum;
    }

    private int[][] sortIntervals (int[][] intervals) {
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

    private int[][] establishLedger (int[][] intervals) {
        int[][] ledger = new int[intervals.length][4];
        for (int k = 0; k < intervals.length; k++) {
            ledger[k][0] = intervals[k][0];
            ledger[k][1] = intervals[k][1];
            ledger[k][2] = intervals[k][1] - intervals[k][0];  // This is the (remaining) length of interval.
            ledger[k][3] = 1;  // Index 3 will serve as a Boolean where 0 = false and 1 = true.
        }
        return ledger;
    }

    private int countRemainingIntervals(int[][] ledger) {
        int checkSum = 0;
        for (int p = 0; p < ledger.length; p++) {
            checkSum = checkSum + ledger[p][2];
        }
        return checkSum;
    }

    private int[][] eliminateOneLevelOfOverlap(int[][] ledger) {
        for (int m = 0; m < ledger.length; m++) {
            // difference between start of next and end of current interval
            int difference = ledger[m+1][0] - ledger [m][1];
            // check if there is overlap
            if (difference < 0) {
                ledger[m+1][0] = ledger[m][1];                  // if there is overlap
                ledger[m+1][2] = ledger[m+1][2] + difference;   // m+1 gets shortened
            } else {
                ledger[m][3] = 0;                               // if not index 3 = 0 meaning 'false'
            }
        }
        return ledger;
    }

    /*

        //int[] ledger = new int[4];
        int uniquelyOnwedLengths[] = new int[intervals.length];

        for (int k = 0; k < intervals.length; k++) {
            // length of element k is owned by k:
            uniquelyOnwedLengths[k] = intervals[k][1] - intervals[k][0];

            // any upcoming overlap will solely be owned by k.
            // check if there is overlap at all
            if (intervals[k+1][0] < intervals[k][1]) {
                // Start of next is smaller than end of current. Thus, overlap is to be handled:
                int upperLimit = intervals[k][1]; // set upper limit
                int nextIntervalTested = k + 1;
                // as long as there is overlap:
                while (intervals[nextIntervalTested][0] > upperLimit) {  // start of next is smaller than end of current
                    uniquelyOnwedLengths[nextIntervalTested] = Math.max((intervals[nextIntervalTested][1] - intervals[k][1]), 0);
                    nextIntervalTested++;
                }
                k = nextIntervalTested - 1;
            }


                // handling overlap


                int m = k;
                // common length will be subtracted

                // handling overlap
            }

            int endOfItemK = intervals[k][1];
            int m = 1;
            while(intervals[k+m][0] < endOfItemK) {


            }
        }


        // Single intervalls will then be calculated and retained.
        int lengths = 0;
        for (int k = 0; k < intervals.length; k++) {
            lengths = lengths + (intervals[k][1] - intervals[k][0]);
            if (k == intervals.length - 1) {
                break;
            } else {
                // delete intervals which are outreached on both sides by their preceding interval
                if ((intervals[k+1][0] > intervals[k][0]) && (intervals[k+1][1] < intervals[k][1])) {
                    lengths = lengths - (intervals[k+1][1] - intervals[k+1][0]);
                    k++;
                } else if (intervals[k][1] > intervals[k+1][0]) {
                    intervals[k+1][0] = intervals[k][1];
                }
            }
        }

     */

}
