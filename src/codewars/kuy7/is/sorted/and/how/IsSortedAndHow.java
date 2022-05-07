package is.sorted.and.how;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class IsSortedAndHow {

    public static String isSortedAndHow(int[] array) {
        List<Integer> digits = new ArrayList<>();
        for (int i : array) {
            Integer integer = i;
            digits.add(integer);
        }

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
