package array.diff;

import static java.util.Arrays.stream;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
       return stream(a).filter(num -> stream(b).noneMatch(el -> el == num)).toArray();
    }
}
