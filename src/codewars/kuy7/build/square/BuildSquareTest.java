package build.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuildSquareTest {

    @Test
    public void testGenerateShape() {
        assertEquals("", BuildSquare.generateShape(0));
        assertEquals("+", BuildSquare.generateShape(1));
        assertEquals("++\n++", BuildSquare.generateShape(2));
        assertEquals("+++\n+++\n+++", BuildSquare.generateShape(3));
        assertEquals("""
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++
                ++++++++++++""", BuildSquare.generateShape(12));
    }
}