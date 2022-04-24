package capitalize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeTest {

    @Test
    public void capitalize() {
        assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, Capitalize.capitalize("abcdef"));
        assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, Capitalize.capitalize("codewars"));
        assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, Capitalize.capitalize("abracadabra"));
        assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, Capitalize.capitalize("codewarriors"));
    }
}