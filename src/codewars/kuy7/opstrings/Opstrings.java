package opstrings;

import java.util.function.UnaryOperator;

public class Opstrings {

    public static String vertMirror (String string) {
        String[] words = string.split("\n");
        StringBuilder vertReversed = new StringBuilder();

        for (String word : words) {
            vertReversed.append(new StringBuilder(word).reverse()).append("\n");
        }
        return vertReversed.toString().trim();
    }

    public static String horMirror (String string) {
        String[] words = string.split("\n");
        String[] horReverse = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            horReverse[horReverse.length - 1 - i] = words[i];
        }
        return String.join("\n", horReverse);
    }

    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
