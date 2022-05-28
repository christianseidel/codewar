package codewars.fundamentals;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasicMathTest {

    @Test
    public void testBasics()
    {
        assertThat(BasicMath.basicMath("+", 4, 7), is(11));
        assertThat(BasicMath.basicMath("-", 15, 18), is(-3));
        assertThat(BasicMath.basicMath("*", 5, 5), is(25));
        assertThat(BasicMath.basicMath("/", 49, 7), is(7));
        assertThatIllegalArgumentException()
                .isThrownBy(()-> BasicMath.basicMath("l", 6, 7))
                .withMessage("Unknown operation: l");
    }
}