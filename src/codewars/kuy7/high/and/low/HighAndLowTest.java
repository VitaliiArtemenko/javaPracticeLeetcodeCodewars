package high.and.low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighAndLowTest {

    @Test
    public void highAndLowTest() {
        assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("3 1", HighAndLow.highAndLow("1 2 3"));
        assertEquals("0 -1", HighAndLow.highAndLow("-1 -1 0"));
        assertEquals("617 -971", HighAndLow.highAndLow("364 -856 -971 350 -487 -484 617 -139 607"));
    }
}