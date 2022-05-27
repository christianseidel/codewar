package codewars.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata04Test {
    @Test
    public void test1(){
        assertEquals(1234 , Kata04.stringToNumber("1234"));
    }
    @Test
    public void test2(){
        assertEquals(605 , Kata04.stringToNumber("605"));
    }
    @Test
    public void test3(){
        assertEquals(1405 , Kata04.stringToNumber("1405"));
    }
    @Test
    public void test4(){
        assertEquals(-7 , Kata04.stringToNumber("-7"));
    }
}