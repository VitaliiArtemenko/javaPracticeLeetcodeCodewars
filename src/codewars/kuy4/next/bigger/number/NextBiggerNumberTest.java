package next.bigger.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextBiggerNumberTest {

    @Test
    public void nextBiggerNumber1() {
        assertEquals(21, NextBiggerNumber.nextBiggerNumber1(12));
        assertEquals(531, NextBiggerNumber.nextBiggerNumber1(513));
        assertEquals(2071, NextBiggerNumber.nextBiggerNumber1(2017));
        assertEquals(441, NextBiggerNumber.nextBiggerNumber1(414));
        assertEquals(414, NextBiggerNumber.nextBiggerNumber1(144));
        assertEquals(19009, NextBiggerNumber.nextBiggerNumber1(10990));
        assertEquals(59884848483559L, NextBiggerNumber.nextBiggerNumber1(59884848459853L));
    }

    @Test
    public void nextBiggerNumber2() {
        assertEquals(21, NextBiggerNumber.nextBiggerNumber2(12));
        assertEquals(531, NextBiggerNumber.nextBiggerNumber2(513));
        assertEquals(2071, NextBiggerNumber.nextBiggerNumber2(2017));
        assertEquals(441, NextBiggerNumber.nextBiggerNumber2(414));
        assertEquals(414, NextBiggerNumber.nextBiggerNumber2(144));
        assertEquals(19009, NextBiggerNumber.nextBiggerNumber2(10990));
        assertEquals(59884848483559L, NextBiggerNumber.nextBiggerNumber2(59884848459853L));
    }
}