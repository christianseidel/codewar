package codewars.White;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    @Test
    public void shouldReturn0() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void shouldReturn651() {
        assertEquals(651, DescendingOrder.sortDesc(615));
    }


    @Test
    public void shouldReturn987654321() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    public void shouldReturn333() {
        assertEquals(333, DescendingOrder.sortDesc(333));
    }

    @Test
    public void shouldReturn8765532() {
        assertEquals(8765532, DescendingOrder.sortDesc(2837655));
    }
}