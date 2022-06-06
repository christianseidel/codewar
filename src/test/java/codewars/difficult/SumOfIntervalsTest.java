package codewars.difficult;

import codewars.difficult.SumOfIntervals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfIntervalsTest {

    @Test
    public void shouldHandleThreeDisjointIntervalsInIncreasingOrder() {

        // given
        int [] a = {3, 5};
        int [] b = {6, 8};
        int [] c = {11, 15};
        int[][] firstArray = {a, b, c};
        SumOfIntervals sumIntervals = new SumOfIntervals();

        // when
        int actual = sumIntervals.sumIntervals(firstArray);

        //then
        assertEquals(8, actual);
    }

    @Test
    public void shouldHandleOneIntervalOnly() {

        // given
        int [] a = {5, 15};
        int[][] firstArray = {a};
        SumOfIntervals sumIntervals = new SumOfIntervals();

        // when
        int actual = sumIntervals.sumIntervals(firstArray);

        //then
        assertEquals(10, actual);
    }

    @Test
    public void shouldHandleDisjointIntervalsInDecreasingOrder() {

        // given
        int [] a = {50, 51};
        int [] b = {17, 30};
        int [] c = {11, 15};
        int[][] firstArray = {a, b, c};
        SumOfIntervals sumIntervals = new SumOfIntervals();

        // when
        int actual = sumIntervals.sumIntervals(firstArray);

        //then
        assertEquals(18, actual);
    }

    @Test
    public void shouldHandleFiveDisjointIntervalsInNoOrder() {

        // given
        int [] a = {7, 9};
        int [] b = {17, 30};
        int [] c = {11, 15};
        int [] d = {1, 5};
        int [] e = {80, 90};
        int[][] firstArray = {a, b, c, d, e};
        SumOfIntervals sumIntervals = new SumOfIntervals();

        // when
        int actual = sumIntervals.sumIntervals(firstArray);

        //then
        assertEquals(33, actual);
    }

    @Test
    public void shouldHandleNullOrEmptyIntervals() {
        SumOfIntervals sumIntervals = new SumOfIntervals();
        assertEquals(0, sumIntervals.sumIntervals(null));
        assertEquals(0, sumIntervals.sumIntervals(new int[][]{}));
        assertEquals(0, sumIntervals.sumIntervals(new int[][]{{4, 4}, {6, 6}, {8, 8}}));
    }

    @Test
    public void shouldHandleEmptyIntervalsAfterFullIntervals() {
        SumOfIntervals sumIntervals = new SumOfIntervals();
        assertEquals(16, sumIntervals.sumIntervals(new int[][]{{4, 5}, {0, 0}, {18, 33}}));
    }

    @Test
    public void shouldHandleIntervalOverlappingOnBothSides() {
        SumOfIntervals sumIntervals = new SumOfIntervals();
        assertEquals(8, sumIntervals.sumIntervals(new int[][]{{4, 5}, {7, 11}, {5, 12}}));
        assertEquals(8, sumIntervals.sumIntervals(new int[][]{{4, 5}, {5, 12}, {7, 11}}));
    }

    @Test
    public void shouldAddDisjointIntervals() {
        SumOfIntervals sumIntervals = new SumOfIntervals();
        assertEquals(9, sumIntervals.sumIntervals(new int[][]{{1, 2}, {6, 10}, {11, 15}}));
        assertEquals(11, sumIntervals.sumIntervals(new int[][]{{4, 8}, {9, 10}, {15, 21}}));
        assertEquals(7, sumIntervals.sumIntervals(new int[][]{{-1, 4}, {-5, -3}}));
        assertEquals(78, sumIntervals.sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));
    }

    @Test
    public void shouldAddAdjacentIntervals() {
        SumOfIntervals sumIntervals = new SumOfIntervals();
        assertEquals(54, sumIntervals.sumIntervals(new int[][]{{1, 2}, {2, 6}, {6, 55}}));
        assertEquals(23, sumIntervals.sumIntervals(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));
    }

    @Test
    public void shouldAddOverlappingIntervals() {
        SumOfIntervals sumIntervals = new SumOfIntervals();
//        assertEquals(7, sumIntervals.sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
        assertEquals(6, sumIntervals.sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
//        assertEquals(19, sumIntervals.sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
    }

    @Test
    public void shouldHandleMixedIntervals() {
        SumOfIntervals sumIntervals = new SumOfIntervals();
        assertEquals(13, sumIntervals.sumIntervals(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
        assertEquals(1234, sumIntervals.sumIntervals(new int[][]{{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}}));
        assertEquals(158, sumIntervals.sumIntervals(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26},}));
    }

}