package square.digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitsTest {

    @Test
    void squareDigitsTest() {
        assertEquals(811181, SquareDigits.squareDigits(9119));
        assertEquals(0, SquareDigits.squareDigits(0));
        assertEquals(149162536, SquareDigits.squareDigits(123456));
        assertEquals(1, SquareDigits.squareDigits(1));
        assertEquals(1010101, SquareDigits.squareDigits(1010101));
        assertEquals(16161616, SquareDigits.squareDigits(4444));
    }
}