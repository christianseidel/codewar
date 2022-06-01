package codewars.fundamentals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AreaOrPerimeterTest {

   @Test
    public void testSomething() {
        assertEquals(16, AreaOrPerimeter.areaOrPerimeter(4 , 4));
        assertEquals(32, AreaOrPerimeter.areaOrPerimeter(6 , 10));
    }
}
