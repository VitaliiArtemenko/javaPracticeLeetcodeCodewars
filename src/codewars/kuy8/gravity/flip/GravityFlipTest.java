package gravity.flip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GravityFlipTest {
    int[] input = {20, 32, 44, 24, 15, 20, 18, 49, 43, 38, 44, 31, 40, 41, 28, 44, 33, 7, 46, 45, 1, 15, 49, 13, 10, 5,
            22, 22, 44, 21, 47, 20, 1, 41, 5, 41};
    int[] output = {1, 1, 5, 5, 7, 10, 13, 15, 15, 18, 20, 20, 20, 21, 22, 22, 24, 28, 31, 32, 33, 38, 40, 41, 41, 41,
            43, 44, 44, 44, 44, 45, 46, 47, 49, 49};


    @Test
    void flipWithForLoopTest() {
        assertArrayEquals(new int[]{ 1,2,2,3 }, GravityFlip.flipWithForLoop('R', new int[]{ 3,2,1,2 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, GravityFlip.flipWithForLoop('L', new int[]{ 1,4,5,3,5 }));
        assertArrayEquals(output, GravityFlip.flipWithForLoop('R', input));
        assertArrayEquals(new int[]{ 12,1,0,0,0 }, GravityFlip.flipWithForLoop('L', new int[]{ 0, 0, 12, 0, 1 }));
    }

    @Test
    void flipWithCollectionsTest() {
        assertArrayEquals(new int[]{ 1,2,2,3 }, GravityFlip.flipWithCollections('R', new int[]{ 3,2,1,2 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, GravityFlip.flipWithCollections('L', new int[]{ 1,4,5,3,5 }));
        assertArrayEquals(output, GravityFlip.flipWithCollections('R', input));
        assertArrayEquals(new int[]{ 12,1,0,0,0 }, GravityFlip.flipWithCollections('L', new int[]{ 0, 0, 12, 0, 1 }));
    }

    @Test
    void flipWithComparatorTest() {
        assertArrayEquals(new int[]{ 1,2,2,3 }, GravityFlip.flipWithComparator('R', new int[]{ 3,2,1,2 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, GravityFlip.flipWithComparator('L', new int[]{ 1,4,5,3,5 }));
        assertArrayEquals(output, GravityFlip.flipWithComparator('R', input));
        assertArrayEquals(new int[]{ 12,1,0,0,0 }, GravityFlip.flipWithComparator('L', new int[]{ 0, 0, 12, 0, 1 }));
    }
}