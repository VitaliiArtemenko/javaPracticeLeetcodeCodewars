package small.enough;

import java.util.Arrays;

public class SmallEnough {

    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).noneMatch(el -> el > limit);
    }
}
