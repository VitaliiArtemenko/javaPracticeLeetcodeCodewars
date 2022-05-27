package get.middle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetMiddleTest {

    @Test
    public void testGetMiddle() {
        assertEquals("es", GetMiddle.getMiddle("test"));
        assertEquals("dd", GetMiddle.getMiddle("middle"));
        assertEquals("t", GetMiddle.getMiddle("testing"));
        assertEquals("A", GetMiddle.getMiddle("A"));
    }
}