package disemvowel.trolls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisemvowelTrollsTest {

    @Test
    void disemvowelTrollsTests() {
        assertEquals("Ths wbst s fr lsrs LL!",
                DisemvowelTrolls.disemvowelTrolls("This website is for losers LOL!"));

        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                DisemvowelTrolls.disemvowelTrolls("No offense but,\nYour writing is among the worst I've ever read"));

        assertEquals("Wht r y,  cmmnst?", DisemvowelTrolls.disemvowelTrolls("What are you, a communist?"));

        assertEquals("NPMRLfkjNWMzlLp", DisemvowelTrolls.disemvowelTrolls("NPMRLfkjNWMzlLep"));

        assertEquals("VlgG PbwsbwBqQ rSCdcHPBkhHY",
                DisemvowelTrolls.disemvowelTrolls("VolgG PbwUsbwBqaEQ IrSCoedceiHPBAkhHYE"));
    }
}