package jaden;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public static String toJadenCase1(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        StringBuilder result = new StringBuilder();

        for (String s : phrase.split(" ")) {
            result.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return result.toString().trim();
    }

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        return Arrays.stream(phrase.split(" "))
                .map(el -> el.substring(0, 1).toUpperCase() + el.substring(1))
                .collect(Collectors.joining(" "));
    }

}
