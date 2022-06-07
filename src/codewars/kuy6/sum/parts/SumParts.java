package sum.parts;

import java.util.Arrays;

public class SumParts {
    public static int[] sumParts(int[] ls) {
        int[] sums = new int[ls.length + 1];
        int sum = Arrays.stream(ls).sum();
        sums[0] = sum;

        for (int i = 1; i <= ls.length; i++) {
            sum -= ls[i - 1];
            sums[i] = sum;
        }
        return sums;
    }
}
