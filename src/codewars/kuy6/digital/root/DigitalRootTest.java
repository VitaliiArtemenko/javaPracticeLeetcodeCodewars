package digital.root;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitalRootTest {

    @Test
    public void testDigitalRoot() {
        assertEquals( 7, DigitalRoot.digitalRoot(16));
        assertEquals( 6, DigitalRoot.digitalRoot(456));
        assertEquals( 6, DigitalRoot.digitalRoot(942));
        assertEquals( 0, DigitalRoot.digitalRoot(0));
        assertEquals( 6, DigitalRoot.digitalRoot(132189));
        assertEquals( 2, DigitalRoot.digitalRoot(493193));
    }
}