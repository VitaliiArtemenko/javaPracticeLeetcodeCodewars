package march.bits;

import java.util.Arrays;

public class BitMarchArray {

    public static int[][] bitMarch(int n) {
        int[][] result = new int[9 - n][8];

        for (int i = 0; i <= 8 - n; i++) {
            Arrays.fill(result[i], 8 - i - n, 8 - i, 1);
        }
        return result;
    }
}
