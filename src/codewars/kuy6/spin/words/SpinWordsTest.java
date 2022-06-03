package spin.words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpinWordsTest {

    @Test
    public void testSpinWords() {
        assertEquals("emocleW", SpinWords.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", SpinWords.spinWords("Hey fellow warriors"));
        assertEquals("tuohtiW Core Java no one can poleved any decnavda java .snoitacilppa",
                SpinWords.spinWords("Without Core Java no one can develop any advanced java applications."));
        assertEquals("ecnavdA java is used for web desab noitacilppa and esirpretne .noitacilppa",
                SpinWords.spinWords("Advance java is used for web based application and enterprise application."));
        assertEquals("Core Java is a term used by Sun smetsysorciM to refer to the Java to dradnats noitide J2SE",
                SpinWords.spinWords("Core Java is a term used by Sun Microsystems to refer to the Java to standard edition J2SE"));
    }

    @Test
    public void testSpinWordsStream() {
        assertEquals("emocleW", SpinWords.spinWordsStream("Welcome"));
        assertEquals("Hey wollef sroirraw", SpinWords.spinWordsStream("Hey fellow warriors"));
        assertEquals("tuohtiW Core Java no one can poleved any decnavda java .snoitacilppa",
                SpinWords.spinWordsStream("Without Core Java no one can develop any advanced java applications."));
        assertEquals("ecnavdA java is used for web desab noitacilppa and esirpretne .noitacilppa",
                SpinWords.spinWordsStream("Advance java is used for web based application and enterprise application."));
        assertEquals("Core Java is a term used by Sun smetsysorciM to refer to the Java to dradnats noitide J2SE",
                SpinWords.spinWordsStream("Core Java is a term used by Sun Microsystems to refer to the Java to standard edition J2SE"));
    }
}