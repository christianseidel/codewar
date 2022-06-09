package codewars.White;

import codewars.White.RemoveExclamationMarks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveExclamationMarksTest {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarksA("Hello World!"));
    }

    @Test
    public void testSimpleStringWithMarkInMiddle() {
        assertEquals("Let's see if this works.", RemoveExclamationMarks.removeExclamationMarksA("Let's see !if this works."));
    }

    @Test
    public void testSimpleStringWithMarkAtStart() {
        assertEquals("Let it work, too.", RemoveExclamationMarks.removeExclamationMarksA("!Let it work, too."));
    }

    // Series B
    @Test
    public void testSimpleString1B() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarksB("Hello World!"));
    }

    @Test
    public void testSimpleStringWithMarkInMiddleB() {
        assertEquals("Let's see if this works.", RemoveExclamationMarks.removeExclamationMarksA("Let's see !if this works."));
    }

    @Test
    public void testSimpleStringWithMarkAtStartB() {
        assertEquals("Let it work, too.", RemoveExclamationMarks.removeExclamationMarksA("!Let it work, too."));
    }
}