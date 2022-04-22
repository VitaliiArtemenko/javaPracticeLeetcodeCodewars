package convert.to.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertToBinaryTest {

    @Test
    public void convertToBinaryTest() {
        assertEquals(1, ConvertToBinary.convertToBinary(1));
        assertEquals(10, ConvertToBinary.convertToBinary(2));
        assertEquals(11, ConvertToBinary.convertToBinary(3));
        assertEquals(101, ConvertToBinary.convertToBinary(5));
        assertEquals(1011, ConvertToBinary.convertToBinary(11));
    }
}