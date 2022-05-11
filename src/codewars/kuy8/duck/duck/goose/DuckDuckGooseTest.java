package duck.duck.goose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuckDuckGooseTest {
    Player[] players = Player.makePlayerArr(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});

    @Test
    public void duckDuckGoose() {
        assertEquals("a", DuckDuckGoose.duckDuckGoose(players, 1));
        assertEquals("c", DuckDuckGoose.duckDuckGoose(players, 3));
        assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 10));
        assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 20));
        assertEquals("z", DuckDuckGoose.duckDuckGoose(players, 30));
        assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 18));
        assertEquals("g", DuckDuckGoose.duckDuckGoose(players, 28));
        assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 12));
        assertEquals("b", DuckDuckGoose.duckDuckGoose(players, 2));
        assertEquals("f", DuckDuckGoose.duckDuckGoose(players, 7));
    }
}