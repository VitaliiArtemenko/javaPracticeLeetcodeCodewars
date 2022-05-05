package name.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NameValueTest {

    @Test
    public void nameValueTests() {
        assertArrayEquals(new int[]{6,24},NameValue.nameValue(new String[]{"abc","abc abc"}));
        assertArrayEquals(new int[]{88,12,225},NameValue.nameValue(new String[]{"codewars","abc","xyz"}));
        assertArrayEquals(new int[]{351,282,330},
                NameValue.nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz","stamford bridge","haskellers"}));
        assertArrayEquals(new int[]{65, 122, 147, 372, 805, 924, 378, 1264, 774},
                NameValue.nameValue(new String[]{"cwst", "rsbv", "nnat" , "ectsczq", "xqp kolhyphbg", "attkrjlypjk",
                        "dmqkgb", "f dzgpwqzddy", "jncphhfchj"}));
        assertArrayEquals(new int[]{87},NameValue.nameValue(new String[]{"kefooot"}));
        assertArrayEquals(new int[]{87, 2},NameValue.nameValue(new String[]{"kefooot", "      a              "}));
        assertArrayEquals(new int[]{0},NameValue.nameValue(new String[]{""}));
    }
}