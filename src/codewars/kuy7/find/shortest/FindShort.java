package find.shortest;

import java.util.Arrays;

public class FindShort {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().orElse(0);
    }
}
