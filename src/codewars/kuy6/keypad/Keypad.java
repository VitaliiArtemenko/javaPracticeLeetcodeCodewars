package keypad;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Keypad {
    public static int presses(String phrase) {
        Map<Integer, Character[]> keys = new HashMap<>();
        keys.put(1, new Character[] {'A','D','G','J','M','P','T','W','*','#',' ','1'});
        keys.put(2, new Character[] {'B','E','H','K','N','Q','U','X','0'});
        keys.put(3, new Character[] {'C','F','I','L','O','R','V','Y'});
        keys.put(4,new Character[] {'S','Z','2','3','4','5','6','8'});
        keys.put(5, new Character[] {'7','9'});
        int taps = 0;

        for (char c : phrase.toCharArray()) {
            for (Map.Entry<Integer, Character[]> set : keys.entrySet()) {
                if (Arrays.asList(set.getValue()).contains(Character.toUpperCase(c))) {
                    taps += set.getKey();
                }
            }
        }
        return taps;
    }
}
