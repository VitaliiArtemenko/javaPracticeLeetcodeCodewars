package warn.the.sheep;

import java.util.Arrays;

public class WarnTheSheep {

    public static String warnTheSheep(String[] array) {
        if (array[array.length - 1].equals("wolf")) {
            return "Pls go away and stop eating my sheep";
        } else {
            return String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!",
                    (array.length - Arrays.asList(array).indexOf("wolf") - 1));
        }
    }
}
