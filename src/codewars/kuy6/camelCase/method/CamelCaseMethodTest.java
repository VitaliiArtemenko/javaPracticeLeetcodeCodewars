package camelCase.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CamelCaseMethodTest {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", CamelCaseMethod.camelCaseWithSb("test case"));
        assertEquals("TestCase", CamelCaseMethod.camelCaseWithStream("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCaseWithSb("camel case method"));
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCaseWithStream("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCaseMethod.camelCaseWithSb(" camel case word"));
        assertEquals("CamelCaseWord", CamelCaseMethod.camelCaseWithStream(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", CamelCaseMethod.camelCaseWithSb("say hello "));
        assertEquals("SayHello", CamelCaseMethod.camelCaseWithStream("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCaseMethod.camelCaseWithSb("z"));
        assertEquals("Z", CamelCaseMethod.camelCaseWithStream("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCaseMethod.camelCaseWithSb("ab  c"));
        assertEquals("AbC", CamelCaseMethod.camelCaseWithStream("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCaseMethod.camelCaseWithSb(""));
        assertEquals("", CamelCaseMethod.camelCaseWithStream(""));
    }
}