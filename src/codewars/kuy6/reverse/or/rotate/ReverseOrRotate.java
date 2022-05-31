package reverse.or.rotate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrRotate {
    public static String reverseOrRotate(String string, int sz) {
        if (sz <= 0 || string.length() == 0) {
            return "";
        }
        List<String> result = new ArrayList<>();

        List<String> chunks =
                Arrays.stream(string.split("(?<=\\G.{" + sz + "})"))
                .filter(el -> el.length() == sz)
                .collect(Collectors.toList());

        for (String s : chunks) {
            double numbers = Arrays.stream(s.split(""))
                    .mapToDouble(Double::parseDouble)
                    .map(el -> Math.pow(el, 3)).sum();
            if(numbers % 2 == 0) {
                result.add(new StringBuilder(s).reverse().toString());
            } else {
                result.add(s.substring(1) + s.charAt(0));
            }
        }
        return String.join("", result);
    }
}
