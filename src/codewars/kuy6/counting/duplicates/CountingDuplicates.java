package counting.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        if (text.length() == 0) {
            return 0;
        }

        List<String> letters = new ArrayList<>(Arrays.asList(text.toLowerCase().split("")));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < letters.size(); i++) {
            String temp = String.valueOf(text.toLowerCase().charAt(i));
            if (Collections.frequency(letters, temp) > 1 && !result.contains(temp)) {
                result.add(temp);
            }
        }
        return result.size();
    }
}
