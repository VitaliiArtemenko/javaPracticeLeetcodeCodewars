package march.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BitMarchArrayTest {

    @Test
    public void testBitMarch1() {
        int[][] bits = {
                {0, 0, 0, 1, 1, 1, 1, 1, },
                {0, 0, 1, 1, 1, 1, 1, 0, },
                {0, 1, 1, 1, 1, 1, 0, 0, },
                {1, 1, 1, 1, 1, 0, 0, 0, },

        };
        int[][] chosenBits = BitMarchArray.bitMarch(5);
        assertNotNull(chosenBits);
        assertEquals(4, chosenBits.length);
        assertEquals(0, chosenBits[2][7]);
        assertNotEquals(chosenBits[0], chosenBits[1]);
        assertNotEquals(chosenBits[2], chosenBits[3]);
        assertNotNull(chosenBits);
        assertArrayEquals(bits, chosenBits);
    }

    @Test
    public void testBitMarch2() {
        int[][] bits = {
                {0, 1, 1, 1, 1, 1, 1, 1, },
                {1, 1, 1, 1, 1, 1, 1, 0, },
        };
        int[][] chosenBits = BitMarchArray.bitMarch(7);
        assertNotNull(chosenBits);
        assertEquals(2, chosenBits.length);
        assertEquals(0, chosenBits[1][7]);
        assertNotEquals(chosenBits[0], chosenBits[1]);
        assertNotNull(chosenBits);
        assertArrayEquals(bits, chosenBits);
    }
    @Test
    public void testBitMarch3() {
        int[][] bits = {
                {1, 1, 1, 1, 1, 1, 1, 1, },
        };
        int[][] chosenBits = BitMarchArray.bitMarch(8);
        assertNotNull(chosenBits);
        assertEquals(1, chosenBits.length);
        assertEquals(1, chosenBits[0][7]);
        assertNotNull(chosenBits);
        assertArrayEquals(bits, chosenBits);
    }
}