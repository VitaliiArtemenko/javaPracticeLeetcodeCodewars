package maximum.multiple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxMultipleTest {
    private void test(int expected, int actual) {
        assertEquals(expected, actual);
    }

    @Test
    public void smallPositives() {
        test( 6, MaxMultiple.maxMultiple(2, 7));
        test(9, MaxMultiple.maxMultiple(3, 10));
        test(14, MaxMultiple.maxMultiple(7, 17));
    }

    @Test
    public void largerPositives() {
        test(50, MaxMultiple.maxMultiple(10, 50));
        test(185, MaxMultiple.maxMultiple(37, 200));
        test(98, MaxMultiple.maxMultiple(7, 100));
    }

    @Test
    public void randomTests() {
        test(44800, MaxMultiple.maxMultiple(200, 44816));
        test(252760, MaxMultiple.maxMultiple(284, 252937));
        test(308560, MaxMultiple.maxMultiple(152, 308632));
    }
}