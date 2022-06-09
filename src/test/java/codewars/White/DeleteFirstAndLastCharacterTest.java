package codewars.White;

import codewars.White.DeleteFirstAndLastCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteFirstAndLastCharacterTest {
    @Test
    public void testRemoval() {
        assertEquals("loquen", DeleteFirstAndLastCharacter.remove("eloquent"));
        assertEquals("ountr", DeleteFirstAndLastCharacter.remove("country"));
        assertEquals("erso", DeleteFirstAndLastCharacter.remove("person"));
        assertEquals("lac", DeleteFirstAndLastCharacter.remove("place"));
    }
}