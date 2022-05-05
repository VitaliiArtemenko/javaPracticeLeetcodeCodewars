package consonant.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConsonantValueTest {

    @Test
    public void consonantValueWithFor() {
        assertEquals(26, ConsonantValue.consonantValueWithFor("zodiacs"));
        assertEquals(80, ConsonantValue.consonantValueWithFor("chruschtschov"));
        assertEquals(38, ConsonantValue.consonantValueWithFor("khrushchev"));
        assertEquals(57, ConsonantValue.consonantValueWithFor("strength"));
        assertEquals(73, ConsonantValue.consonantValueWithFor("catchphrase"));
        assertEquals(103, ConsonantValue.consonantValueWithFor("twelfthstreet"));
        assertEquals(80, ConsonantValue.consonantValueWithFor("mischtschenkoana"));
    }

    @Test
    public void consonantValueWithStream() {
        assertEquals(26, ConsonantValue.consonantValueWithStream("zodiacs"));
        assertEquals(80, ConsonantValue.consonantValueWithStream("chruschtschov"));
        assertEquals(38, ConsonantValue.consonantValueWithStream("khrushchev"));
        assertEquals(57, ConsonantValue.consonantValueWithStream("strength"));
        assertEquals(73, ConsonantValue.consonantValueWithStream("catchphrase"));
        assertEquals(103, ConsonantValue.consonantValueWithStream("twelfthstreet"));
        assertEquals(80, ConsonantValue.consonantValueWithStream("mischtschenkoana"));
    }
}