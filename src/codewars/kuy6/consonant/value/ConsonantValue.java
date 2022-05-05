package consonant.value;

import java.util.Arrays;

public class ConsonantValue {

    public static int consonantValueWithFor(final String s) {
        String[] split = s.split("[aeiou]");

        int[] sum = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split[i].length(); j++) {
                sum[i] += split[i].charAt(j) - 96;
            }
        }
        return Arrays.stream(sum).max().getAsInt();
    }

    public static int consonantValueWithStream(final String s) {
        return Arrays.stream(s.split("[aeiou]")).mapToInt(el -> el.chars().map(c -> c - 96).sum()).max().orElse(0);
    }
}
