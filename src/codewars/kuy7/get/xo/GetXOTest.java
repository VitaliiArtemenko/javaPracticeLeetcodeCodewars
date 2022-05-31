package get.xo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetXOTest {
    @Test
    public void testGetXO() {
        assertTrue(GetXO.getXO("xxxooo"));
        assertTrue(GetXO.getXO("xxxXooOo"));
        assertFalse(GetXO.getXO("xxx23424esdsfvxXXOOooo"));
        assertFalse(GetXO.getXO("xXxxoewrcoOoo"));
        assertFalse(GetXO.getXO("XxxxooO"));
        assertTrue(GetXO.getXO("zssddd"));
        assertFalse(GetXO.getXO("Xxxxertr34"));
        assertFalse(GetXO.getXO("ODxKoXX"));
    }
}