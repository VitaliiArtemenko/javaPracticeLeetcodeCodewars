package fake.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FakeBinaryTest {

    @Test
    public void testFakeBin() {
        assertEquals("00000", FakeBinary.fakeBin("00000"));
        assertEquals("11111", FakeBinary.fakeBin("55555"));
        assertEquals("0110100000001", FakeBinary.fakeBin("1594633312425"));
        assertEquals("1000111011010110001000000", FakeBinary.fakeBin("7420856358454592405134331"));
        assertEquals("0111101000110", FakeBinary.fakeBin("1885627023670"));
        assertEquals("1001001011", FakeBinary.fakeBin("6107049196"));
        assertEquals("0000000000", FakeBinary.fakeBin("1010101010"));
    }
}