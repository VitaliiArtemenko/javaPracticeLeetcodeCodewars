package find.odd;


import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    public static int findIt1(int[] a) {
        HashMap<Integer, Integer> repetitions = new HashMap<>();

        for (int el : a) {
            if (repetitions.containsKey(el)) {
                repetitions.put(el, repetitions.get(el) + 1);
            } else {
                repetitions.put(el, 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : repetitions.entrySet())
            if (set.getValue() % 2 == 1) {
                return set.getKey();
            }
        return 0;
    }

    public static int findIt2(int[] a) {
        int xor = 0;

        for (int el : a) {
            xor ^= el;
        }
        return xor;
    }
}
