package descending.order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DescendingOrderTest {

    @Test
    public void testSortDesc() {
        assertEquals(0, DescendingOrder.sortDesc(0));
        assertEquals(51, DescendingOrder.sortDesc(15));
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
        assertEquals(54421, DescendingOrder.sortDesc(42145));
        assertEquals(654321, DescendingOrder.sortDesc(145263));
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}