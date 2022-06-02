package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {

    @Test
    public void firstSimpleTest() {
        assertEquals(3, ShortestWord.findShort("Was geht"));
        assertEquals(3, ShortestWord.findShort("Geht was"));
    }

    @Test
    public void secondSimpleTest() {
     assertEquals(5, ShortestWord.findShort("Warum vielleicht jetzt niemand singen sollte."));
    }

    @Test
    public void findShort() throws Exception {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
    }

}