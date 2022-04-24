package minimum;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Minimum {

    public static int minValue(int[] values){
        return Integer.parseInt(
                Arrays.stream(values)
                .distinct()
                .sorted()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""))
        );
    }
}
