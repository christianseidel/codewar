package codewars.fundamentals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheDivisorsTest {

    CountTheDivisors cd = new CountTheDivisors();

    @Test
    public void oneTest() {
        assertEquals(1, cd.numberOfDivisors(1));
    }

    @Test
    public void fourTest() {
        assertEquals(3, cd.numberOfDivisors(4));
    }

    @Test
    public void fiveTest() {
        assertEquals(2, cd.numberOfDivisors(5));
    }

    @Test
    public void twelveTest() {
        assertEquals(6, cd.numberOfDivisors(12));
    }

    @Test
    public void thirtyTest() {
        assertEquals(8, cd.numberOfDivisors(30));
    }

    @Test
    public void testHalfAMillion() {
        assertEquals(42, cd.numberOfDivisors(500000));
    }
}