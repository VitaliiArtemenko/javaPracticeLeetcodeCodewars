package sum.of.positive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfPositiveTest {

    @Test
    public void sumOfPositiveTests() {
        assertEquals(15, SumOfPositive.sumOfPositive(new int[]{1,2,3,4,5}));
        assertEquals(12, SumOfPositive.sumOfPositive(new int[]{1,2,-3,4,5}));
        assertEquals(0, SumOfPositive.sumOfPositive(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(0, SumOfPositive.sumOfPositive(new int[]{}));
    }
}