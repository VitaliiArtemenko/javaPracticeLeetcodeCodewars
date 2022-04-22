package small.enough;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmallEnoughTest {

    @Test
    public void smallEnoughBasicTests() {
        assertTrue(SmallEnough.smallEnough(new int[] { 66, 101 }, 200));
        assertFalse(SmallEnough.smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100));
        assertTrue(SmallEnough.smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107));
        assertTrue(SmallEnough.smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120));
    }

    @Test
    public void smallEnoughExtendedTests() {
        assertFalse(SmallEnough.smallEnough(new int[] { 1, 1, 1, 1, 1, 2 }, 1));
        assertFalse(SmallEnough.smallEnough(new int[] { 78, 33, 22, 44, 88, 9, 6 }, 87));
        assertFalse(SmallEnough.smallEnough(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 0));
        assertTrue(SmallEnough.smallEnough(new int[] { 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 }, 12));
    }

    @Test
    public void smallEnoughRandomTests() {
        assertTrue(SmallEnough.smallEnough(new int[] { 33, 154, 104, 188, 188, 146, 176, 85, 39, 137, 74 }, 193));

        assertFalse(SmallEnough.smallEnough(new int[] { 49, 62, 14, 187, 41, 157, 82, 167, 83, 12, 114, 59, 2, 162,
                165, 49, 145, 181, 155, 156, 155, 60, 103, 8, 121, 73, 192, 157, 111, 116, 131, 187, 76, 107, 57,
                71, 165, 110, 57, 107, 109, 190, 1, 195, 178, 85, 110, 43, 198, 89, 38, 159, 41, 27, 118, 155, 168,
                92, 13, 105, 44, 110, 140, 200, 25, 32, 96, 193, 89, 28, 62, 13, 117, 163, 193, 67, 119, 176, 51, 6,
                151, 113, 102, 194, 88, 185, 62, 47, 166, 67, 157, 62, 15, 114, 154, 24 }, 182));

        assertFalse(SmallEnough.smallEnough(new int[] { 90, 165, 124, 131, 61, 185, 96, 193, 158, 29, 135, 124, 180,
                114, 89, 181, 163, 165, 41, 187, 195, 58, 128, 10, 15, 140, 131, 177, 157, 105, 59, 161, 109, 67, 21,
                170, 55, 177, 102, 24, 45, 12, 61, 162, 90, 189, 189, 155, 135, 60, 29, 73, 192, 75, 61, 83, 55, 169,
                119, 128, 60, 186, 104, 66, 199, 139, 114, 26, 180, 124, 143, 21, 106, 183 }, 193));
    }
}