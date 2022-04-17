package find.position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPositionTest {

    @Test
    void findPositionTest() {
        assertEquals("Position of alphabet: 1", FindPosition.findPosition('a'));
        assertEquals("Position of alphabet: 26", FindPosition.findPosition('z'));
        assertEquals("Position of alphabet: 5", FindPosition.findPosition('e'));
    }
}