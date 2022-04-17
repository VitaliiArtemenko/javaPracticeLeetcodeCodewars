package array.plus.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static int arrayPlusArray1(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }

    public static int arrayPlusArray2(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}
