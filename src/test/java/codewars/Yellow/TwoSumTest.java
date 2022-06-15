package codewars.Yellow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void myTest() {
        assertArrayEquals(new int[]{2, 6}, TwoSum.twoSum(new int[]{11, 37, 12, 25, 45, 17, 6, 28}, 18));
    }

    @Test
    public void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    private void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = TwoSum.twoSum(numbers, target);
        if ( null == actual )
        {
            System.out.format("Received a null\n");
            assertNotNull(actual);
        }
        if ( actual.length != 2 )
        {
            System.out.format("Received an array that's not of length 2\n");
            assertTrue(false);
        }
        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }
}