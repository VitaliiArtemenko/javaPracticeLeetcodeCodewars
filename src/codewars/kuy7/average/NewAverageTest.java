package average;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewAverageTest {
    private static final int navg = 2;

    @Test
    public void newAvgTests() {
        assertEquals(149, NewAverage.newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, 30));
        assertEquals(628, NewAverage.newAvg(new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90));
        assertEquals(149, NewAverage.newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, 30));
    }

    @Test()
    public void testIllegalArgumentException1() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> NewAverage.newAvg(new double[] {14, 30, 5, 7, 9, 11, 15}, navg));
    }
}