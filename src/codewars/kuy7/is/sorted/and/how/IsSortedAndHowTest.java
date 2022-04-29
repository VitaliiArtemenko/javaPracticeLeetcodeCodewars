package is.sorted.and.how;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsSortedAndHowTest {

    @Test
    public void isSortedAndHowTest() {
        assertEquals("yes, ascending", IsSortedAndHow.isSortedAndHow(new int[] {1, 2}));
        assertEquals("yes, descending", IsSortedAndHow.isSortedAndHow(new int[] {15, 7, 3, -8}));
        assertEquals("no", IsSortedAndHow.isSortedAndHow(new int[] {4, 2, 30}));
        assertEquals("yes, ascending",
                IsSortedAndHow.isSortedAndHow(new int[] {-6798, -4007, -2974, -510, 5746, 10460, 15312}));
        assertEquals("yes, descending",
                IsSortedAndHow.isSortedAndHow(new int[] {19770, 19697, 19264, 19129, 18976, 18606, 18098, 17059,
                        15106, 15051, 14614, 14124, 14096, 13993, 13625, 13398, 10962, 10860, 10590, 9711, 9362,
                        7291, 6595, 6558, 6242, 5545, 5457, 5415, 4503, 4082, 3784, 3225, 2876, 2804, 2778, 2777,
                        2695, 2108, 1705, 1589, 1042, 744, 260, -484, -906, -1537, -1661, -1692, -2538, -4169,
                        -5502, -6371, -6410, -6882, -7452, -9582, -9985}));
    }
}