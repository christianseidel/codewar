package codewars.White;

import codewars.White.SumMinusBiggestAndSmallestB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMinusBiggestAndSmallestBTest {


    @Test
    public void ShouldReturnZeroBecauseOneElementOnly() {
        assertEquals(0, SumMinusBiggestAndSmallestB.sum(new int[] {7}));
    }

    @Test
    public void ShouldReturnZeroBecauseEmpty() {
        assertEquals(0, SumMinusBiggestAndSmallestB.sum(new int[] {}));
    }

    @Test
    public void BasicTest() {
        assertEquals(16, SumMinusBiggestAndSmallestB.sum(new int[] {6, 2, 1, 8, 10}));
    }

    @Test
    public void TestWithSameNumberTwiceA() {
        assertEquals(37, SumMinusBiggestAndSmallestB.sum(new int[] {6, 11, 11, 2, 1, 8, 10}));
    }

    @Test
    public void TestWithSameNumberTwiceB() {
        assertEquals(65, SumMinusBiggestAndSmallestB.sum(new int[] {17, 6, 11, 11, 2, 1, 8, 10, 17}));
    }

}