package fruit.guy;

import java.util.Arrays;

public class FruitGuy {
    public static String[] removeRotten1(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) return new String[]{};

       for (int i = 0; i < fruitBasket.length; i++) {
           fruitBasket[i] = fruitBasket[i].replace("rotten", "").toLowerCase();
       }
       return fruitBasket;
    }

    public static String[] removeRotten2(String[] fruitBasket) {
        return fruitBasket == null ? new String[0]
                : Arrays.stream(fruitBasket)
                .map(el -> el.replace("rotten", "").toLowerCase())
                .toArray(String[]::new);
    }
}
