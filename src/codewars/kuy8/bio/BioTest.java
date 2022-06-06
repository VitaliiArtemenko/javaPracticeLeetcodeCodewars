package bio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BioTest {

    @Test
    public void testDnaToRna() {
        assertEquals("UUUU", Bio.dnaToRna("TTTT"));
        assertEquals("GCAU", Bio.dnaToRna("GCAT"));
        assertEquals("GACCGCCGCC", Bio.dnaToRna("GACCGCCGCC"));
        assertEquals("UUUUUUUUU", Bio.dnaToRna("UTUTUTUTU"));
        assertEquals("12346UU", Bio.dnaToRna("12346TT"));
    }
}