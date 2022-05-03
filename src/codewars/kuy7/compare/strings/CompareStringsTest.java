package compare.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompareStringsTest {

    @Test
    public void compare() {
        assertTrue(CompareStrings.compare("AD", "BC"));
        assertFalse(CompareStrings.compare("AD", "DD"));
        assertTrue(CompareStrings.compare("gf", "FG"));
        assertTrue(CompareStrings.compare("zz1", ""));
        assertTrue(CompareStrings.compare("ZzZz", "ffPFF"));
        assertFalse(CompareStrings.compare("kl", "lz"));
        assertTrue(CompareStrings.compare(null, ""));
        assertTrue(CompareStrings.compare("!!", "7476"));
        assertTrue(CompareStrings.compare("##", "1176"));
        assertFalse(CompareStrings.compare(null, "BC"));
        assertTrue(CompareStrings.compare("##", "1176"));
        assertTrue(CompareStrings.compare(null, null));
        assertTrue(CompareStrings.compare("", ""));
    }
}