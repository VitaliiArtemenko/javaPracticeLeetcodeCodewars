package alphabet.war;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlphabetWarTest {

    @Test
    public void alphabetWarTests() {
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("z"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("snqmixdassckndemlinmpk"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("pplwpmxmepzlbmdwfmbgsyswvdyvqhvbjijgl"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWar("nwwjvqgqd"));
    }
}