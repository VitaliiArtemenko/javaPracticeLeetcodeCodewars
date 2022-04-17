package abbreviate.two.words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviateTwoWordsTest {

    @Test
    void abbreviateTwoWordsTest() {
        assertEquals("S.H", AbbreviateTwoWords.abbreviateTwoWords("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbreviateTwoWords("patrick Feena"));
        assertEquals("E.C", AbbreviateTwoWords.abbreviateTwoWords("Evan coles"));
        assertEquals("P.F", AbbreviateTwoWords.abbreviateTwoWords("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbreviateTwoWords("david mendieta"));
    }
}