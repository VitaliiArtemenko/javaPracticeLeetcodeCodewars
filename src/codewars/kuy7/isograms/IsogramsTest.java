package isograms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsogramsTest {

    @Test
   public void testIsIsogram() {
        assertTrue(Isograms.isIsogram("Dermatoglyphics"));
        assertTrue(Isograms.isIsogram("isogram"));
        assertFalse(Isograms.isIsogram("moose"));
        assertFalse(Isograms.isIsogram("isIsogram"));
        assertFalse(Isograms.isIsogram("aba"));
        assertFalse(Isograms.isIsogram("moOse"));
        assertTrue(Isograms.isIsogram("thumbscrewjapingly"));
        assertTrue(Isograms.isIsogram(""));
    }
}