package pair.gloves;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PairGlovesTest {

    @Test
    public void testNumberOfPairs() {
        assertEquals(0, PairGloves.numberOfPairs(new String[] {}));
        assertEquals(1, PairGloves.numberOfPairs(new String[] {"red", "red"}));
        assertEquals(0, PairGloves.numberOfPairs(new String[] {"red", "green", "blue"}));
        assertEquals(3, PairGloves.numberOfPairs(new String[] {"gray", "black", "purple", "purple", "gray", "black"}));
        assertEquals(4, PairGloves.numberOfPairs(new String[] {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"}));
    }
}
