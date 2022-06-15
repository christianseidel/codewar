package codewars.Yellow;

import java.util.ArrayList;
import java.util.Collections;

public class SortTheOdd {
    /*  You will be given an array of numbers. You have to sort the
    odd numbers in ascending order while leaving the even numbers
    at their original positions.

    Examples
        [7, 1]  =>  [1, 7]
        [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
    */

    public static int[] sortArray(int[] array) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int number : array) {
            if (number % 2 == 1) {
                oddNumbers.add(number);
            }
        }

        Collections.sort(oddNumbers);

        for (int i = 0, iOdd = 0; i < array.length; i++)
            if (array[i] % 2 == 1) {
                array[i] = oddNumbers.get(iOdd);
                iOdd++;
            }
        return array;
    }
}
