package declare.winner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeclareWinnerTest {

    @Test
    public void declareWinnerTest() {
        assertEquals("Lew",
                DeclareWinner.declareWinner(new Fighter("Lew", 10, 2),
                        new Fighter("Harry", 5, 4), "Lew"));

        assertEquals("Harry",
                DeclareWinner.declareWinner(new Fighter("Lew", 10, 2),
                        new Fighter("Harry", 5, 4), "Harry"));

        assertEquals("Harald",
                DeclareWinner.declareWinner(new Fighter("Harald", 20, 5),
                        new Fighter("Harry", 5, 4), "Harry"));

        assertEquals("Harald",
                DeclareWinner.declareWinner(new Fighter("Harald", 20, 5),
                        new Fighter("Harry", 5, 4), "Harald"));

        assertEquals("Harald",
                DeclareWinner.declareWinner(new Fighter("Jerry", 30, 3),
                        new Fighter("Harald", 20, 5), "Jerry"));

        assertEquals("Harald",
                DeclareWinner.declareWinner(new Fighter("Jerry", 30, 3),
                        new Fighter("Harald", 20, 5), "Harald"));
    }
}