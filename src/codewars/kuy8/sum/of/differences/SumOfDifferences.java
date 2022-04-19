package sum.of.differences;

import java.util.Arrays;

public class SumOfDifferences {
    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1];
        }
        return sum;
    }
}
