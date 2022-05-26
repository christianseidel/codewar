package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata02Test {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Kata02.removeExclamationMarksA("Hello World!"));
    }

    @Test
    public void testSimpleStringWithMarkInMiddle() {
        assertEquals("Let's see if this works.", Kata02.removeExclamationMarksA("Let's see !if this works."));
    }

    @Test
    public void testSimpleStringWithMarkAtStart() {
        assertEquals("Let it work, too.", Kata02.removeExclamationMarksA("!Let it work, too."));
    }

    // Series B
    @Test
    public void testSimpleString1B() {
        assertEquals("Hello World", Kata02.removeExclamationMarksB("Hello World!"));
    }

    @Test
    public void testSimpleStringWithMarkInMiddleB() {
        assertEquals("Let's see if this works.", Kata02.removeExclamationMarksA("Let's see !if this works."));
    }

    @Test
    public void testSimpleStringWithMarkAtStartB() {
        assertEquals("Let it work, too.", Kata02.removeExclamationMarksA("!Let it work, too."));
    }
}