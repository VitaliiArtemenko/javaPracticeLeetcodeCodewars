package carboat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarboatTest {

    @Test
    public void testHowMuch1() {
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]", Carboat.howMuch1(1, 100));
        assertEquals("[]", Carboat.howMuch1(2950, 2950));
        assertEquals("[[M: 9991 B: 1427 C: 1110]]", Carboat.howMuch1(10000, 9950));
    }

    @Test
    public void testHowMuch2() {
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]", Carboat.howMuch2(1, 100));
        assertEquals("[]", Carboat.howMuch2(2950, 2950));
        assertEquals("[[M: 9991 B: 1427 C: 1110]]", Carboat.howMuch2(10000, 9950));
    }
}