package find.needle;

import java.util.Arrays;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}
