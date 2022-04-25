package roman.numerals.encoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsEncoderTest {

    @Test
    public void romanNumeralsEncoder() {
        assertEquals("I", RomanNumeralsEncoder.romanNumeralsEncoder(1));
        assertEquals("II", RomanNumeralsEncoder.romanNumeralsEncoder(2));
        assertEquals("VI", RomanNumeralsEncoder.romanNumeralsEncoder(6));
        assertEquals("MMXVIII", RomanNumeralsEncoder.romanNumeralsEncoder(2018));
        assertEquals("MMMMMMMMMMMMMMMMMMMMMMMMMCXXXIV", RomanNumeralsEncoder.romanNumeralsEncoder(25134));
        assertEquals("XCIX", RomanNumeralsEncoder.romanNumeralsEncoder(99));
        assertEquals("CXI", RomanNumeralsEncoder.romanNumeralsEncoder(111));
    }
}