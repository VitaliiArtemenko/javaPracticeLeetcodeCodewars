package most.digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MostDigitsTest {

    @Test
    public void findLongestTests() {
        assertEquals(100, MostDigits.findLongest(new int[] {1, 10, 100}));
        assertEquals(9000, MostDigits.findLongest(new int[] {9000, 8, 800}));
        assertEquals(900, MostDigits.findLongest(new int[]  {8, 900, 500}));
        assertEquals(40000, MostDigits.findLongest(new int[] {3, 40000, 100}));
        assertEquals(100000, MostDigits.findLongest(new int[] {1, 200, 100000}));
        assertEquals(-10, MostDigits.findLongest(new int[] {-10, 1, 0, 1, 10}));
        assertEquals(-1966180506, MostDigits.findLongest(new int[] {-456486337, -175394083, -1966180506, 2015643595}));
        assertEquals(1275620675, MostDigits.findLongest(new int[] {1275620675, 160330680, -1920342183, 1929833145,
                -198167345, 155600957, 1202099835, -1152802759, 282536524, -1154606920, -1062516432, 934978933,
                -1752640605}));
        assertEquals(2112674289, MostDigits.findLongest(new int[] {-374211365, 2112674289, 80724733, 1088646561,
                1883822032, 1209780927, -415718372, -2110881660, -516248614, -703427271, -726336225, 604663968,
                -2046766241}));

    }
}