package reversed.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedStringsTest {

    @Test
    void reversedStringsTests() {
        assertEquals("dlrow", ReversedStrings.reversedStrings("world"));
        assertEquals("a", ReversedStrings.reversedStrings("a"));
        assertEquals("redliuBgnirtS ssalC", ReversedStrings.reversedStrings("Class StringBuilder"));
        assertEquals("avaJ", ReversedStrings.reversedStrings("Java"));
        assertEquals("HELLO", ReversedStrings.reversedStrings("OLLEH"));
    }
}