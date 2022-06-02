package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyIsogramTest {

    @Test
    public void firstEasyTest() {
        // given
        String line = "one";
        // when
        boolean actual = VerifyIsogram.isIsogram(line);
        // then
        assertEquals(true, actual);
    }

    @Test
    public void secondEasyTest() {
        // given
        String line = "onee";
        // when
        boolean actual = VerifyIsogram.isIsogram(line);
        // then
        assertEquals(false, actual);
    }

    @Test
    public void thirdEasyTest() {
        // given
        String line = "oneE";
        // when
        boolean actual = VerifyIsogram.isIsogram(line);
        // then
        assertEquals(false, actual);
    }

    @Test
    public void FixedTests() {
        assertEquals(true, VerifyIsogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, VerifyIsogram.isIsogram("isogram"));
        assertEquals(false, VerifyIsogram.isIsogram("moose"));
        assertEquals(false, VerifyIsogram.isIsogram("isIsogram"));
        assertEquals(false, VerifyIsogram.isIsogram("aba"));
        assertEquals(false, VerifyIsogram.isIsogram("moOse"));
        assertEquals(true, VerifyIsogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, VerifyIsogram.isIsogram(""));
    }
}