package feast.of.beasts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeastOfBeastsTest {

    @Test
    public void feastOfBeastsTest() {
        assertTrue(FeastOfBeasts.feastOfBeasts("great blue heron", "garlic nann"));
        assertTrue(FeastOfBeasts.feastOfBeasts("chickadee", "chocolate cake"));
        assertFalse(FeastOfBeasts.feastOfBeasts("brown bear", "bear claw"));
        assertFalse(FeastOfBeasts.feastOfBeasts("Great blue heron", "garlic nann"));
    }
}