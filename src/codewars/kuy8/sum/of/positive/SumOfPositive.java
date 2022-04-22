package sum.of.positive;

import java.util.Arrays;

public class SumOfPositive {

    static int sumOfPositive(int[] arr) {
        return Arrays.stream(arr).filter(el -> el > 0).sum();
    }
}