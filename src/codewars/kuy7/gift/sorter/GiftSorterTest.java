package gift.sorter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GiftSorterTest {

    @Test
    public void sortGiftCodeTest() {
        assertEquals("abcdef", GiftSorter.sortGiftCode("fedcba"));
        assertEquals("abcdefghijklmnopqrstuvwxyz", GiftSorter.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
        assertEquals("kpqsuvy", GiftSorter.sortGiftCode("pqksuvy"));
        assertEquals("abcdef", GiftSorter.sortGiftCode("abcdef"));
        assertEquals("z", GiftSorter.sortGiftCode("z"));
        assertEquals("", GiftSorter.sortGiftCode(""));
    }
}