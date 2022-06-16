package codewars.Yellow;

import java.util.*;

public class PickPeaks {
    /*  In this kata, you will write a function that returns the positions and
     the values of the "peaks" (or local maxima) of a numeric array.

    For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3
    with a value of 5 (since arr[3] equals 5).

    The output will be returned as a ``Map<String,List>with two key-value pairs:
    "pos"and"peaks". If there is no peak in the given array, simply return
    {"pos" => [], "peaks" => []}`.

    Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return
    {pos: [3, 7], peaks: [6, 3]}.

    All input arrays will be valid integer arrays (although it could still be empty),
    so you won't need to validate the input.

    The first and last elements of the array will not be considered as peaks
    (in the context of a mathematical function, we don't know what is after
    and before and therefore, we don't know if it is a peak or not).

    Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3] and
    [1, 2, 2, 2, 2] do not. In case of a plateau-peak, please only return the position
    and value of the beginning of the plateau. For example: pickPeaks([1, 2, 2, 2, 1])
    returns {pos: [1], peaks: [2]}.

     */

    public static Map<String, List<Integer>> getPeaks(int[] landscape) {
        System.out.println(Arrays.toString(landscape));
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        boolean ascending = landscape[1] > landscape[0];

        for (int i = 1; i < (landscape.length -1 ); i++) {
            while (landscape[i + 1] <= landscape[i] && i < landscape.length - 1) { // gleich oder sinkt
                if (ascending) {
                    ascending = false;
                    boolean peak = false;
                    for (int j = i+1; j < landscape.length; j++) { // check for upcoming low
                        if (landscape[j] < landscape[i]) {
                            peak = true;
                        }
                    }
                    for (int j = i+1; j < landscape.length; j++) { // check for upcoming peak
                        if (landscape[j] > landscape[i]) {
                            peak = false;
                        }
                    }
                    if (peak) {
                        pos.add(i);
                        peaks.add(landscape[i]);
                    }
                }
                i++;
                if (i == landscape.length - 1) {
                    break;
                }
            }
            ascending = true;
        }

        Map<String,List<Integer>> listOfPeaks = new HashMap<>();
        listOfPeaks.put("pos", pos);
        listOfPeaks.put("peaks", peaks);

        return listOfPeaks;
    }
}
