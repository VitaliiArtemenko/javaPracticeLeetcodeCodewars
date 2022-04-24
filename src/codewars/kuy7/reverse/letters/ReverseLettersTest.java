package reverse.letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseLettersTest {

    @Test
    public void reverseLetterTests() {
        assertEquals("nahsirk", ReverseLetters.reverseLetter("krishan"));
        assertEquals("nortlu", ReverseLetters.reverseLetter("ultr53o?n"));
        assertEquals("cba", ReverseLetters.reverseLetter("ab23c"));
        assertEquals("nahsirk", ReverseLetters.reverseLetter("krish21an"));
        assertEquals("elfjqgcayqwzzyhssowjhcvkrenunschhz",
                ReverseLetters.reverseLetter("zhhc|sn9une.rkvchjwos8sh yz8z}wqya#cg.qjfle."));
        assertEquals("wdvbbcaxkerssmoswroyowtedgqldovsvgalvqneolkqird",
                ReverseLetters.reverseLetter("dri.qk#l-oen,qvl8agvsv-od!l6qgd=et4woy+orw4so\\ms{s\\r]ek|xac2bb9vdw"));
    }
}