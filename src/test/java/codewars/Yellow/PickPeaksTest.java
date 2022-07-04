package codewars.Yellow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class PickPeaksTest {

    @Test
    public void myFirstTest() {

        // given
        List<Integer> pos = new ArrayList<>();
        pos.add(5);
        pos.add(10);

        List<Integer> peaks = new ArrayList<>();
        peaks.add(8);
        peaks.add(7);

        Map<String, List> myPeaks = new HashMap<>();
        myPeaks.put("pos", pos);
        myPeaks.put("peaks", peaks);

        // when
        Map<String, List<Integer>> actual = PickPeaks.getPeaks(new int[]{7, 6, 5, 4, 5, 8, 7, 6, 6, 6, 7, 7, 5, 4, 3, 6, 7, 8, 8, 8, 8});

        // then
        assertEquals(myPeaks, actual);
    }

    @Test
    public void systemTestOne() {
        // given
        List<Integer> pos = new ArrayList<>();
        pos.add(3);
        pos.add(7);

        List<Integer> peaks = new ArrayList<>();
        peaks.add(6);
        peaks.add(3);

        Map<String, List> myPeaks = new HashMap<>();
        myPeaks.put("pos", pos);
        myPeaks.put("peaks", peaks);

        assertEquals(myPeaks, PickPeaks.getPeaks(new int[]{1, 2, 3, 6, 4, 1, 2, 3, 2, 1}));
    }

    @Test
    public void systemTestTwo() {
        // given
        List<Integer> pos = new ArrayList<>();
        pos.add(3);
        pos.add(7);

        List<Integer> peaks = new ArrayList<>();
        peaks.add(6);
        peaks.add(3);

        Map<String, List> myPeaks = new HashMap<>();
        myPeaks.put("pos", pos);
        myPeaks.put("peaks", peaks);

        assertEquals(myPeaks, PickPeaks.getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3}));
    }

    @Test
    public void systemTestThree() {
        // given
        List<Integer> pos = new ArrayList<>();
        pos.add(2);

        List<Integer> peaks = new ArrayList<>();
        peaks.add(3);

        Map<String, List> myPeaks = new HashMap<>();
        myPeaks.put("pos", pos);
        myPeaks.put("peaks", peaks);

        assertEquals(myPeaks, PickPeaks.getPeaks(new int[]{2, 1, 3, 1, 2, 2, 2, 2}));
    }

    @Test
    public void testNoFour() {

        List<Integer> pos = new ArrayList<>();
        pos.add(5);
        pos.add(7);
        pos.add(9);

        List<Integer> peaks = new ArrayList<>();
        peaks.add(14);
        peaks.add(18);
        peaks.add(19);

        Map<String, List> myPeaks = new HashMap<>();
        myPeaks.put("pos", pos);
        myPeaks.put("peaks", peaks);

        assertEquals(myPeaks, PickPeaks.getPeaks(new int[]{7, -2, 3, 3, 3, 14, -2, 18, 5, 19, 12, 10, -5, 15}));

    }

}