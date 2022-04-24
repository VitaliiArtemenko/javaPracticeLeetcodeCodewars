package show.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShowSequenceTest {

    @Test
    public void showSequenceBaseTests() {
        assertEquals("0+1+2+3+4+5+6 = 21",ShowSequence.showSequence(6));
        assertEquals("0+1+2+3+4+5+6+7 = 28",ShowSequence.showSequence(7));
        assertEquals("0+1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20+21 = 231",
                ShowSequence.showSequence(21));
        assertEquals("0+1 = 1",ShowSequence.showSequence(1));
    }

    @Test
    public void showSequenceNegativeAndZeroTests() {
        assertEquals("-15<0",ShowSequence.showSequence(-15));
        assertEquals("0=0",ShowSequence.showSequence(0));
    }
}