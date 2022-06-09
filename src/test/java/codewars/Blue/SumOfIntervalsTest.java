package codewars.Blue;

import org.junit.jupiter.api.Test;

import static codewars.Blue.SumOfIntervals.sumIntervals;
import static org.junit.jupiter.api.Assertions.*;

class SumOfIntervalsTest {

    @Test
    public void shouldHandleThreeDisjointIntervalsInIncreasingOrder() {

        // given
        int[] a = {3, 5};
        int[] b = {6, 8};
        int[] c = {11, 15};
        int[][] firstArray = {a, b, c};
        // SumOfIntervals sumIntervals = new SumOfIntervals();

        // when
        int actual = sumIntervals(firstArray);

        //then
        assertEquals(8, actual);
    }

    @Test
    public void shouldHandleOneIntervalOnly() {

        // given
        int[] a = {5, 15};
        int[][] firstArray = {a};

        // when
        int actual = sumIntervals(firstArray);

        //then
        assertEquals(10, actual);
    }

    @Test
    public void shouldHandleDisjointIntervalsInDecreasingOrder() {

        // given
        int[] a = {50, 51};
        int[] b = {17, 30};
        int[] c = {11, 15};
        int[][] firstArray = {a, b, c};

        // when
        int actual = sumIntervals(firstArray);

        //then
        assertEquals(18, actual);
    }

    @Test
    public void shouldHandleFiveDisjointIntervalsInNoOrder() {

        // given
        int[] a = {7, 9};
        int[] b = {17, 30};
        int[] c = {11, 15};
        int[] d = {1, 5};
        int[] e = {80, 90};
        int[][] firstArray = {a, b, c, d, e};

        // when
        int actual = sumIntervals(firstArray);

        //then
        assertEquals(33, actual);
    }

    @Test
    public void shouldHandleNullOrEmptyIntervals() {
        assertEquals(0, sumIntervals(null));
        assertEquals(0, sumIntervals(new int[][]{}));
        assertEquals(0, sumIntervals(new int[][]{{4, 4}, {6, 6}, {8, 8}}));
    }

    @Test
    public void shouldHandleEmptyIntervalsAfterFullIntervals() {
        assertEquals(16, sumIntervals(new int[][]{{4, 5}, {0, 0}, {18, 33}}));
    }

    @Test
    public void shouldHandleIntervalOverlappingOnBothSides() {
        assertEquals(8, sumIntervals(new int[][]{{4, 5}, {7, 11}, {5, 12}}));
    }

    @Test
    public void shouldAddDisjointIntervals() {
        assertEquals(9, sumIntervals(new int[][]{{1, 2}, {6, 10}, {11, 15}}));
        assertEquals(11, sumIntervals(new int[][]{{4, 8}, {9, 10}, {15, 21}}));
        assertEquals(7, sumIntervals(new int[][]{{-1, 4}, {-5, -3}}));
        assertEquals(78, sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));
    }

    @Test
    public void shouldAddAdjacentIntervals() {
        assertEquals(54, sumIntervals(new int[][]{{1, 2}, {2, 6}, {6, 55}}));
        assertEquals(23, sumIntervals(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));
    }

    @Test
    public void shouldAddOverlappingIntervals() {
        assertEquals(7, sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
        assertEquals(6, sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
        assertEquals(19, sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
    }

    @Test
    public void shouldHandleMixedIntervals() {
        assertEquals(13, sumIntervals(new int[][]{{2, 5}, {-1, 2}, {-40, -35}, {6, 8}}));
        assertEquals(1234, sumIntervals(new int[][]{{-7, 8}, {-2, 10}, {5, 15}, {2000, 3150}, {-5400, -5338}}));
        assertEquals(158, sumIntervals(new int[][]{{-101, 24}, {-35, 27}, {27, 53}, {-105, 20}, {-36, 26},}));
    }

    @Test
    public void shouldHandleMoreComplexSetOfOverlappingIntervals() {

        assertEquals(7, sumIntervals(new int[][]{{7, 10}, {3, 5}, {1, 4}}));
        assertEquals(6, sumIntervals(new int[][]{{5, 8}, {3, 6}, {1, 2}}));
        assertEquals(19, sumIntervals(new int[][]{{1, 6}, {5, 11}, {16, 19}, {10, 20}, {1, 5}}));
    }

    @Test
    public void shouldHandleNextSetOfIntervals() {
        assertEquals(7, sumIntervals(new int[][]{{1, 4}, {3, 5}, {7, 10}}));
        assertEquals(6, sumIntervals(new int[][]{{1, 2}, {3, 6}, {5, 8}}));
        assertEquals(5, sumIntervals(new int[][]{{3, 6}, {6, 8}}));
        assertEquals(19, sumIntervals(new int[][]{{1, 5}, {1, 6}, {5, 11}, {10, 20}, {16, 19}}));
        assertEquals(10, sumIntervals(new int[][]{{1, 5}, {5, 6}, {6, 11}}));
    }

    @Test
    public void shouldHandleRandomIntervals() {
        assertEquals(19699, sumIntervals(new int[][]{{1455, 2624}, {-3285, 1757}, {-7957, 707}, {2331, 6595}, {-9249, -7855}, {-6583, -4955}, {-3305, -1672}, {-8247, 2141}, {-5146, -1721}, {-7286, 6368}, {-9007, -952}, {1566, 9629}, {3450, 8071}, {1536, 6567}, {-6716, 247}, {-4576, 1741}, {-8236, 6077}, {1017, 6909}, {-1337, 1737}, {-6381, 2915}, {-5684, -4414}, {-9893, -5185}, {-4351, -4099}, {-7472, -5077}, {-6574, 6595}, {-2698, 585}, {-2856, 6786}, {4545, 9806}, {-1227, 4283}, {-7015, 6531}, {-9857, -1884}, {-5233, 1666}, {-8355, -2730}, {586, 4077}, {-8609, 6885}, {-743, -622}}));
    }

    @Test
    public void shouldHandleIntervalsBelowZero() {
        assertEquals(800, sumIntervals(new int[][]{{-400, -200}, {-300, 300}, {-500, 300}, {-50, 50}}));

    }

    @Test
    public void shouldHandleTheseIntervals() {
        assertEquals(20, sumIntervals(new int[][]{{10, 30}}));

    }

}