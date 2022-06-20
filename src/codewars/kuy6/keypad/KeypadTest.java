package keypad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KeypadTest {

    @Test
    public void simpleTest() {
        assertEquals(9, Keypad.presses("LOL"));
        assertEquals(13, Keypad.presses("HOW R U"));
    }

    @Test
    public void randomStrings() {
        assertEquals(39, Keypad.presses("OQhWSi'Om@WITGeIgJeSA"));
        assertEquals(54, Keypad.presses("Iy$p!PTm:XmhPNSsQm:SbFvbCU*KO"));
        assertEquals(55, Keypad.presses("!X$iMTaRi'Xoa#hvHNFeoIu$DMiVZ"));
        assertEquals(13, Keypad.presses("Ou@FSM"));
        assertEquals(17, Keypad.presses("                 "));
        assertEquals(0, Keypad.presses(""));
    }

    @Test
    public void specialCharacters() {
        assertEquals(2, Keypad.presses("*#"));
    }

    @Test
    public void caseInsensitive() {
        assertEquals(9, Keypad.presses("lol"));
        assertEquals(13, Keypad.presses("hello"));
    }

    @Test
    public void singleDigits() {
        assertEquals(1, Keypad.presses("1"));
        assertEquals(2, Keypad.presses("0"));
        assertEquals(4, Keypad.presses("5"));
        assertEquals(5, Keypad.presses("9"));
    }

    @Test
    public void numericInputs() {
        assertEquals(47, Keypad.presses("WHERE DO U WANT 2 MEET L8R"));
    }

    @Test
    public void punctuation() {
        assertEquals(1, Keypad.presses("A,!£$@:"));
    }
}
