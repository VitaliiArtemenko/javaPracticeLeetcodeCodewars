package next.bigger.number;

import java.time.LocalDate;
import java.util.Arrays;

public class NextBiggerNumber {

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static long nextBiggerNumber1(long n) {
        char[] digits = String.valueOf(n).toCharArray();

        if (digits.length < 2) return -1;
        int i;

        if (digits.length == 2) {
            if(digits[0] > digits[1]) {
                return n;
            } else {
                swap(digits, 0, 1);
                return Integer.parseInt(String.valueOf(digits));
            }
        }

        for (i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) break;
        }
        if (i == 0) {
            return -1;
        } else {
            int x = digits[i - 1];
            int min = i;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] > x && digits[j] < digits[min]) {
                    min = j;
                }
            }
            swap(digits, i - 1, min);
            Arrays.sort(digits, i, digits.length);
        }
        return Long.parseLong(String.valueOf(digits));
    }

    public static long nextBiggerNumber2(long n) {
        char[] digits = String.valueOf(n).toCharArray();

        for (int i = digits.length - 2; i >= 0; i--) {
            for (int j = digits.length - 1; j > i; j--) {
                if (digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                    Arrays.sort(digits, i + 1, digits.length);
                    return Long.parseLong(String.valueOf(digits));
                }
            }
        }
        return -1;
    }
}