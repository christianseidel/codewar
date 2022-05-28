package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberTest {
    @Test
    public void test1(){
        assertEquals(1234 , StringToNumber.stringToNumber("1234"));
    }
    @Test
    public void test2(){
        assertEquals(605 , StringToNumber.stringToNumber("605"));
    }
    @Test
    public void test3(){
        assertEquals(1405 , StringToNumber.stringToNumber("1405"));
    }
    @Test
    public void test4(){
        assertEquals(-7 , StringToNumber.stringToNumber("-7"));
    }
}