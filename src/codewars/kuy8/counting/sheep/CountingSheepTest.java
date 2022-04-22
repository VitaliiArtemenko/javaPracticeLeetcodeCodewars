package counting.sheep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountingSheepTest {

    @Test
    public void countingSheepTest() {
        assertEquals("", CountingSheep.countingSheep(0));
        assertEquals("1 sheep...", CountingSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", CountingSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CountingSheep.countingSheep(3));
    }
}