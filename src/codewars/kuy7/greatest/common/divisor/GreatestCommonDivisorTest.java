package greatest.common.divisor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreatestCommonDivisorTest {

    @Test
    public void greatestCommonDivisor() {
        assertEquals(6, GreatestCommonDivisor.greatestCommonDivisor(30,12));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(8,9));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1,1));
        assertEquals(591, GreatestCommonDivisor.greatestCommonDivisor(5717334,1036023));
        assertEquals(504, GreatestCommonDivisor.greatestCommonDivisor(47376,32760));
    }
}