package is.sorted.and.how;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IsSortedAndHow {

    public static String isSortedAndHow(int[] array) {
        List<Integer> digits = Arrays.stream(array).boxed().toList();

        if(Arrays.equals(array, digits.stream().sorted().mapToInt(Integer::intValue).toArray())) {
            return "yes, ascending";
        } else if (Arrays.equals(array,
                digits.stream().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray())) {
            return "yes, descending";
        } else {
            return "no";
        }
    }
}
