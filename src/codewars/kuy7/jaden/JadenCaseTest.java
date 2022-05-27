package jaden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JadenCaseTest {

    @Test
    public void testToJadenCase1() {
        assertEquals("Most Trees Are Blue", JadenCase.toJadenCase1("most trees are blue"));
        assertEquals("Naturally Friendly Products", JadenCase.toJadenCase1("naturally friendly products"));
        assertEquals("Hello", JadenCase.toJadenCase1("hello"));
        assertNull(JadenCase.toJadenCase1(""));
        assertNull(JadenCase.toJadenCase1(null));
    }

    @Test
    public void testToJadenCase2() {
        assertEquals("Most Trees Are Blue", JadenCase.toJadenCase2("most trees are blue"));
        assertEquals("Naturally Friendly Products", JadenCase.toJadenCase2("naturally friendly products"));
        assertEquals("Hello", JadenCase.toJadenCase2("hello"));
        assertNull(JadenCase.toJadenCase2(""));
        assertNull(JadenCase.toJadenCase2(null));
    }
}