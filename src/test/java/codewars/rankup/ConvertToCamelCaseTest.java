package codewars.rankup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToCamelCaseTest {

    @Test
    public void testSimplLine() {
        // given
        String a = "the_great_barrier-reef";
        // when
        String out = ConvertToCamelCase.toCamelCase(a);
        // then
        assertEquals("theGreatBarrierReef", out);
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertToCamelCase.toCamelCase(input));
    }
}