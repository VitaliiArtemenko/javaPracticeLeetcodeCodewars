package high.and.low;

import java.util.Arrays;

public class HighAndLow {

    public static String highAndLow(String numbers) {
        int[] arr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        return String.format("%1$s %2$s", arr[arr.length - 1], arr[0]);
    }
}
