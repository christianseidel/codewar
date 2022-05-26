package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataSumTest {


    @Test
    public void ShouldReturnZeroBecauseOneElementOnly() {
        assertEquals(0, Kata01.sum(new int[] {7}));
    }

    @Test
    public void ShouldReturnZeroBecauseEmpty() {
        assertEquals(0, Kata01.sum(new int[] {}));
    }

    @Test
    public void BasicTests() {
        assertEquals(16, Kata01.sum(new int[] { 6, 2, 1, 8, 10}));
    }

}