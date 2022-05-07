package bingo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BingoOrNotTest {

    @Test
    public void testBingo() {
        assertEquals("LOSE",BingoOrNot.bingo(new int[]{1,2,3,4,5,6,7,8,9,10}));
        assertEquals("WIN",BingoOrNot.bingo(new int[]{21,13,2,7,5,14,7,15,9,10}));
        assertEquals("WIN",BingoOrNot.bingo(new int[]{14, 7, 24, 15, 3, 9, 24, 2, 2, 1}));
        assertEquals("WIN",BingoOrNot.bingo(new int[]{5, 2, 13, 7, 5, 14, 17, 15, 9, 10}));
        assertEquals("WIN",BingoOrNot.bingo(new int[]{21,13,2,7,5,14,7,15,9,10, 21,13,2,7,5,14,7,15,9,10}));
        assertEquals("LOSE",BingoOrNot.bingo(new int[]{6, 28, 5, 21, 19, 27, 5, 27, 28, 29}));
    }
}