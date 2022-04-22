package is.asc.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsAscOrderTest {

    @Test
    public void arrayOf2Integers() {
        assertTrue(IsAscOrder.isAscOrder(new int[] {1, 2}));
        assertFalse(IsAscOrder.isAscOrder(new int[] {2, 1}));
    }

    @Test
    public void arrayOf3Integers() {
        assertTrue(IsAscOrder.isAscOrder(new int[] {1, 2, 3}));
        assertFalse(IsAscOrder.isAscOrder(new int[] {1, 3, 2}));
        assertTrue(IsAscOrder.isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
        assertFalse(IsAscOrder.isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
    }

    @Test
    public void moreAdvancedCases() {
        assertTrue(IsAscOrder.isAscOrder(new int[] {1, 4, 13, 97, 508, 1047, 20058}));
        assertFalse(IsAscOrder.isAscOrder(new int[] {56, 98, 123, 67, 742, 1024, 32, 90969}));
    }
}