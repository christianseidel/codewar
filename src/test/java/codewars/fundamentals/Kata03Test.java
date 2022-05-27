package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata03Test {

    @Test
    public void testBoolToWord() {
        assertEquals(Kata03.boolToWord(true),"Yes");
        assertEquals(Kata03.boolToWord(false),"No");
    }

}