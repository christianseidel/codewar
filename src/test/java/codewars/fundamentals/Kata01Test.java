package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata01Test {


    @Test
    public void ShouldReturnZeroBecauseOneElementOnly() {
        assertEquals(0, Kata01.sum01(new int[] {7}));
    }

    @Test
    public void ShouldReturnZeroBecauseEmpty() {
        assertEquals(0, Kata01.sum01(new int[] {}));
    }

    @Test
    public void BasicTest() {
        assertEquals(16, Kata01.sum01(new int[] {6, 2, 1, 8, 10}));
    }

    @Test
    public void TestWithSameNumberTwiceA() {
        assertEquals(37, Kata01.sum01(new int[] {6, 11, 11, 2, 1, 8, 10}));
    }

    @Test
    public void TestWithSameNumberTwiceB() {
        assertEquals(65, Kata01.sum01(new int[] {17, 6, 11, 11, 2, 1, 8, 10, 17}));
    }

}