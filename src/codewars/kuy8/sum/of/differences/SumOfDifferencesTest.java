package sum.of.differences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfDifferencesTest {

    @Test
    public void sumOfDifferencesTest() {
        assertEquals(9, SumOfDifferences.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, SumOfDifferences.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, SumOfDifferences.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[0]));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{0}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{-1}));
        assertEquals(0, SumOfDifferences.sumOfDifferences(new int[]{1}));
    }
}