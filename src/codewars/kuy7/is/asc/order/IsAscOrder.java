package is.asc.order;

import java.util.Arrays;

public class IsAscOrder {

    public static boolean isAscOrder(int[] arr) {
        int[] checker = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        return Arrays.equals(arr, checker);
    }
}
