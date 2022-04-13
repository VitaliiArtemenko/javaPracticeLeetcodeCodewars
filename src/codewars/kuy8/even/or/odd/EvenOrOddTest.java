package even.or.odd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    @Test
    void basicTests() {
        assertEquals("Even", EvenOrOdd.evenOrOdd(6));
        assertEquals("Even", EvenOrOdd.evenOrOdd(8));
        assertEquals("Even", EvenOrOdd.evenOrOdd(123456));
        assertEquals("Even", EvenOrOdd.evenOrOdd(0));
        assertEquals("Odd", EvenOrOdd.evenOrOdd(1));
        assertEquals("Odd", EvenOrOdd.evenOrOdd(-1));
        assertEquals("Odd", EvenOrOdd.evenOrOdd(-12345));
    }
}