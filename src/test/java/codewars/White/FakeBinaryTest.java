package codewars.White;

import static org.junit.jupiter.api.Assertions.*;

import codewars.White.FakeBinary;
import org.junit.jupiter.api.Test;

class FakeBinaryTest {

    @Test
    public void testSingleCharacters() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("0", fakeBinary.fakeBin("0"));
        assertEquals("0", fakeBinary.fakeBin("4"));
        assertEquals("1", fakeBinary.fakeBin("5"));
        assertEquals("1", fakeBinary.fakeBin("9"));
    }

    @Test
    public void testSomething() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
    }
}