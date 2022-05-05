package camelCase.method;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseMethod {

    public static String camelCaseWithSb(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            if(!w.equals("")) {
                result.append(w.substring(0, 1).toUpperCase()).append(w.substring(1));
            }
        }
        return result.toString();
    }

    public static String camelCaseWithStream(String str) {
        return Arrays.stream(Arrays.stream(str.split(" ")).filter(el -> !el.equals("")).toArray(String[]::new))
                .map(c -> Character.toUpperCase(c.charAt(0)) + c.substring(1)).collect(Collectors.joining());
    }
}
