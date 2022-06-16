package codewars.White;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatingAverageTest {

    @Test
    public  void myFirstTest() {
        assertEquals(4, CalculatingAverage.average(3, 4, 5));
        assertEquals(11, CalculatingAverage.average(8, 11, 14));
    }

    @Test
    public void sampleTest() {

        assertEquals(5, CalculatingAverage.average(3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3));
    }
}