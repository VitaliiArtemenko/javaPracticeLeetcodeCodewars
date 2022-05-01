package decimal.digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecimalDigitsTest {

    @Test
    public void digits() {
        assertEquals(1,  DecimalDigits.Digits(5l));
        assertEquals(5,  DecimalDigits.Digits(12345l));
        assertEquals(10, DecimalDigits.Digits(9876543210l));
        assertEquals(1,  DecimalDigits.Digits(0l));
    }
}