package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnYesOrNoTest {

    @Test
    public void testBoolToWord() {
        assertEquals(ReturnYesOrNo.boolToWord(true),"Yes");
        assertEquals(ReturnYesOrNo.boolToWord(false),"No");
    }

}