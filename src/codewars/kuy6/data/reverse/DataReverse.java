package data.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DataReverse {

    public static int[] dataReverse(int[] data) {
        ArrayList<int[]> reversed = new ArrayList<>();

        for (int i = 0; i < data.length; i += 8) {
            reversed.add(Arrays.copyOfRange(data, i, i + 8));
        }
        Collections.reverse(reversed);

        return reversed.stream().flatMapToInt(Arrays::stream).toArray();
    }
}
