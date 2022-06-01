package digital.root;

import java.util.Arrays;

public class DigitalRoot {
    public static int digitalRoot(int n) {
        String number = String.valueOf(n);

        while (number.length() > 1) {
            int sum = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum();
            number = String.valueOf(sum);
        }
        return Integer.parseInt(number);
    }
}
