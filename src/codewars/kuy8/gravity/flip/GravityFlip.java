package gravity.flip;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GravityFlip {
    public static int[] flipWithForLoop(char dir, int[] arr) {
        Arrays.sort(arr);
        if(dir == 'L') {
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        return arr;
    }

    public static int[] flipWithCollections(char dir, int[] arr) {
        if (dir == 'L') {
            return Arrays.stream(arr)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            Arrays.sort(arr);
            return arr;
        }
    }

    public static int[] flipWithComparator(char dir, int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(dir == 'L' ? Comparator.reverseOrder() : Comparator.comparingInt(a -> a))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
