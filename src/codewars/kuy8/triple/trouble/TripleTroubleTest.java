package triple.trouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TripleTroubleTest {

    @Test
    public void tripleTroubleTest() {
        assertEquals("ttlheoiscstk", TripleTrouble.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleTrouble.tripleTrouble("aa", "bb", "cc"));
        assertEquals("Batman", TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh", "euo", "xtr"));
    }
}