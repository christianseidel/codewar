package codewars.White;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValdidatePINTest {

    @Test
    public void validPins() {
        assertEquals(true, ValidatePIN.validatePin("1234"));
        assertEquals(true, ValidatePIN.validatePin("0000"));
        assertEquals(true, ValidatePIN.validatePin("1111"));
        assertEquals(true, ValidatePIN.validatePin("123456"));
        assertEquals(true, ValidatePIN.validatePin("098765"));
        assertEquals(true, ValidatePIN.validatePin("000000"));
        assertEquals(true, ValidatePIN.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, ValidatePIN.validatePin("a234"));
        assertEquals(false, ValidatePIN.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, ValidatePIN.validatePin("1"));
        assertEquals(false, ValidatePIN.validatePin("12"));
        assertEquals(false, ValidatePIN.validatePin("123"));
        assertEquals(false, ValidatePIN.validatePin("12345"));
        assertEquals(false, ValidatePIN.validatePin("1234567"));
        assertEquals(false, ValidatePIN.validatePin("-1234"));
        assertEquals(false, ValidatePIN.validatePin("1.234"));
        assertEquals(false, ValidatePIN.validatePin("00000000"));
    }
}