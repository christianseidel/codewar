package codewars.White;

import codewars.White.Isogram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramTest {

    @Test
    public void firstEasyTest() {
        // given
        String line = "one";
        // when
        boolean actual = Isogram.isIsogram(line);
        // then
        assertEquals(true, actual);
    }

    @Test
    public void secondEasyTest() {
        // given
        String line = "onee";
        // when
        boolean actual = Isogram.isIsogram(line);
        // then
        assertEquals(false, actual);
    }

    @Test
    public void thirdEasyTest() {
        // given
        String line = "oneE";
        // when
        boolean actual = Isogram.isIsogram(line);
        // then
        assertEquals(false, actual);
    }

    @Test
    public void FixedTests() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.isIsogram("isogram"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(false, Isogram.isIsogram("isIsogram"));
        assertEquals(false, Isogram.isIsogram("aba"));
        assertEquals(false, Isogram.isIsogram("moOse"));
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.isIsogram(""));
    }
}