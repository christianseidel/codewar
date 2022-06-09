package codewars.White;

import codewars.White.AllIntDoubled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllIntDoubledTest {
    
    @Test
    public void firstSimpleTest() {
        assertArrayEquals(new int[] {2, 4, 6}, AllIntDoubled.map(new int[] {1, 2, 3}));
    }
    
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, AllIntDoubled.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, AllIntDoubled.map(new int[] {1, 1, 1, 1, 1, 1}));
    }
}