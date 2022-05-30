package pangram.checker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PangramCheckerTest {

    @Test
    public void testPangramChecker() {
        assertTrue(PangramChecker.check("The quick brown fox jumps over the lazy dog."));
        assertFalse(PangramChecker.check("You shall not pass!"));
        assertTrue(PangramChecker.check("Pack my box with five dozen liquor jugs."));
        assertTrue(PangramChecker.check("ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ"));
        assertFalse(PangramChecker.check("swfihn k uvxbo qztb ddjgmp yc e lr"));
        assertTrue(PangramChecker.check("wqutwejyhnmvnigczaofroxbjx pgsdepmkl"));
    }
}