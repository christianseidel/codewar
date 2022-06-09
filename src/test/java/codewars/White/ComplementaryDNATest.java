package codewars.White;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplementaryDNATest {

    @Test
    public void test01() {
        Assertions.assertEquals("TTTT", ComplementaryDNA.makeComplement("AAAA"));
    }
    @Test
    public void test02() {
        assertEquals("TAACG", ComplementaryDNA.makeComplement("ATTGC"));
    }
    @Test
    public void test03() {
        assertEquals("CATA", ComplementaryDNA.makeComplement("GTAT"));
    }

}