package coin.free;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinFreeTest {
    private static final int[] COINS_1 = {1,5,10,25};
    private static final int[] COINS_2 = {1,2,5,10,20,50};

    @Test
    public void testCoinFree() {
        assertEquals(3,CoinFree.coinFree(75,COINS_1));
        assertEquals(9,CoinFree.coinFree(123,COINS_1));
        assertEquals(3,CoinFree.coinFree(75,COINS_2));
        assertEquals(5,CoinFree.coinFree(123,COINS_2));
    }

    @Test
    public void testCoinFreeUnsorted() {
        assertEquals(11614522,CoinFree.coinFree(185832307,new int[] {16, 4, 1}));
        assertEquals(6,CoinFree.coinFree(212,new int[] {256, 128, 1, 64, 2, 8, 32}));
        assertEquals(48,CoinFree.coinFree(1232,new int[] {7, 1, 3, 27}));
    }
}