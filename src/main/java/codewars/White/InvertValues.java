package codewars.White;

public class InvertValues {
/*
    Given a set of numbers, return the additive inverse of each.
    Each positive becomes negatives, and the negatives become positives.
        invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
        invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
        invert([]) == []
 */

    public static int[] invert(int[] array) {
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            output[i] = -array[i];
        }
        return output;
    }
}
