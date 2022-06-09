package codewars.Yellow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        Assertions.assertEquals(true, ValidParentheses.validParentheses( "()" ));
        assertEquals(false,ValidParentheses.validParentheses( "())" ));
        assertEquals(true,ValidParentheses.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,ValidParentheses.validParentheses( "(dsgdsg))2432" ));
        assertEquals(true,ValidParentheses.validParentheses( "adasdasfa" ));
    }

    @Test
    public void nextTest() {
        assertEquals(false,ValidParentheses.validParentheses( "a()b(())ccc())dd" ));
    }
}