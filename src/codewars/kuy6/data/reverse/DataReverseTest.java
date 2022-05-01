package data.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataReverseTest {
    private static final int[] INPUT_1 = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
    private static final int[] EXPECTED_1 = {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
    private static final int[] INPUT_2 = {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
    private static final int[] EXPECTED_2 = {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
    private static final int[] INPUT_3 = {0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0,
            1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0,
            0, 0, 1, 0};
    private static final int[] EXPECTED_3 = {0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1,
            0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0,
            1, 1, 1, 1, 0};

    @Test
    public void dataReverse() {
        assertArrayEquals(EXPECTED_1, DataReverse.dataReverse(INPUT_1));
        assertArrayEquals(EXPECTED_2, DataReverse.dataReverse(INPUT_2));
        assertArrayEquals(EXPECTED_3, DataReverse.dataReverse(INPUT_3));
    }
}