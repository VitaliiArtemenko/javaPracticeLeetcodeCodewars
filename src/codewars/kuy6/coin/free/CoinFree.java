package coin.free;

import java.util.Arrays;

public class CoinFree {

    public static int coinFree(int amount, int[] coinAmounts) {
        int coins = 0;

        Arrays.sort(coinAmounts);

        while (amount > 0) {
            for (int i = coinAmounts.length - 1; i >= 0; i--) {
                coins += amount / coinAmounts[i];
                amount -= coinAmounts[i] * (amount / coinAmounts[i]);
            }
        }
        return coins;
    }
}
