package vowel.count;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VowelCountTest {

    @Test
    public void vowelCountTest() {
        assertEquals(5, VowelCount.vowels("abracadabra"));
        assertEquals(4, VowelCount.vowels("pear tree"));
        assertEquals(0, VowelCount.vowels(""));
    }
}