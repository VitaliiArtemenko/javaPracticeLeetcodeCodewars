package flatten.sort.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FlattenSortArray {

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(IntStream::of).sorted().toArray();
    }
}
