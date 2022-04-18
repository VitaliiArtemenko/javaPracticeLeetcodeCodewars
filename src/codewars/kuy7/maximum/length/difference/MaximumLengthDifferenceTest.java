package maximum.length.difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthDifferenceTest {
    private final String[] ARR1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa",
            "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
    private final String[] ARR2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
    private final String[] ARR3 = {"ddlleeeegzzznccqq", "ccc", "wwrr", "ggggeettyvnn"};
    private final String[] ARR4 = {"fffqquu", "mmmmeeeeddll"};

    @Test
    void maximumLengthDifferenceTest() {
        assertEquals(13, MaximumLengthDifference.maximumLengthDifference(ARR1, ARR2));
        assertEquals(-1, MaximumLengthDifference.maximumLengthDifference(new String[] {}, new String[] {}));
        assertEquals(-1,
                MaximumLengthDifference.maximumLengthDifference(new String[] {}, new String[] {"hello"}));
        assertEquals(-1, MaximumLengthDifference.maximumLengthDifference(new String[] {"a"}, new String[] {}));
        assertEquals(10, MaximumLengthDifference.maximumLengthDifference(ARR3, ARR4));
    }
}