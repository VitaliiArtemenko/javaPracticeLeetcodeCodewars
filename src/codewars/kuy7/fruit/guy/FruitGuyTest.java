package fruit.guy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FruitGuyTest {

    @Test
    public void removeRotten1() {
        assertArrayEquals(new String []{"apple","banana","apple","pineapple","kiwi"},
                FruitGuy.removeRotten1(new String []{"rottenApple","rottenBanana","rottenApple",
                        "rottenPineapple","rottenKiwi"}));

        assertArrayEquals(new String[] {}, FruitGuy.removeRotten1(new String[] {}));

        assertArrayEquals(new String[] {"apple", "banana", "apple", "pineapple", "kiwi"},
                FruitGuy.removeRotten1(new String[] {"apple", "rottenBanana", "rottenApple", "pineapple", "kiwi"}));

        assertArrayEquals(new String[] {}, FruitGuy.removeRotten1(null));

        assertArrayEquals(new String[] {"tomato", "strawberry", "tomato", "apple", "apple", "kiwi", "tomato",
                "banana", "mango", "strawberry", "banana", "banana", "banana", "strawberry", "mango"},
                FruitGuy.removeRotten1(new String[] {"tomato", "strawberry", "tomato", "apple",
                "rottenApple", "kiwi", "rottenTomato", "rottenBanana", "mango", "rottenStrawberry", "banana",
                "rottenBanana", "rottenBanana", "rottenStrawberry", "rottenMango"}));
    }

    @Test
    public void removeRotten2() {
        assertArrayEquals(new String []{"apple","banana","apple","pineapple","kiwi"},
                FruitGuy.removeRotten2(new String []{"rottenApple","rottenBanana","rottenApple",
                        "rottenPineapple","rottenKiwi"}));

        assertArrayEquals(new String[] {}, FruitGuy.removeRotten2(new String[] {}));

        assertArrayEquals(new String[] {"apple", "banana", "apple", "pineapple", "kiwi"},
                FruitGuy.removeRotten2(new String[] {"apple", "rottenBanana", "rottenApple", "pineapple", "kiwi"}));

        assertArrayEquals(new String[] {}, FruitGuy.removeRotten2(null));

        assertArrayEquals(new String[] {"tomato", "strawberry", "tomato", "apple", "apple", "kiwi", "tomato",
                        "banana", "mango", "strawberry", "banana", "banana", "banana", "strawberry", "mango"},
                FruitGuy.removeRotten2(new String[] {"tomato", "strawberry", "tomato", "apple",
                        "rottenApple", "kiwi", "rottenTomato", "rottenBanana", "mango", "rottenStrawberry", "banana",
                        "rottenBanana", "rottenBanana", "rottenStrawberry", "rottenMango"}));
    }
}