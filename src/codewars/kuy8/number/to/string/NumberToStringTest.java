package number.to.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToStringTest {

    @Test
    void numberToString1() {
        assertEquals("67", NumberToString.numberToString1(67));
        assertEquals("88888", NumberToString.numberToString1(88888));
        assertEquals("-1", NumberToString.numberToString1(-1));
        assertEquals("0", NumberToString.numberToString1(0));
    }

    @Test
    void numberToString2() {
        assertEquals("67", NumberToString.numberToString2(67));
        assertEquals("88888", NumberToString.numberToString2(88888));
        assertEquals("-1", NumberToString.numberToString2(-1));
        assertEquals("0", NumberToString.numberToString2(0));
    }

    @Test
    void numberToString3() {
        assertEquals("67", NumberToString.numberToString3(67));
        assertEquals("88888", NumberToString.numberToString3(88888));
        assertEquals("-1", NumberToString.numberToString3(-1));
        assertEquals("0", NumberToString.numberToString3(0));
    }
}