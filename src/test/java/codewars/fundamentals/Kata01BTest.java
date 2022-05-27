package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata01BTest {


    @Test
    public void ShouldReturnZeroBecauseOneElementOnly() {
        assertEquals(0, Kata01B.sum(new int[] {7}));
    }

    @Test
    public void ShouldReturnZeroBecauseEmpty() {
        assertEquals(0, Kata01B.sum(new int[] {}));
    }

    @Test
    public void BasicTest() {
        assertEquals(16, Kata01B.sum(new int[] {6, 2, 1, 8, 10}));
    }

    @Test
    public void TestWithSameNumberTwiceA() {
        assertEquals(37, Kata01B.sum(new int[] {6, 11, 11, 2, 1, 8, 10}));
    }

    @Test
    public void TestWithSameNumberTwiceB() {
        assertEquals(65, Kata01B.sum(new int[] {17, 6, 11, 11, 2, 1, 8, 10, 17}));
    }

}