package codewars.fundamentals;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata05Test {

    @Test
    public void testBasics()
    {
        assertThat(Kata05.basicMath("+", 4, 7), is(11));
        assertThat(Kata05.basicMath("-", 15, 18), is(-3));
        assertThat(Kata05.basicMath("*", 5, 5), is(25));
        assertThat(Kata05.basicMath("/", 49, 7), is(7));
        assertThatIllegalArgumentException()
                .isThrownBy(()-> Kata05.basicMath("l", 6, 7))
                .withMessage("Unknown operation: l");
    }
}