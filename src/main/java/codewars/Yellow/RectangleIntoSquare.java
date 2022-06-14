package codewars.Yellow;

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquare {
    /*  Your task is to cut a given "true" rectangle into squares ("true" rectangle
    meaning that the two dimensions are different).
    You will be given two dimensions
        a positive integer length
        a positive integer width

    You will return a collection with the size of each of the squares.
    Examples in general form:
        sqInRect(5, 3) should return [3, 2, 1, 1]
        sqInRect(3, 5) should return [3, 2, 1, 1]
    */

	public static List<Integer> sqInRect(int lng, int wdth) {

		if (lng == wdth) return null;

		ArrayList<Integer> solution = new ArrayList<Integer>();
		while (Math.min(lng, wdth) > 0) {
			int tmp = Math.min(lng, wdth);
			solution.add(tmp);
			if (lng > wdth) lng -= tmp;
			else wdth -= tmp;
		}
		return solution;
	}
}