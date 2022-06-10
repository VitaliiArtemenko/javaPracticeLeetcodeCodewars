package pair.gloves;

import java.util.HashMap;
import java.util.Map;

public class PairGloves {
    public static int numberOfPairs(String[] gloves) {
        HashMap<String, Integer> pairs = new HashMap<>();
        int numberOfPairs = 0;

        for (String color : gloves) {
            pairs.merge(color, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> set : pairs.entrySet()) {
            if (set.getValue() > 1) {
                numberOfPairs += set.getValue() / 2;
            }
        }
        return numberOfPairs;
    }
}
