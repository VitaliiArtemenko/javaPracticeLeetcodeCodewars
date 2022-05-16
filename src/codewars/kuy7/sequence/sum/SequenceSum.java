package sequence.sum;

import java.util.Arrays;

public class SequenceSum {

    public static int[] sumOfN(int n) {
        int[] numbers = new int[Math.abs(n) + 1];
        int sum = 0;

        if (n > 0) {
            for (int i = 0; i <= Math.abs(n); i++) {
                sum += i;
                numbers[i] = sum;
            }
        } else {
            for (int i = 0; i <= Math.abs(n); i++) {
                sum += i;
                numbers[i] = -sum;
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(11)));
    }
}
