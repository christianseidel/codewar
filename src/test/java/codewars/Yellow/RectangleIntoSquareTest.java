package codewars.Yellow;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RectangleIntoSquareTest {

    @Test
    public void test1() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), RectangleIntoSquare.sqInRect(5, 3));
    }
    @Test
    public void test2() {
        assertEquals(null, RectangleIntoSquare.sqInRect(5, 5));
    }

    @Test
    public void otherTest() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(6, 5, 1, 1, 1, 1, 1)), RectangleIntoSquare.sqInRect(11, 6));
    }
}