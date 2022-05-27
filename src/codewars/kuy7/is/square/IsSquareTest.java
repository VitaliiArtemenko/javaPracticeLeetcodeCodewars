package is.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsSquareTest {

    @Test
    public void testIsSquare() {
        assertFalse(IsSquare.isSquare(-1));
        assertTrue(IsSquare.isSquare(0));
        assertFalse(IsSquare.isSquare(3));
        assertTrue(IsSquare.isSquare(4));
        assertFalse(IsSquare.isSquare(26));
        assertTrue(IsSquare.isSquare(25));
    }
}